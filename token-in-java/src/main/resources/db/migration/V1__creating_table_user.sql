USE token_in_java;
CREATE TABLE user(
    id_user INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    description VARCHAR(500),
    user_status BIT NOT NULL
);