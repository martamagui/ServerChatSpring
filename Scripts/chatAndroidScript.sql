/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
CREATE DATABASE IF NOT EXISTS chatAndroid DEFAULT CHARACTER SET utf8mb4;
USE chatAndroid;
DROP TABLE IF EXISTS msg;
DROP TABLE IF EXISTS users;
CREATE TABLE `users` (
  `userId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;
CREATE TABLE `msg` (
  `msgId` int NOT NULL AUTO_INCREMENT,
  `userIdFK` int(255) COLLATE latin1_spanish_ci NOT NULL,
  `text` TEXT COLLATE latin1_spanish_ci DEFAULT NULL,
  `date` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`msgId`),
  FOREIGN KEY (`userIdFK`) REFERENCES users(`userId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;
INSERT INTO
  users(userId, name)
VALUES('0', 'Usuario'),('1', 'Francisca'),('2', 'Roberto');
INSERT INTO
  msg(msgId, userIdFK, text, date)
VALUES(0, 1, 'Hola, ¿cómo te va?', '22/12/2021'),(1, 0, 'Bien, y a ti?', '22/12/2021');