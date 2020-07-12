-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: restoransemasi
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `siparis`
--

DROP TABLE IF EXISTS `siparis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `siparis` (
  `SiparisId` int(11) NOT NULL AUTO_INCREMENT,
  `FK_PersonelId` int(11) DEFAULT NULL,
  `FK_MasaNo` int(11) DEFAULT NULL,
  `FK_UrunId` int(11) DEFAULT NULL,
  `PersonelAdi` varchar(100) DEFAULT NULL,
  `UrunFiyat` float DEFAULT NULL,
  `UrunAdi` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SiparisId`),
  KEY `FK_PersonelId_idx` (`FK_PersonelId`),
  KEY `FK_UrunId_idx` (`FK_UrunId`),
  KEY `FK_MasaNo_idx` (`FK_MasaNo`),
  KEY `PersonelAdi_idx` (`PersonelAdi`),
  KEY `UrunFiyat_idx` (`UrunFiyat`),
  KEY `UrunAdi_idx` (`UrunAdi`),
  CONSTRAINT `FK_MasaNo` FOREIGN KEY (`FK_MasaNo`) REFERENCES `masa` (`MasaNo`),
  CONSTRAINT `FK_PersonelId` FOREIGN KEY (`FK_PersonelId`) REFERENCES `personel` (`PersonelId`),
  CONSTRAINT `FK_UrunId` FOREIGN KEY (`FK_UrunId`) REFERENCES `urun` (`UrunId`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siparis`
--

LOCK TABLES `siparis` WRITE;
/*!40000 ALTER TABLE `siparis` DISABLE KEYS */;
INSERT INTO `siparis` VALUES (32,4,6,1,'Eray',5,'Çorba'),(33,8,7,1,'Kemal',5,'Çorba'),(34,7,3,1,'Gökhan',5,'Çorba'),(35,4,6,2,'Eray',25,'Tavuk Pilav'),(36,1,6,2,'Şafak',25,'Tavuk Pilav');
/*!40000 ALTER TABLE `siparis` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 19:52:56
