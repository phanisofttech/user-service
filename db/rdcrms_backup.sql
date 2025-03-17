-- MySQL dump 10.13  Distrib 8.4.0, for Win64 (x86_64)
--
-- Host: localhost    Database: rdcrms
-- ------------------------------------------------------
-- Server version	8.4.0

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
-- Current Database: `rdcrms`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `rdcrms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `rdcrms`;

--
-- Table structure for table `certificate_requests`
--

DROP TABLE IF EXISTS `certificate_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificate_requests` (
  `APPLICATION_ID` bigint NOT NULL AUTO_INCREMENT,
  `FULL_NAME` varchar(40) DEFAULT NULL,
  `AADHAAR_CARD_NUMBER` bigint DEFAULT NULL,
  `GENDER` varchar(10) DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `FATHER_NAME` varchar(40) DEFAULT NULL,
  `MOTHER_NAME` varchar(40) DEFAULT NULL,
  `VILLAGE` varchar(30) DEFAULT NULL,
  `MANDAL` varchar(20) DEFAULT NULL,
  `DISTRICT` varchar(30) DEFAULT NULL,
  `STATE` varchar(15) DEFAULT NULL,
  `COUNTRY` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL,
  `MOBILE_NUMBER` bigint DEFAULT NULL,
  `RATION_CARD_NUMBER` bigint DEFAULT NULL,
  `TYPE_OF_DOCUMENT` varchar(30) DEFAULT NULL,
  `PURPOSE_OF_CERTIFICATE` varchar(20) DEFAULT NULL,
  `SUBMITTED_DATE` tinyint DEFAULT NULL,
  `SUBMITTED_MONTH` varchar(10) DEFAULT NULL,
  `SUBMITTED_YEAR` int DEFAULT NULL,
  `DESIGNATION` varchar(20) DEFAULT NULL,
  `YEARLY_INCOME` decimal(10,0) DEFAULT NULL,
  `TYPE_OF_HOUSE` varchar(20) DEFAULT NULL,
  `PHYSICALLY_HANDICAPPED` varchar(5) DEFAULT NULL,
  `GOVERNMENT_EMPLOYEE` varchar(5) DEFAULT NULL,
  `CASTE` varchar(5) DEFAULT NULL,
  `SUB_CASTE` varchar(20) DEFAULT NULL,
  `DATE_OF_DEATH` date DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  `COMMENTS` varchar(50) DEFAULT NULL,
  `CREATED_AT` date DEFAULT NULL,
  `UPDATED_AT` date DEFAULT NULL,
  PRIMARY KEY (`APPLICATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificate_requests`
--

LOCK TABLES `certificate_requests` WRITE;
/*!40000 ALTER TABLE `certificate_requests` DISABLE KEYS */;
INSERT INTO `certificate_requests` VALUES (1,'Mungara Charan Sai',945271849457,'Male','2003-05-20','Seshaiah',NULL,'Krishnapatnam','Muthukur','Nellore','andhra pradesh','india',NULL,NULL,NULL,'Caste','study',NULL,NULL,NULL,NULL,NULL,NULL,'No',NULL,'bc','d',NULL,'completed',NULL,'2024-11-22','2024-11-22'),(2,'Mungara SaiCharan',945271849457,'Male','2003-05-20','Seshaiah',NULL,'Krishnapatnam','Muthukur','Nellore','andhra pradesh','india',NULL,9182763608,2817984607,'Income',NULL,NULL,NULL,NULL,NULL,60000,'Normal House',NULL,NULL,'bc',NULL,NULL,'completed',NULL,'2024-11-22','2024-11-22'),(3,'Charan Kumar',945271849421,'Male','2003-05-20','Seshaiah','Subbamma','Muthukur','Muthukur','Nellore','andhra pradesh','india',NULL,NULL,NULL,'Birth',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Rejected',NULL,'2024-11-22','2024-11-22'),(5,'reddy sai',321213232323,'Male','2024-11-30','cherry','Subbamma','KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','andhra pradesh','INDIA',NULL,NULL,NULL,'Birth',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'inprogress',NULL,'2024-11-22','2024-11-22'),(6,'reddy reddy',121212121212,'Male','2024-11-10','daddy',NULL,'Karol Bagh','Karol Bagh','Central Delhi','Delhi(UT)','INDIA',NULL,NULL,NULL,'Caste','dfff',NULL,NULL,NULL,NULL,NULL,NULL,'Yes',NULL,'bc','d',NULL,'Inprogress',NULL,'2024-11-22','2024-11-22'),(7,'Sai',NULL,'male',NULL,'reddy','lucky','KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','andhra pradesh','INDIA',NULL,NULL,NULL,'Death',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2024-12-28','Inprogress',NULL,'2024-12-31','2024-12-31'),(8,'Mungara Charan Sai',945271849457,'Male','2025-01-23','seshaiah',NULL,'KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','andhra pradesh','INDIA',NULL,NULL,NULL,'Caste','study',NULL,NULL,NULL,NULL,NULL,NULL,'No',NULL,'bc','d',NULL,'Inprogress',NULL,'2025-01-05','2025-01-05'),(9,'Sai',945271849457,'Male','2025-03-31','daddy',NULL,'KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','ANDHRA PRADESH','INDIA',NULL,NULL,NULL,'Caste','Time pass',NULL,NULL,NULL,NULL,NULL,NULL,'Yes',NULL,'bc','a',NULL,'Inprogress',NULL,'2025-03-07','2025-03-07'),(10,'Suneel',945271849451,'Male','2025-03-12','Father','Mother','KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','ANDHRA PRADESH','INDIA',NULL,NULL,NULL,'Birth',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Inprogress',NULL,'2025-03-12','2025-03-12'),(11,'Kumar',251113744911,'Male','2025-03-11','father','mother','KRISHNAPATNAM','MUTHUKUR','SPSR NELLORE','ANDHRA PRADESH','INDIA',NULL,NULL,NULL,'Birth',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'completed',NULL,'2025-03-12','2025-03-12');
/*!40000 ALTER TABLE `certificate_requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `COUNTRY_ID` int NOT NULL AUTO_INCREMENT,
  `COUNTRY_NAME` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`COUNTRY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'INDIA');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `district` (
  `DISTRICT_ID` int NOT NULL AUTO_INCREMENT,
  `DISTRICT_NAME` varchar(30) DEFAULT NULL,
  `STATE_ID` int DEFAULT NULL,
  PRIMARY KEY (`DISTRICT_ID`),
  KEY `STATE_ID` (`STATE_ID`),
  CONSTRAINT `district_ibfk_1` FOREIGN KEY (`STATE_ID`) REFERENCES `state` (`STATE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
