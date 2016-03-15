/*
Navicat MySQL Data Transfer

Source Server         : minic
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : etl

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2016-03-15 16:26:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', null, null, '1');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cId` int(11) NOT NULL AUTO_INCREMENT,
  `chief` varchar(255) DEFAULT NULL,
  `cintro` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `credits` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'wy', null, '英语听说', '32');

-- ----------------------------
-- Table structure for course_unit
-- ----------------------------
DROP TABLE IF EXISTS `course_unit`;
CREATE TABLE `course_unit` (
  `Course_cId` int(11) NOT NULL,
  `units_uId` int(11) NOT NULL,
  UNIQUE KEY `units_uId` (`units_uId`),
  KEY `FK5E68A728B544B9EC` (`Course_cId`),
  KEY `FK5E68A728316F05FB` (`units_uId`),
  CONSTRAINT `FK5E68A728316F05FB` FOREIGN KEY (`units_uId`) REFERENCES `unit` (`uId`),
  CONSTRAINT `FK5E68A728B544B9EC` FOREIGN KEY (`Course_cId`) REFERENCES `course` (`cId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_unit
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `_content` varchar(255) DEFAULT NULL,
  `_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `_title` varchar(255) DEFAULT NULL,
  `publishRole` int(11) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', 'News1', '2016-03-08 00:00:00', 'news1', '0', 'wy');
INSERT INTO `news` VALUES ('2', 'News2', '2016-03-14 00:00:00', 'News2', '0', 'wy');
INSERT INTO `news` VALUES ('3', 'News3', '2016-03-14 00:00:00', 'News3', '0', 'wy');
INSERT INTO `news` VALUES ('4', 'News4', '2016-03-14 00:00:00', 'News4', '0', 'wy');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `cId` int(11) NOT NULL,
  `_content` varchar(255) DEFAULT NULL,
  `_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `_title` varchar(255) DEFAULT NULL,
  `publishRole` int(11) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `toPerson` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '1', 'post1', '2016-03-14 00:00:00', 'post1', '0', 'wy', '');
INSERT INTO `post` VALUES ('2', '1', 'post2', '2016-03-14 00:00:00', 'post2', '0', 'wy', '');
INSERT INTO `post` VALUES ('3', '1', 'post3', '2016-03-14 00:00:00', 'post3', '0', 'wy', '');
INSERT INTO `post` VALUES ('4', '1', 'post4', '2016-03-14 00:00:00', 'post4', '0', 'wy', '');
INSERT INTO `post` VALUES ('5', '1', 'post5', '2016-03-14 00:00:00', 'post5', '0', 'wy', '');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `username` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('zh', null, null, '1');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `username` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `intro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('wy', null, null, '1', null);

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `uIntro` varchar(255) DEFAULT NULL,
  `uName` varchar(255) NOT NULL,
  `uId` int(11) NOT NULL,
  PRIMARY KEY (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of unit
-- ----------------------------
INSERT INTO `unit` VALUES ('safsd', 'unit1', '10001');
INSERT INTO `unit` VALUES (null, 'unit2', '10002');
