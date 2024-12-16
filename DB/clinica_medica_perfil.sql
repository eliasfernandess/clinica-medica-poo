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
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfil` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cadastrar_funcionario` tinyint(1) NOT NULL DEFAULT '0',
  `ler_funcionario` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_funcionario` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_funcionario` tinyint(1) NOT NULL DEFAULT '0',
  `listar_funcionario` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrar_paciente` tinyint(1) NOT NULL DEFAULT '0',
  `ler_paciente` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_paciente` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_paciente` tinyint(1) NOT NULL DEFAULT '0',
  `listar_paciente` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrar_consulta` tinyint(1) NOT NULL DEFAULT '0',
  `ler_consulta` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_consulta` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_consulta` tinyint(1) NOT NULL DEFAULT '0',
  `listar_consulta` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrar_especialidade` tinyint(1) NOT NULL DEFAULT '0',
  `ler_especialidade` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_especialidade` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_especialidade` tinyint(1) NOT NULL DEFAULT '0',
  `listar_especialidade` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrar_convenio` tinyint(1) NOT NULL DEFAULT '0',
  `ler_convenio` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_convenio` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_convenio` tinyint(1) NOT NULL DEFAULT '0',
  `listar_convenio` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrar_prontuario` tinyint(1) NOT NULL DEFAULT '0',
  `ler_prontuario` tinyint(1) NOT NULL DEFAULT '0',
  `atualizar_prontuario` tinyint(1) NOT NULL DEFAULT '0',
  `deletar_prontuario` tinyint(1) NOT NULL DEFAULT '0',
  `listar_prontuario` tinyint(1) NOT NULL DEFAULT '0',
  `cadastrarFuncionario` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'Adiministrador',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0);
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-15 14:03:43
