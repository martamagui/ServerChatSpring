/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
CREATE DATABASE IF NOT EXISTS chatAndroid DEFAULT CHARACTER SET utf8mb4;
USE chatAndroid;
DROP TABLE IF EXISTS msg;
DROP TABLE IF EXISTS users;
CREATE TABLE `msg` (
  `msgId` int(255) COLLATE latin1_spanish_ci NOT NULL AUTO_INCREMENT,
  `userId_FK` int(255) COLLATE latin1_spanish_ci NOT NULL,
  `text` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `date` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`msgId`),
  FOREIGN KEY (`userId_FK`) REFERENCES user(`userId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;
CREATE TABLE `users` (
  `userId` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `name` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;
INSERT INTO
  users(userId, name)
VALUES('0', 'Usuario'),('1', 'Francisca'),('2', 'Roberto');
INSERT INTO
  msg(msgId, userId_FK, text, date)
VALUES(0, 1, 'Hola, ¿cómo te va?', '22/12/2021'),(1, 0, 'Bien, y a ti?', '22/12/2021');