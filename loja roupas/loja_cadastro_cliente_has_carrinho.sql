-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: loja
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `cadastro_cliente_has_carrinho`
--

DROP TABLE IF EXISTS `cadastro_cliente_has_carrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastro_cliente_has_carrinho` (
  `cadastro_cliente_id_cliente` int NOT NULL,
  `carrinho_id_compras` int NOT NULL,
  PRIMARY KEY (`cadastro_cliente_id_cliente`,`carrinho_id_compras`),
  KEY `fk_cadastro_cliente_has_carrinho_carrinho1_idx` (`carrinho_id_compras`),
  KEY `fk_cadastro_cliente_has_carrinho_cadastro_cliente1_idx` (`cadastro_cliente_id_cliente`),
  CONSTRAINT `fk_cadastro_cliente_has_carrinho_cadastro_cliente1` FOREIGN KEY (`cadastro_cliente_id_cliente`) REFERENCES `cadastro_cliente` (`id_cliente`),
  CONSTRAINT `fk_cadastro_cliente_has_carrinho_carrinho1` FOREIGN KEY (`carrinho_id_compras`) REFERENCES `carrinho` (`id_compras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastro_cliente_has_carrinho`
--

LOCK TABLES `cadastro_cliente_has_carrinho` WRITE;
/*!40000 ALTER TABLE `cadastro_cliente_has_carrinho` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_cliente_has_carrinho` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-30 21:33:04
