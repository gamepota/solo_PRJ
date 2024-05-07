CREATE DATABASE PRJ;

USE PRJ;
DROP TABLE player;
CREATE TABLE player
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    nickName VARCHAR(200) NOT NULL,
    ancestry VARCHAR(50)  NOT NULL,
    classes  VARCHAR(50)  NOT NULL,
    level    INT          NOT NULL,
    religion VARCHAR(50)  NOT NULL


);

