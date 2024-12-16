-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: clinica_medica
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) CHARACTER SET utf16 COLLATE utf16_swedish_ci NOT NULL,
  `idade` int NOT NULL,
  `sexo` char(1) CHARACTER SET utf16 COLLATE utf16_swedish_ci NOT NULL,
  `cpf` varchar(14) CHARACTER SET utf16 COLLATE utf16_swedish_ci NOT NULL,
  `rua` varchar(100) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `numero` varchar(10) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `complemento` varchar(50) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `bairro` varchar(50) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `cidade` varchar(50) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `estado` varchar(50) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `contato` varchar(15) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf16 COLLATE utf16_swedish_ci DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf16 COLLATE=utf16_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'ELIAS COELHO GOMES FERNANDES',18,'M','168.323.541-23','RUA DA PRATA','60','CASA','SANTA TEREZINHA','ARAGUARI','Minas Gerais','(34)98843-5731','ELIAS@GMAIL.COM','2006-03-09');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-15 14:03:42
