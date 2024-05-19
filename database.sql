-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: OnlineBookstore
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.23.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `title` varchar(255) NOT NULL,
  `author` text,
  `category` text,
  `summary` text,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`title`,`username`),
  KEY `book_user_creds_username_fk` (`username`),
  CONSTRAINT `book_user_creds_username_fk` FOREIGN KEY (`username`) REFERENCES `user_creds` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('123','123213','13131232','123123123','porf@malakas.com'),('fsdfdfdfd','dfsdfsdfdsf','dfxdfdfdfdsfdfdff','dfsdfsdf','porf@malakas.com'),('LOTR','Tolkien','Fantasy','Stathis','porf@malakas.com'),('Temp','AMEA','horror','malakas','porf@malakas.com'),('test','1312313131','123','My name is paul','pavlos@orfanidis.net.gr'),('tsouklas','amea','stavros','efsfgdgfdg','porf@malakas.com');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requests`
--

DROP TABLE IF EXISTS `requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requests` (
  `username` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `holder` varchar(255) DEFAULT NULL,
  `accepted` int DEFAULT NULL,
  KEY `requests_user_creds_username_fk` (`username`),
  KEY `requests_book_title_username_fk` (`title`,`holder`),
  CONSTRAINT `requests_book_title_username_fk` FOREIGN KEY (`title`, `holder`) REFERENCES `book` (`title`, `username`),
  CONSTRAINT `requests_user_creds_username_fk` FOREIGN KEY (`username`) REFERENCES `user_creds` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requests`
--

LOCK TABLES `requests` WRITE;
/*!40000 ALTER TABLE `requests` DISABLE KEYS */;
INSERT INTO `requests` VALUES ('pavlos@orfanidis.net.gr','fsdfdfdfd','porf@malakas.com',1),('pavlos@orfanidis.net.gr','123','porf@malakas.com',1),('pavlos@orfanidis.net.gr','Temp','porf@malakas.com',0),('pavlos@orfanidis.net.gr','tsouklas','porf@malakas.com',-1),('pavlos@orfanidis.net.gr','LOTR','porf@malakas.com',1);
/*!40000 ALTER TABLE `requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_creds`
--

DROP TABLE IF EXISTS `user_creds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_creds` (
  `username` varchar(255) NOT NULL,
  `password` text,
  `full_name` text,
  `address` text,
  `age` int DEFAULT NULL,
  `phone_number` text,
  `categories` varchar(255) DEFAULT NULL,
  `favourite_authors` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_creds`
--

LOCK TABLES `user_creds` WRITE;
/*!40000 ALTER TABLE `user_creds` DISABLE KEYS */;
INSERT INTO `user_creds` VALUES ('pavlos@orfanidis.net.gr','0365ac0509127334ea54814a039c57d2d08a6b8eca2d029c0204d907df453b2a','123123','123213',12312,'123123123','',''),('porf@malakas.com','0365ac0509127334ea54814a039c57d2d08a6b8eca2d029c0204d907df453b2a','Pavlos','123',234,'6986989523','','');
/*!40000 ALTER TABLE `user_creds` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-18 15:30:17
