create database superherofitnesscenter;
use superherofitnesscenter;
-- MySQL dump 10.13  Distrib 5.5.2-m2, for Win32 (ia32)
--
-- Host: localhost    Database: superherofitnesscenter
-- ------------------------------------------------------
-- Server version	5.5.2-m2-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `arrears`
--

DROP TABLE IF EXISTS `arrears`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `arrears` (
  `pid` varchar(30) NOT NULL,
  `cid` varchar(30) NOT NULL,
  `fee` decimal(10,2) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `cid` (`cid`),
  CONSTRAINT `arrears_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `arrears`
--

LOCK TABLES `arrears` WRITE;
/*!40000 ALTER TABLE `arrears` DISABLE KEYS */;
INSERT INTO `arrears` VALUES ('P001','M001',23.00),('P002','M002',45.00),('P003','M003',56.00),('P004','M004',45.00),('P005','M001',2000.00),('P006','M001',3000.00),('P007','M002',2500.00),('P008','M002',3500.00);
/*!40000 ALTER TABLE `arrears` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendance` (
  `aid` varchar(20) NOT NULL,
  `cid` varchar(20) NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `inTime` varchar(20) DEFAULT NULL,
  `outTime` varchar(20) DEFAULT NULL,
  `officerIncharge` varchar(20) NOT NULL,
  PRIMARY KEY (`aid`),
  KEY `cid` (`cid`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES ('A001','M001','2016-12-31','01:30',NULL,'huththa'),('A002','M002','2017-01-10','02:56',NULL,'sdsdsd'),('A003','M003','2017-01-23','3:55',NULL,'sdsdsds'),('A004','M004','2017-01-23','3:08',NULL,'dsdsddssds');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `eid` varchar(20) NOT NULL,
  `discription` varchar(100) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  `place` varchar(50) NOT NULL,
  `price` double(10,2) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES ('E001','Talent Show','Wed Jan 04 00:00:00 IST 2017','7.30am','ijse',1000.00),('E002','New Year Festival','Wed Jan 04 00:00:00 IST 2017','8.30am','samanala gorund',500.00);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exercise`
--

DROP TABLE IF EXISTS `exercise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exercise` (
  `eid` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exercise`
--

LOCK TABLES `exercise` WRITE;
/*!40000 ALTER TABLE `exercise` DISABLE KEYS */;
INSERT INTO `exercise` VALUES ('E001','athe  gasima'),('E002','puke arima'),('E003','dsdsdsd'),('E004','sdsdsd'),('E005','sdsdsdsd');
/*!40000 ALTER TABLE `exercise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `iid` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `qty` int(10) NOT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('I002','sdsdsd',45),('I003','sdsdsd',656),('I004','sdsdsd',545);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurement`
--

DROP TABLE IF EXISTS `measurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurement` (
  `mid` varchar(50) NOT NULL,
  `chest` double(12,2) DEFAULT NULL,
  `abdomen` double(12,2) DEFAULT NULL,
  `waist` double(12,2) DEFAULT NULL,
  `hipsButtooks` double(12,2) DEFAULT NULL,
  `neck` double(12,2) DEFAULT NULL,
  `thightLeft` double(12,2) DEFAULT NULL,
  `thightRight` double(12,2) DEFAULT NULL,
  `armLeft` double(12,2) DEFAULT NULL,
  `armRight` double(12,2) DEFAULT NULL,
  `forearmLeft` double(12,2) DEFAULT NULL,
  `forearmRight` double(12,2) DEFAULT NULL,
  `calfLeft` double(12,2) DEFAULT NULL,
  `calfRight` double(12,2) DEFAULT NULL,
  `scheduleid` varchar(20) NOT NULL,
  `height` double(20,2) DEFAULT NULL,
  `weight` double(20,2) DEFAULT NULL,
  PRIMARY KEY (`mid`),
  KEY `sheduleId` (`scheduleid`),
  CONSTRAINT `sheduleId` FOREIGN KEY (`scheduleid`) REFERENCES `schedule` (`scheduleId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurement`
--

LOCK TABLES `measurement` WRITE;
/*!40000 ALTER TABLE `measurement` DISABLE KEYS */;
INSERT INTO `measurement` VALUES ('MM001',21.00,66.00,22.00,23.00,22.00,3.00,22.00,22.00,666.00,666.00,65.00,22.00,55.00,'S001',45.00,22.00),('MM002',65.00,55.00,56.00,22.00,23.00,33.00,55.00,45.00,44.00,55.00,22.00,56.00,55.00,'S002',56.00,22.00),('MM003',99.00,77.00,22.00,55.00,55.00,55.00,55.00,56.00,55.00,22.00,22.00,22.00,55.00,'S003',55.00,55.00),('MM004',11.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,'S004',1.00,1.00),('MM005',5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,'S005',5.00,5.00),('MM006',11.00,11.00,1.00,1.00,11.00,11.00,11.00,11.00,1.00,1.00,11.00,1.00,11.00,'S006',11.00,1.00),('MM007',1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,'S007',1.00,1.00),('MM008',2.00,2.00,2.00,2.00,2.00,20.00,2.00,2.00,2.00,20.00,2.00,2.00,20.00,'S008',2.00,22.00),('MM009',3.00,3.00,3.00,3.00,3.00,30.00,3.00,3.00,3.00,33.00,3.00,3.00,3.00,'S009',3.00,3.00),('MM010',9.00,9.00,9.00,9.00,9.00,9.00,9.00,90.00,9.00,9.00,9.00,9.00,9.00,'S010',9.00,9.00),('MM011',0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,'S011',0.00,0.00),('MM012',0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,'S012',0.00,0.00),('MM013',10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,10.00,'S013',10.00,10.00),('MM014',5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,'S014',5.00,5.00),('MM015',2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,2.00,'S015',2.00,2.00);
/*!40000 ALTER TABLE `measurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `cid` varchar(20) NOT NULL,
  `fName` varchar(50) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `phoneNo` int(15) NOT NULL,
  `occupation` varchar(100) DEFAULT NULL,
  `nic` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `age` int(100) NOT NULL,
  `eMail` varchar(100) DEFAULT NULL,
  `address` varchar(150) NOT NULL,
  `facebook` varchar(100) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('M001','thisara','deshan',771472310,'no','950812664v','male','1995-01-03',20,'sdsdsd','dsdsd','sdsd','dsdsdsdsdsds'),('M002','pala','paka',123456790,'blowjob','123456455v','notfound','1995-01-04',66,'dwdwdd','wdsdsd','sdsdsd','sdsdsdsdsds'),('M003','sdssd','plpl',1234567890,'ededefeffe','595959595v','sdsd','1995-01-05',10,'sdsdsdsdsd','wwdwdwdwdwd','sdsdsdsdsd','dsdsdsdd'),('M004','dsdww','wdwdwd',455555555,'dsdsdsdsdsd','123456785v','sdsd','1995-01-04',50,'sdsdsdsddsds','dsdsdsd','dsdsds','sdsdd'),('M005','sdsdsd','sdsdsdsd',454545454,'sdsdsdsd','123456877v','sdsdsd','1995-01-03',45,'fdfsdasdsd','dffdfdff','efefefef','sdsdsdsdsdff');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `othermeasurement`
--

DROP TABLE IF EXISTS `othermeasurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `othermeasurement` (
  `cid` varchar(30) NOT NULL,
  `sitReach` varchar(30) NOT NULL,
  `shoulder` decimal(10,2) NOT NULL,
  `curlupemdurance` varchar(10) NOT NULL,
  `pushupendurance` varchar(10) NOT NULL,
  `goals` varchar(30) NOT NULL,
  PRIMARY KEY (`cid`),
  CONSTRAINT `othermeasurement_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `othermeasurement`
--

LOCK TABLES `othermeasurement` WRITE;
/*!40000 ALTER TABLE `othermeasurement` DISABLE KEYS */;
INSERT INTO `othermeasurement` VALUES ('M001','05',66.00,'66','54','89'),('M002','56',55.00,'65','56','56'),('M003','56',22.00,'55','55','25');
/*!40000 ALTER TABLE `othermeasurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `pid` varchar(20) NOT NULL,
  `cid` varchar(20) DEFAULT NULL,
  `ptId` varchar(50) DEFAULT NULL,
  `paymentDate` varchar(50) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `cid` (`cid`),
  KEY `ptId` (`ptId`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`ptId`) REFERENCES `paymenttype` (`ptId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES ('P001','M001','pt01','2016-10-20'),('P002','M001','pt01','2016-10-20'),('P003','M001','pt01','2016-10-20'),('P004','M001','pt01','2016-10-20'),('P005','M001','pt01','2016-10-20'),('P006','M001','pt01','2016-10-20'),('P007','M001','pt01','2016-10-20'),('P008','M001','pt01','2016-10-20'),('P009','M001','pt01','2016-10-20');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paymenttype`
--

DROP TABLE IF EXISTS `paymenttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paymenttype` (
  `ptId` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `fee` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ptId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymenttype`
--

LOCK TABLES `paymenttype` WRITE;
/*!40000 ALTER TABLE `paymenttype` DISABLE KEYS */;
INSERT INTO `paymenttype` VALUES ('pt002','dsdsd',55.00),('pt01','no',5000.00);
/*!40000 ALTER TABLE `paymenttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `physicaldetails`
--

DROP TABLE IF EXISTS `physicaldetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `physicaldetails` (
  `cid` varchar(20) NOT NULL,
  `qid` varchar(20) NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `qid` (`qid`),
  CONSTRAINT `physicaldetails_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `physicaldetails_ibfk_2` FOREIGN KEY (`qid`) REFERENCES `questions` (`qid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `physicaldetails`
--

LOCK TABLES `physicaldetails` WRITE;
/*!40000 ALTER TABLE `physicaldetails` DISABLE KEYS */;
INSERT INTO `physicaldetails` VALUES ('M002','Q001'),('M001','Q002');
/*!40000 ALTER TABLE `physicaldetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `qid` varchar(20) NOT NULL,
  `questions` varchar(500) NOT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES ('Q001','What is your name'),('Q002','Ube Pake diga'),('Q003','Kellath akka issela jinki jika karapu dawasa ha thana mokda?'),('Q004','Uba dawasakata kipa wathawak athe gahanawada'),('Q005','Kochara wala balala thiyada asama kella ');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regdetails`
--

DROP TABLE IF EXISTS `regdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regdetails` (
  `cid` varchar(20) NOT NULL,
  `joinDate` varchar(20) NOT NULL,
  `expDate` varchar(20) DEFAULT NULL,
  `weight` double(10,2) DEFAULT NULL,
  `height` double(10,2) DEFAULT NULL,
  `restingHr` double(10,2) DEFAULT NULL,
  `restingBp` double(10,2) DEFAULT NULL,
  `biceps` double(10,2) DEFAULT NULL,
  `triceps` double(10,2) DEFAULT NULL,
  `abs` double(10,2) DEFAULT NULL,
  `fat` double(10,2) DEFAULT NULL,
  `fatWeight` double(10,2) DEFAULT NULL,
  `back` double(10,2) DEFAULT NULL,
  `lean` double(10,2) DEFAULT NULL,
  `leanWeight` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  CONSTRAINT `regdetails_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regdetails`
--

LOCK TABLES `regdetails` WRITE;
/*!40000 ALTER TABLE `regdetails` DISABLE KEYS */;
INSERT INTO `regdetails` VALUES ('M001','2016-05-23','2017-02-12',56.00,50.00,55.00,55.00,57.00,23.00,55.00,55.00,55.00,55.00,55.00,66.00);
/*!40000 ALTER TABLE `regdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedule` (
  `scheduleId` varchar(50) NOT NULL,
  `scheduleNumber` varchar(255) NOT NULL,
  `startDate` varchar(100) DEFAULT NULL,
  `endDate` varchar(100) DEFAULT NULL,
  `cid` varchar(100) NOT NULL,
  PRIMARY KEY (`scheduleId`),
  KEY `cid` (`cid`),
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `member` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES ('S001','1','2016-12-31','2016-12-31','M001'),('S002','2','2016-10-20','2016-10-21','M001'),('S003','3','2016-11-20','2016-10-22','M001'),('S004','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S005','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S006','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S007','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M002'),('S008','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M002'),('S009','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M002'),('S010','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S011','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S012','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M002'),('S013','2','Wed Jan 04 00:00:00 IST 2017','Wed Jan 04 00:00:00 IST 2017','M001'),('S014','3','2017-01-10','2017-02-10','M001'),('S015','4','2017-01-24','2017-01-31','M001');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scheduledetails`
--

DROP TABLE IF EXISTS `scheduledetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scheduledetails` (
  `sdId` varchar(50) NOT NULL,
  `set` varchar(50) NOT NULL,
  `rep` varchar(50) NOT NULL,
  `scheduleId` varchar(20) NOT NULL,
  `eid` varchar(20) NOT NULL,
  PRIMARY KEY (`sdId`),
  KEY `eid` (`eid`),
  KEY `scheduleid` (`scheduleId`),
  CONSTRAINT `eid` FOREIGN KEY (`eid`) REFERENCES `exercise` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `scheduleid` FOREIGN KEY (`scheduleId`) REFERENCES `schedule` (`scheduleId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scheduledetails`
--

LOCK TABLES `scheduledetails` WRITE;
/*!40000 ALTER TABLE `scheduledetails` DISABLE KEYS */;
INSERT INTO `scheduledetails` VALUES ('S010','1','1','S010','E002'),('SD001','12','12','S001','E001'),('SD002','56','23','S002','E002'),('SD003','5','8','S003','E002'),('SD004','1','1','S011','E001'),('SD005','3','1','S012','E002'),('SD006','6','2','S012','E001'),('SD007','10','1','S013','E001'),('SD008','10','1','S013','E002'),('SD009','12','10','S014','E003'),('SD010','55','55','S015','E001');
/*!40000 ALTER TABLE `scheduledetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `uid` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('U001','pasan','pasan','admin'),('U002','deshan','123','user');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-09 12:58:00
