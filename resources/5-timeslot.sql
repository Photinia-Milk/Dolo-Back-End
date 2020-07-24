/*
 Navicat Premium Data Transfer

 Source Server         : mysql820
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : course_test

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 23/07/2020 17:26:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for timeslot
-- ----------------------------
DROP TABLE IF EXISTS `timeslot`;
CREATE TABLE `timeslot`  (
  `timeslotId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `day` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `startTime` int(0) NULL DEFAULT NULL,
  `endTime` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`timeslotId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of timeslot
-- ----------------------------
INSERT INTO `timeslot` VALUES ('1', '星期二', 6, 8);
INSERT INTO `timeslot` VALUES ('10', '星期四', 9, 10);
INSERT INTO `timeslot` VALUES ('11', '星期四', 11, 13);
INSERT INTO `timeslot` VALUES ('12', '星期一', 7, 9);
INSERT INTO `timeslot` VALUES ('13', '星期一', 9, 10);
INSERT INTO `timeslot` VALUES ('14', '星期四', 7, 10);
INSERT INTO `timeslot` VALUES ('15', '星期一', 6, 8);
INSERT INTO `timeslot` VALUES ('16', '星期五', 11, 13);
INSERT INTO `timeslot` VALUES ('17', '星期五', 9, 10);
INSERT INTO `timeslot` VALUES ('18', '星期四', 11, 12);
INSERT INTO `timeslot` VALUES ('19', '星期一', 11, 12);
INSERT INTO `timeslot` VALUES ('2', '星期四', 6, 8);
INSERT INTO `timeslot` VALUES ('20', '星期五', 3, 5);
INSERT INTO `timeslot` VALUES ('21', '星期六', 1, 8);
INSERT INTO `timeslot` VALUES ('22', '星期三', 2, 4);
INSERT INTO `timeslot` VALUES ('23', '星期一', 7, 8);
INSERT INTO `timeslot` VALUES ('24', '星期五', 6, 8);
INSERT INTO `timeslot` VALUES ('25', '星期三', 1, 2);
INSERT INTO `timeslot` VALUES ('26', '星期一', 3, 4);
INSERT INTO `timeslot` VALUES ('27', '星期二', 3, 4);
INSERT INTO `timeslot` VALUES ('28', '星期四', 3, 4);
INSERT INTO `timeslot` VALUES ('29', '星期三', 3, 4);
INSERT INTO `timeslot` VALUES ('3', '星期二', 9, 10);
INSERT INTO `timeslot` VALUES ('30', '星期五', 3, 4);
INSERT INTO `timeslot` VALUES ('31', '星期二', 1, 2);
INSERT INTO `timeslot` VALUES ('32', '星期六', 1, 4);
INSERT INTO `timeslot` VALUES ('33', '星期六', 6, 9);
INSERT INTO `timeslot` VALUES ('4', '星期二', 11, 13);
INSERT INTO `timeslot` VALUES ('5', '星期三', 11, 12);
INSERT INTO `timeslot` VALUES ('6', '星期一', 11, 13);
INSERT INTO `timeslot` VALUES ('7', '星期二', 11, 12);
INSERT INTO `timeslot` VALUES ('8', '星期三', 11, 13);
INSERT INTO `timeslot` VALUES ('9', '星期五', 11, 12);

SET FOREIGN_KEY_CHECKS = 1;
