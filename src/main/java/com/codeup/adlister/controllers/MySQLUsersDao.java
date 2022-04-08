package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import config.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }

    }

    public List<User> all() {
        PreparedStatement stmt = null;
        String query = "SELECT * FROM users";
        try {
            stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            return createUsersFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all users.", e);
        }
    }

    public User findByUsername(String username) {
        PreparedStatement stmt;
        String query = "SELECT * FROM users WHERE username = ?";
        String user = username;
        List<User> searchResults = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, user);
            ResultSet rs = stmt.executeQuery();
            searchResults =  createUsersFromResults(rs);
            return searchResults.get(0);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user.", e);
        }
    }


    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    private String createInsertQuery(User user) {
        return "INSERT INTO users(username, email, password) VALUES "
                + "('" + user.getUsername() + "', "
                + "'" + user.getEmail() +"', "
                + "'" + user.getPassword() + "')";
    }

    private User createUserFromResults(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }
    private List<User> createUsersFromResults(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            users.add(createUserFromResults(rs));
        }
        return users;
    }
}
