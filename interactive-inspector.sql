-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: interactive-inspector
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--
use heroku_95ec7a49a1f5f1f;
DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idTelegram` int NOT NULL,
  `comandOfMenu` varchar(45) DEFAULT NULL,
  `typePremises` varchar(45) DEFAULT NULL,
  `categoryPremises` varchar(45) DEFAULT NULL,
  `classFire` varchar(45) DEFAULT NULL,
  `typeExtinguisher` varchar(45) DEFAULT NULL,
  `typeSpacesBuild` varchar(45) DEFAULT NULL,
  `b1` varchar(45) DEFAULT NULL,
  `b2` varchar(45) DEFAULT NULL,
  `kitchen` varchar(45) DEFAULT NULL,
  `characteristicsObject` varchar(45) DEFAULT NULL,
  `typeObjectOfRisk` varchar(45) DEFAULT NULL,
  `typeStateOwnedObject` varchar(45) DEFAULT NULL,
  `typeCulturalObject` varchar(45) DEFAULT NULL,
  `typeIndustrialStorageFacility` varchar(45) DEFAULT NULL,
  `levelEmergency` varchar(45) DEFAULT NULL,
  `typeResultDegreeRisk` varchar(45) DEFAULT NULL,
  `usedIndoors` varchar(45) DEFAULT NULL,
  `categoryBuildings` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  `square` varchar(45) DEFAULT NULL,
  `parking` varchar(45) DEFAULT NULL,
  `workplace` varchar(45) DEFAULT NULL,
  `squareTechnicalPremises` varchar(45) DEFAULT NULL,
  `constantlyAtFacility` double DEFAULT NULL,
  `periodicallyAtFacility` double DEFAULT NULL,
  `heightObject` double DEFAULT NULL,
  `fixedViolations` double DEFAULT NULL,
  `noFixedViolations` double DEFAULT NULL,
  `deadPeople` double DEFAULT NULL,
  `losses` double DEFAULT NULL,
  `taxFreeIncome` double DEFAULT NULL,
  `injuredPeople` double DEFAULT NULL,
  `volumePremises` double DEFAULT NULL,
  `volumeRoomsA` double DEFAULT NULL,
  `volumeRooms??` double DEFAULT NULL,
  `volumeRoomsB` double DEFAULT NULL,
  `volumeRooms??` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (2,1139801811,'/determination_of_categories',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,574356223,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,813052480,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,544808197,'/determination_of_categories','??????????????',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'true',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,539646512,'/type_number_fire_extinguishers','??????????????????/??????????????????','?????????????????? ??',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,557431597,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-15 14:11:23
