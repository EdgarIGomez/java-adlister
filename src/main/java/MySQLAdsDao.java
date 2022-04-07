import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import config.Config;

public class MySQLAdsDao implements Ads{

    private Connection connection;
    private List<Ad> ads;

    public MySQLAdsDao() throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUsername(),
                Config.getPassword()
        );

    }

    public List<Ad> all() throws SQLException {
        if(ads == null){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads;");
            ads = new ArrayList<>();
            while(rs.next()){
                ads.add(new Ad(rs.getInt("id"), rs.getInt("user_id"), rs.getString("title"), rs.getString("description")));

            }
            return ads;
        }
        return ads;
    }


    public Long insert(Ad ad) {
            return null;
    }
}
