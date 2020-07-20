/*
 Navicat Premium Data Transfer

 Source Server         : KONYDB
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : course

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 21/07/2020 04:06:56
*/

SET NAMES utf8_general_ci;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `courseID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `deptID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `coursename` varchar(128) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(1024) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`courseID`) USING BTREE,
  INDEX `FK_Reference_10`(`deptID`) USING BTREE,
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`deptID`) REFERENCES `department` (`deptID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '1', 'ICS', '必修');
INSERT INTO `course` VALUES ('2', '1', 'SE Practice', '必修');
INSERT INTO `course` VALUES ('3', '2', 'Computer Science', '必修');
INSERT INTO `course` VALUES ('4', '1', 'Beauty of Software', '选修');
INSERT INTO `course` VALUES ('5', '2', 'Computer Hardware', '选修');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `deptID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `dept_name` varchar(64) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'SE');
INSERT INTO `department` VALUES ('2', 'CS');

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `secID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `semester` varchar(8) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `year` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `timeslotID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `courseID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `building` varchar(32) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `roomnumber` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `credits` decimal(2, 1) NULL DEFAULT NULL,
  `weeks` varchar(1024) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `maxnum` int(0) NULL DEFAULT NULL,
  `currentnum` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`secID`, `semester`, `year`, `timeslotID`, `courseID`) USING BTREE,
  INDEX `FK_Relationship_1`(`courseID`) USING BTREE,
  INDEX `FK_Relationship_2`(`timeslotID`) USING BTREE,
  CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_2` FOREIGN KEY (`timeslotID`) REFERENCES `timeslot` (`timeslotID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', '2', '2019', '1', '1', '东上院', '202', 3.0, '第一周到第十六周', 120, 1);
INSERT INTO `section` VALUES ('1', '2', '2019', '6', '1', '东上院', '202', 3.0, '第一周到第十六周', 120, 1);
INSERT INTO `section` VALUES ('2', '2', '2019', '2', '3', '东上院', '109', 3.0, '第一周到第十六周', 60, 1);
INSERT INTO `section` VALUES ('2', '2', '2019', '7', '3', '东上院', '109', 3.0, '第一周到第十六周', 60, 1);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `user_name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `deptID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(128) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `gender` tinyint(1) NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `admisson_date` date NULL DEFAULT NULL,
  `document_type` varchar(64) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `country` varchar(64) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `academic_year` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_name`) USING BTREE,
  INDEX `FK_Reference_11`(`deptID`) USING BTREE,
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`deptID`) REFERENCES `department` (`deptID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`user_name`) REFERENCES `userauth` (`user_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('Xingyu', 'amadeus', '1', NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for takes
-- ----------------------------
DROP TABLE IF EXISTS `takes`;
CREATE TABLE `takes`  (
  `secID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `semester` varchar(8) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `year` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `timeslotID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `courseID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `user_name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `grade` decimal(3, 0) NULL DEFAULT NULL,
  `gpa` decimal(3, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`secID`, `semester`, `year`, `timeslotID`, `courseID`, `user_name`) USING BTREE,
  INDEX `FK_takes2`(`user_name`) USING BTREE,
  CONSTRAINT `FK_takes` FOREIGN KEY (`secID`, `semester`, `year`, `timeslotID`, `courseID`) REFERENCES `section` (`secID`, `semester`, `year`, `timeslotID`, `courseID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_takes2` FOREIGN KEY (`user_name`) REFERENCES `student` (`user_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of takes
-- ----------------------------
INSERT INTO `takes` VALUES ('2', '2', '2019', '2', '3', 'amadeus', NULL, NULL);

-- ----------------------------
-- Table structure for teach
-- ----------------------------
DROP TABLE IF EXISTS `teach`;
CREATE TABLE `teach`  (
  `secID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `semester` varchar(8) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `year` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `timeslotID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `courseID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `user_name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  PRIMARY KEY (`secID`, `semester`, `year`, `timeslotID`, `courseID`, `user_name`) USING BTREE,
  INDEX `FK_Reference_6`(`user_name`) USING BTREE,
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`user_name`) REFERENCES `teacher` (`user_name`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_teach2` FOREIGN KEY (`secID`, `semester`, `year`, `timeslotID`, `courseID`) REFERENCES `section` (`secID`, `semester`, `year`, `timeslotID`, `courseID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teach
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `user_name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `deptID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_name`) USING BTREE,
  INDEX `FK_Reference_12`(`deptID`) USING BTREE,
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`deptID`) REFERENCES `department` (`deptID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`user_name`) REFERENCES `userauth` (`user_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for timeslot
-- ----------------------------
DROP TABLE IF EXISTS `timeslot`;
CREATE TABLE `timeslot`  (
  `timeslotID` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `day` varchar(4) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `starttime` time(0) NULL DEFAULT NULL,
  `endtime` time(0) NULL DEFAULT NULL,
  PRIMARY KEY (`timeslotID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of timeslot
-- ----------------------------
INSERT INTO `timeslot` VALUES ('1', '星期一', '08:00:00', '09:50:00');
INSERT INTO `timeslot` VALUES ('2', '星期一', '10:00:00', '11:50:00');
INSERT INTO `timeslot` VALUES ('3', '星期一', '14:00:00', '15:50:00');
INSERT INTO `timeslot` VALUES ('4', '星期一', '16:00:00', '17:50:00');
INSERT INTO `timeslot` VALUES ('5', '星期二', '08:00:00', '09:50:00');
INSERT INTO `timeslot` VALUES ('6', '星期二', '10:00:00', '11:50:00');
INSERT INTO `timeslot` VALUES ('7', '星期二', '14:00:00', '15:50:00');
INSERT INTO `timeslot` VALUES ('8', '星期二', '16:00:00', '17:50:00');

-- ----------------------------
-- Table structure for userauth
-- ----------------------------
DROP TABLE IF EXISTS `userauth`;
CREATE TABLE `userauth`  (
  `user_name` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NOT NULL,
  `password` varchar(16) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  `type` varchar(8) CHARACTER SET utf8_general_ci COLLATE utf8_general_ci_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8_general_ci COLLATE = utf8_general_ci_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userauth
-- ----------------------------
INSERT INTO `userauth` VALUES ('17317790037', '159840', '0');
INSERT INTO `userauth` VALUES ('admin', 'admin', '0');
INSERT INTO `userauth` VALUES ('amadeus', 'adadeus', '0');

SET FOREIGN_KEY_CHECKS = 1;