INSERT INTO `district` VALUES (1,'SPSR NELLORE',1),(2,'Central Delhi ',2),(3,'East Delhi ',2),(4,'New Delhi ',2),(5,'North East Delhi ',2),(6,'North West Delhi ',2),(7,'Shahdara',2),(8,'South Delhi',2),(9,'South East Delhi',2),(10,'South West Delhi',2),(11,'West Delhi',2),(12,'North Delhi',2);
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mandal`
--

DROP TABLE IF EXISTS `mandal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mandal` (
  `MANDAL_ID` int NOT NULL AUTO_INCREMENT,
  `MANDAL_NAME` varchar(30) DEFAULT NULL,
  `DISTRICT_ID` int DEFAULT NULL,
  PRIMARY KEY (`MANDAL_ID`),
  KEY `DISTRICT_ID` (`DISTRICT_ID`),
  CONSTRAINT `mandal_ibfk_1` FOREIGN KEY (`DISTRICT_ID`) REFERENCES `district` (`DISTRICT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mandal`
--

LOCK TABLES `mandal` WRITE;
/*!40000 ALTER TABLE `mandal` DISABLE KEYS */;
INSERT INTO `mandal` VALUES (1,'MUTHUKUR',1),(2,'Karol Bagh',2),(3,'Civil Lines',2),(4,'Kotwali',2),(5,'Preet Vihar',3),(6,'Vivek Vihar',3),(7,'Shahdara',3),(8,'Kalkaji',3),(9,'Laxmi Nagar',3),(10,'Connaught Place',4),(11,'India Gate',4),(12,'Chanakyapuri',4),(13,'Sadar Bazar',12),(14,'Civil Lines',12),(15,'Seelampur',5),(16,'Gokulpuri',5),(17,'Loni',5),(18,'Rohini',6),(19,'Model Town',6),(20,'Alipur',6),(21,'Bawana',6),(22,'Shahdara',7),(23,'Seelampur',7),(24,'Kashmere Gate',7),(25,'Saidulajab',8),(26,'Mehrauli',8),(27,'Ambedkar Nagar',8),(28,'Lajpat Nagar',9),(29,'Sarita Vihar',9),(30,'Jangpura',9),(31,'Dwarka',10),(32,'Janakpuri',10),(33,'Vikaspuri',10),(34,'Rajouri Garden',11),(35,'Rohini',11),(36,'Dwarka',11);
/*!40000 ALTER TABLE `mandal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `state` (
  `STATE_ID` int NOT NULL AUTO_INCREMENT,
  `STATE_NAME` varchar(25) DEFAULT NULL,
  `COUNTRY_ID` int DEFAULT NULL,
  PRIMARY KEY (`STATE_ID`),
  KEY `COUNTRY_ID` (`COUNTRY_ID`),
  CONSTRAINT `state_ibfk_1` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `country` (`COUNTRY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'ANDHRA PRADESH',1),(2,'Delhi(UT)',1);
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `aadhaar_number` bigint NOT NULL,
  `user_first_name` varchar(50) DEFAULT NULL,
  `user_last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `mobile_number` bigint DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `address_line1` varchar(40) DEFAULT NULL,
  `village` varchar(15) DEFAULT NULL,
  `mandal` varchar(15) DEFAULT NULL,
  `district` varchar(15) DEFAULT NULL,
  `pin` int DEFAULT NULL,
  `state` varchar(15) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  `otp` int DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `photo` blob,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_by` varchar(30) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  PRIMARY KEY (`aadhaar_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (111122223333,'charan','sai','male','2003-05-20',9876543210,'cherry@gmail.com','padamati','kp','mtr','nlr',524344,'ap','india',0,NULL,NULL,'cherry','cherry','2024-10-10','2024-10-10'),(112211221122,'cherry','mungara','male','2003-05-20',9876543210,'cherry@gmail.com','padamati','kp','mtr','nlr',524344,'ap','india',0,NULL,NULL,'cherry','cherry','2024-10-10','2024-10-10'),(251113744911,'Prudvi','Nelaturu','male','2002-11-30',9701804946,'nelaturuprudvi2002@gmail.com','Tirupati','Kalahasthi','Tirupati','tirupati',517507,'Andhra pradesh','India',0,'d23ca59a04',NULL,'admin@pst.com','admin@pst.com',NULL,NULL),(945271849457,'charan','sai','male','2003-05-20',9182763608,'cherryquestions.cherry@gmail.com','padamati','kp','mtr','nlr',524344,'ap','india',0,'6650545f66',NULL,'cherry','cherry','2024-10-10','2024-10-10');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `village`
--

DROP TABLE IF EXISTS `village`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `village` (
  `VILLAGE_ID` int NOT NULL AUTO_INCREMENT,
  `VILLAGE_NAME` varchar(30) DEFAULT NULL,
  `MANDAL_ID` int DEFAULT NULL,
  PRIMARY KEY (`VILLAGE_ID`),
  KEY `MANDAL_ID` (`MANDAL_ID`),
  CONSTRAINT `village_ibfk_1` FOREIGN KEY (`MANDAL_ID`) REFERENCES `mandal` (`MANDAL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `village`
--

LOCK TABLES `village` WRITE;
/*!40000 ALTER TABLE `village` DISABLE KEYS */;
INSERT INTO `village` VALUES (1,'KRISHNAPATNAM',1),(2,'Karol Bagh',2),(3,'Dev Nagar',2),(4,'Shahdara Village',7),(5,'Bhagwati Garden',7),(6,'Khasra Village',23),(7,'Mustafabad',23),(8,'Kakrola Village',36),(9,'Najafgarh Village',36),(10,'Maujpur Village',27),(11,'Jaitpur Village',27),(12,'Palla Village',21),(13,'Rohini Village',21);
/*!40000 ALTER TABLE `village` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-17 10:43:53
