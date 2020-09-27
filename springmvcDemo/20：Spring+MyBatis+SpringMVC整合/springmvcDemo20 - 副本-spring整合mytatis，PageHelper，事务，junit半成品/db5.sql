/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - db5
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db5` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db5`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(100) NOT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `realName` varchar(32) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`realName`,`birthday`) values ('29c42c7a-d3ff-43ad-bc85-fa3170daa5b3','tom5','123','xiaoming','2020-09-27'),('42fd2c0d-e6c9-4eea-88df-3b5f7e74bd66','tom6','123','xiaoming','2020-09-27'),('884888de-d7d4-45e9-b7a0-e21a4ac0e6a1','tom8','123','xiaoming','2020-09-27'),('c5189f40-7416-401b-b441-fdd8eb75e845','tom7','123','xiaoming','2020-09-27'),('c73110de-69ae-44fd-8718-c460f1581b40','tom9','123','xiaoming','2020-09-27'),('d01f8098-bee6-49fb-85c6-f16ac74a1630','tom','123','xiaoming','2020-09-27'),('d60530ff-c126-472f-9c25-e6909f46445f','tom1','123','xiaoming','2020-09-27'),('e7136a69-5204-4e85-a549-0a7c8271a734','tom2','123','xiaoming','2020-09-27'),('eea9df52-4e31-41a0-bd50-cdb10c50f70a','tom10','123','xiaoming','2020-09-27'),('f95d29be-dc4c-4a63-8578-ac0628e9c781','tom3','123','xiaoming','2020-09-27'),('fdc95906-957e-4f84-9612-3d5bf2b52902','tom4','123','xiaoming','2020-09-27');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
