USE adlister_db;

CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(75) NOT NULL,
    password VARCHAR(50) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (username, email)
);

CREATE TABLE IF NOT EXISTS ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(75) NOT NULL,
    descrption VARCHAR(200) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (username, email, password)
    VALUES ('test', 'test@email.com', 'pass123');

INSERT INTO ads (user_id, title, description)
    VALUES (1, 'first', 'first ad on the table'),
           (1, 'second', 'second ad on the table');