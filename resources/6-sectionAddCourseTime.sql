/*
 Navicat Premium Data Transfer

 Source Server         : mysql820
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : final_test

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 24/07/2020 11:14:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `semester` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teacherUserName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseTime` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `location` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `remarks` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `model` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `maxNum` int(0) NULL DEFAULT NULL,
  `currentNum` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`semester`, `year`, `courseId`, `teacherUserName`) USING BTREE,
  INDEX `FK_Relationship_1`(`courseId`) USING BTREE,
  INDEX `FK_Relationship_3`(`teacherUserName`) USING BTREE,
  CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`teacherUserName`) REFERENCES `teacher` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', '2020-2021', 'AD001', 'teacher130', '星期二第9-10节{1-16周}', '东中院3-202', '', '面授讲课', 119, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AD003', 'teacher131', '星期四第9-10节{1-16周}', '东中院3-202', '', '面授讲课', 85, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AI007', 'teacher262', '星期四第9-10节{1-16周}', '东中院1-109', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AI007', 'teacher263', '星期四第9-10节{1-16周}', '东中院1-109', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM001', 'teacher132', '星期四第11-13节{1-11周}', '上院210', '', '面授讲课', 122, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM008', 'teacher133', '星期四第9-10节{1-16周}', '上院302', '', '面授讲课', 85, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM016', 'teacher134', '星期四第9-10节{1-16周}', '不排教室', '面向全校本科生。第1周—第16周，星期四第9节—第10节；上课地点：图书馆主馆（新馆）B120室。', '面授讲课', 90, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM025', 'teacher135', '星期四第9-10节{1-16周}', '上院102', '', '面授讲课', 36, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM062', 'teacher136', '星期二第9-10节{1-16周}', '上院318', '', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM065', 'teacher137', '星期一第11-13节{1-11周}', '上院203', '', '面授讲课', 137, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM070', 'teacher138', '星期二第11-13节{1-11周}', '上院409', '', '面授讲课', 160, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM108', 'teacher139', '星期二第9-10节{1-16周}', '东中院3-304', '', '面授讲课', 136, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM314', 'teacher140', '星期一第9-10节{1-16周}', '东中院4-206', '', '面授讲课', 98, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AM922', 'teacher20', '星期三第11-13节{1-11周}', '逸夫楼101', '上课地点：逸夫科技楼101', '面授讲课', 80, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AR007', 'teacher141', '星期一第9-10节{1-16周}', '东中院4-306', '', '面授讲课', 77, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AR904', 'teacher21', '星期四第9-10节{1-16周}', '上院108', '时间请安排在周四9-10节', '面授讲课', 149, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AR909', 'teacher16', '星期一第7-9节{1-16周}', '东中院4-106', '', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AU007', 'teacher121', '星期四第11-13节{5-15周}', '不排教室', '时间：5~15周，周四，11~13节，地址：学生创新中心B楼305', '面授讲课', 99, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV001', 'teacher142', '星期一第11-13节{2-12周}', '上院201', '', '面授讲课', 155, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher266', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher267', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher268', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher269', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher270', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher271', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher272', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher273', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher274', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV012', 'teacher275', '星期一第11-12节{1-16周}', '东中院4-202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV020', 'teacher143', '星期四第11-13节{1-4周,10-16周}', '不排教室', '上课时间，1~4周，10~16周，周四11~13节，地址：学生创新中心C楼200号', '面授讲课', 149, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV022', 'teacher144', '星期四第11-13节{5-15周}', '不排教室', '地址：学生创新中心C楼201', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'AV023', 'teacher115', '星期二第11-13节{5-15周}', '不排教室', '时间：5~15周，周二11~13节，地址：学生创新中心思源楼310', '面授讲课', 135, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BE002', 'teacher145', '星期三第11-13节{5-15周}', '不排教室', '时间：5~15周，周三11~13节，地址：学生创新中心B楼305', '面授讲课', 121, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI039', 'teacher146', '星期一第9-10节{1-16周}', '东中院2-106', '', '面授讲课', 47, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI041', 'teacher147', '星期一第9-10节{1-16周}', '东中院4-301', '', '面授讲课', 152, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI901', 'teacher22', '星期四第9-10节{1-16周}', '东中院3-402', '', '面授讲课', 147, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI902', 'teacher23', '星期一第9-10节{1-16周}', '东中院1-301', '', '面授讲课', 100, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI903', 'teacher24', '星期四第7-10节{8-16周}', '不排教室', '（8-16周）周四下午7-10节，上课地点叶杰全楼111实验室，非生物专业学生选修，生命与医学专业学生不可选', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI905', 'teacher25', '星期二第9-10节{1-16周}', '东中院2-403', '', '面授讲课', 56, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI907', 'teacher26', '星期二第9-10节{1-16周}', '上院315', '', '面授讲课', 81, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI912', 'teacher27', '星期二第11-13节{1-11周}', '上院104', '对生命科学感兴趣，线上线下混合式教学，安排一次实验。', '面授讲课', 87, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI913', 'teacher254', '星期四第11-13节{1-16周}', '上院108', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI913', 'teacher255', '星期四第11-13节{1-16周}', '上院108', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI916', 'teacher28', '星期二第11-13节{1-11周}', '上院111', '', '面授讲课', 119, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI917', 'teacher29', '星期四第9-10节{1-16周}', '东中院4-304', '', '面授讲课', 165, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BI920', 'teacher5', '星期一第11-13节{1-11周}', '上院205', '', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM011', 'teacher148', '星期四第9-10节{1-16周}', '东中院2-206', '', '面授讲课', 77, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM021', 'teacher276', '星期三第11-12节{1-16周}', '上院115', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM021', 'teacher277', '星期三第11-12节{1-16周}', '上院115', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM902', 'teacher238', '星期一第9-10节{1-4周}\\n星期四第9-10节{1-4周}', '东中院1-202', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM902', 'teacher239', '星期一第9-10节{1-4周}\\n星期四第9-10节{1-4周}', '东中院1-202', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM903', 'teacher30', '星期二第9-10节{1-16周}', '东中院1-107', '', '面授讲课', 101, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM904', 'teacher31', '星期一第6-8节{1-16周}', '东中院2-106', '', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BM908', 'teacher32', '星期二第11-13节{1-11周}', '上院110', '', '面授讲课', 123, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU007', 'teacher149', '星期四第9-10节{1-16周}', '东中院3-205', '', '面授讲课', 46, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU012', 'teacher150', '星期四第9-10节{1-16周}', '上院204', '全体学生，无专业和先修课要求', '面授讲课', 137, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU013', 'teacher151', '星期二第6-8节{1-11周}', '东上院308', '', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU017', 'teacher152', '星期二第11-12节{1-16周}', '下院206', '', '面授讲课', 86, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU304', 'teacher153', '星期四第11-13节{1-11周}', '中院105', '', '面授讲课', 167, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU320', 'teacher154', '星期二第11-13节{6-16周}', '上院307', '', '面授讲课', 146, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU327', 'teacher155', '星期四第11-13节{1-11周}', '上院201', '专业背景不限', '面授讲课', 87, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU426', 'teacher156', '星期二第9-10节{1-16周}', '东中院3-205', '无限制', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'BU463', 'teacher157', '星期一第9-10节{1-16周}', '上院203', '', '面授讲课', 46, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CA099', 'teacher124', '星期六第1-8节{5-8周}', '不排教室', '时间：5-8周，1～8节，地址：学生创新中心，ET实验室', '面授讲课', 129, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CA904', 'teacher33', '星期四第9-10节{1-16周}', '东中院4-401', '', '面授讲课', 53, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH072', 'teacher158', '星期四第11-12节{1-16周}', '上院408', '', '面授讲课', 59, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH078', 'teacher119', '星期一第11-13节{1-16周}', '上院103', '', '面授讲课', 49, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH079', 'teacher123', '星期三第11-12节{1-16周}', '上院202', '', '面授讲课', 95, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH902', 'teacher34', '星期二第9-10节{1-16周}', '东中院4-401', '', '面授讲课', 149, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH906', 'teacher35', '星期三第11-12节{1-16周}', '上院301', '不限专业，但要热爱古诗词，愿意尝试创作，写出旧瓶新酒的诗意。', '面授讲课', 99, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH911', 'teacher36', '星期四第11-13节{1-16周}', '上院211', '', '其他', 158, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH926', 'teacher37', '星期二第11-13节{1-16周}', '上院101', '', '面授讲课', 38, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH927', 'teacher38', '星期三第11-13节{1-16周}', '上院108', '', '面授讲课', 126, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH929', 'teacher39', '星期一第9-10节{1-16周}', '东中院4-201', '', '面授讲课', 110, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH931', 'teacher40', '星期五第11-13节{1-16周}', '上院108', '', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH932', 'teacher41', '星期二第11-13节{1-11周}', '东上院308', '', '面授讲课', 152, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH934', 'teacher42', '星期一第11-13节{1-16周}', '东下院111', '周二晚11-13节，东上院', '面授讲课', 168, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH935', 'teacher43', '星期三第11-12节{1-16周}', '东中院4-204', '喜爱中国传统文化，具备一定的古文阅读能力', '面授讲课', 90, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH936', 'teacher44', '星期二第9-10节{1-16周}', '东下院312', '', '面授讲课', 167, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH937', 'teacher45', '星期四第9-10节{1-16周}', '东中院3-406', '', '面授讲课', 127, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH942', 'teacher10', '星期三第11-13节{1-11周}', '东上院106', '', '面授讲课', 145, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH944', 'teacher12', '星期四第9-10节{1-16周}', '东中院4-204', '欢迎热爱诗歌和中国古典文学的全校本科生', '面授讲课', 110, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH945', 'teacher4', '星期三第11-12节{1-16周}', '下院310', '', '面授讲课', 146, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CH946', 'teacher15', '星期四第9-10节{1-16周}', '东中院2-403', '', '面授讲课', 140, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CI903', 'teacher46', '星期二第11-13节{1-11周}', '上院204', '', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL001', 'teacher159', '星期一第9-10节{1-16周}', '东中院3-204', '', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL002', 'teacher160', '星期四第9-10节{1-16周}', '东中院4-106', '', '面授讲课', 126, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL024', 'teacher161', '星期一第7-8节{1-16周}', '东中院4-104', '周一第七、第八节', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL025', 'teacher162', '星期一第9-10节{1-16周}', '东中院4-202', 'The_class_is_taught_in_English', '面授讲课', 167, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL031', 'teacher163', '星期四第9-10节{1-16周}', '东中院2-306', '', '面授讲课', 67, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL046', 'teacher247', '星期一第11-13节{9-14周}\\n星期四第11-13节{9-14周}', '上院318', '敦煌研究院多位老师合上。3节连排，9-14周。每周2次（建议排周一、周四9-11节，或者周二、周五9-11节）', '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL900', 'teacher14', '星期四第11-13节{1-16周}', '上院310', '', '面授讲课', 60, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL907', 'teacher47', '星期四第9-10节{1-16周}', '东上院308', '', '面授讲课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL908', 'teacher48', '星期四第9-10节{1-16周}', '东中院3-104', '', '面授讲课', 109, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL909', 'teacher49', '星期四第9-10节{1-16周}', '东中院4-102', '无选课学科方面限制', '面授讲课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL915', 'teacher50', '星期二第9-10节{1-16周}', '上院108', '面向非英语专业本科生', '面授讲课', 168, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL916', 'teacher51', '星期四第11-13节{1-11周}', '下院206', '', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CL918', 'teacher52', '星期四第9-10节{1-16周}', '东中院3-306', '', '面授讲课', 131, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS057', 'teacher164', '星期二第9-10节{1-16周}', '东中院4-406', '简单C++编程经历', '面授讲课', 34, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS085', 'teacher165', '星期三第11-13节{5-15周}', '不排教室', '地址：学生创新中心B楼301', '面授讲课', 166, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS096', 'teacher166', '星期四第11-13节{5-15周}', '不排教室', '地址：学生创新中心B楼301', '面授讲课', 51, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS155', 'teacher167', '星期一第11-13节{1-16周}', '不排教室', '地址：学生创新中心B楼102', '面授讲课', 58, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS166', 'teacher120', '星期四第11-13节{1-6周}', '不排教室', '地址：学生创新中心A楼504', '面授讲课', 146, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS902', 'teacher53', '星期二第11-13节{1-16周}', '上院108', '上课32学时+上机实践16学时', '面授讲课', 47, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'CS904', 'teacher249', '星期一第11-12节{1-8周}\\n星期三第11-12节{1-8周}', '上院310', '站在伦理道德角度，思考计算机科学问题，展望信息技术发展趋势，目的是铸造更好的未来。', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'DR001', 'teacher168', '星期二第9-10节{1-16周}', '中院114', '', '面授讲课', 98, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'DR002', 'teacher169', '星期二第11-12节{1-16周}', '中院114', '', '面授讲课', 103, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'DR014', 'teacher127', '星期四第9-10节{1-16周}', '上院101', '', '面授讲课', 161, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'DR015', 'teacher128', '星期二第9-10节{1-16周}', '东下院303', '', '面授讲课', 86, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EC016', 'teacher170', '星期四第11-12节{1-16周}', '上院102', '', '面授讲课', 150, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EC100', 'teacher171', '星期二第9-10节{1-16周}', '东中院3-404', '', '面授讲课', 147, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EC901', 'teacher54', '星期二第9-10节{1-16周}', '东中院3-105', '', '面授讲课', 49, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EC905', 'teacher55', '星期四第9-10节{1-16周}', '东中院4-202', '', '面授讲课', 33, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ED903', 'teacher56', '星期二第9-10节{1-16周}', '东中院3-406', '', '面授讲课', 159, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EE031', 'teacher116', '星期四第11-13节{5-15周}', '不排教室', '时间：5~15周，周四11~13节，地址：学生创新中心思源楼310', '面授讲课', 61, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EN902', 'teacher57', '星期二第9-10节{1-16周}', '东中院4-102', '', '面授讲课', 52, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EN908', 'teacher58', '星期二第11-12节{1-16周}', '中院207', '已通过水平考试（一年级学生需三级以上水平）', '面授讲课', 78, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ES901', 'teacher59', '星期五第9-10节{1-16周}', '东中院4-307', '', '面授讲课', 132, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV019', 'teacher172', '星期二第9-10节{1-16周}', '下院306', '无先修课程要求', '面授讲课', 114, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV053', 'teacher264', '星期二第11-13节{5-15周}', '不排教室', '时间：5-15周 周二 11～13节 地址：学生创新中心 ET实验室', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV053', 'teacher265', '星期二第11-13节{5-15周}', '不排教室', '时间：5-15周 周二 11～13节 地址：学生创新中心 ET实验室', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV901', 'teacher240', '星期五第9-10节{1-8周}', '东中院4-101', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV901', 'teacher241', '星期五第9-10节{1-8周}', '东中院4-101', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV901', 'teacher242', '星期五第9-10节{1-16周}', '东中院4-101', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV902', 'teacher60', '星期二第11-13节{1-11周}', '上院115', '', '面授讲课', 95, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'EV904', 'teacher13', '星期二第11-13节{1-11周}', '上院201', '', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FI005', 'teacher173', '星期四第11-13节{1-11周}', '东下院312', '安泰经管学院及金融辅修不可选', '面授讲课', 38, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FI453', 'teacher174', '星期二第9-10节{1-16周}', '上院313', '', '面授讲课', 33, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FO001', 'teacher278', '星期二第9-10节{1-16周}\\n星期四第9-10节{1-16周}', '东中院1-302', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FO005', 'teacher248', '星期一第9-10节{1-16周}\\n星期四第9-10节{1-16周}', '上院202', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FT011', 'teacher175', '星期五第6-8节{5-15周}', '东中院4-202', '面向2020级新生。', '面授讲课', 158, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FT018', 'teacher176', '星期四第11-13节{1-11周}', '上院112', '', '面授讲课', 52, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'FT023', 'teacher177', '星期一第11-13节{1-11周}', '中院310', '', '面授讲课', 116, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'GA407', 'teacher178', '星期五第9-10节{1-16周}', '东中院3-404', '中文不流利的留学生慎选。风景园林系的同学不要选。', '面授讲课', 156, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'GA901', 'teacher61', '星期四第11-13节{1-11周}', '上院100', '', '面授讲课', 100, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'GA903', 'teacher3', '星期二第11-13节{1-11周}', '上院102', '对风景园林艺术感兴趣，专业不限，大作业为团队合作形式，需要点创意！由于第一周开课，因此大一的学生不建议选课！！！', '面授讲课', 75, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI102', 'teacher179', '星期一第11-13节{1-16周}', '上院317', '', '面授讲课', 60, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI902', 'teacher62', '星期二第11-13节{1-11周}', '下院209', '', '面授讲课', 164, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI903', 'teacher63', '星期二第9-10节{1-16周}', '东中院3-306', '', '面授讲课', 85, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI904', 'teacher64', '星期二第9-10节{1-16周}', '上院207', '英汉双语，英语视同学们水平而定', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI927', 'teacher65', '星期二第9-10节{1-16周}', '东中院2-306', '', '面授讲课', 94, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI942', 'teacher8', '星期三第11-13节{1-11周}', '上院313', '', '面授讲课', 109, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI943', 'teacher11', '星期二第9-10节{1-16周}', '东中院3-204', '', '面授讲课', 137, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'HI949', 'teacher18', '星期四第9-10节{1-16周}', '东中院2-303', '', '面授讲课', 82, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'IN901', 'teacher66', '星期四第9-10节{1-16周}', '不排教室', '上课地点：闵行校区图书馆主馆一楼B120', '面授讲课', 86, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'IO024', 'teacher180', '星期五第11-13节{1-11周}', '不排教室', '地址：学生创新中心A楼504', '面授讲课', 96, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'IO025', 'teacher117', '星期四第9-10节{5-12周}', '不排教室', '学生创新中心B楼401', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'JA001', 'teacher279', '星期二第9-10节{1-16周}\\n星期四第9-10节{1-16周}', '东中院3-102', '使用教材：新版《中日交流标准日本语》（第二版）初级（上），人民教育出版社。考试形式：笔记+口试', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'JA017', 'teacher181', '星期二第9-10节{1-16周}', '东中院3-302', '本课程欢迎对日本文化社会感兴趣的同学报名，不需要具备日语基础。', '面授讲课', 160, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'JC031', 'teacher182', '星期五第9-10节{1-16周}', '上院409', '', '面授讲课', 161, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'JC903', 'teacher67', '星期五第11-13节{5-15周}', '下院310', '面向2020级新生。', '面授讲课', 152, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LA024', 'teacher183', '星期三第11-13节{1-16周}', '下院508', '', '面授讲课', 131, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LA029', 'teacher122', '星期三第11-13节{1-11周}', '上院102', '', '面授讲课', 100, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LA938', 'teacher6', '星期二第11-12节{1-15周(单)}', '上院205', '', '面授讲课', 35, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LI901', 'teacher68', '星期四第11-12节{1-16周}', '上院313', '', '面授讲课', 98, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LI903', 'teacher69', '星期二第9-10节{1-16周}', '下院209', '欢迎有良好英语基础，并且对英语诗歌有兴趣的同学加入本课程的学习和探讨。', '面授讲课', 51, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LI910', 'teacher2', '星期二第9-10节{1-16周}', '东中院4-104', '', '面授讲课', 167, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LO901', 'teacher70', '星期二第9-10节{1-16周}', '东上院308', '', '面授讲课', 89, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LT002', 'teacher184', '星期一第9-10节{1-16周}', '下院307', '', '面授讲课', 158, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'LT004', 'teacher185', '星期一第11-12节{1-16周}', '下院307', '', '面授讲课', 90, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MA194', 'teacher186', '星期三第11-13节{1-16周}', '下院212', '', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MA278', 'teacher126', '星期二第9-10节{1-16周}', '东中院4-201', '', '面授讲课', 51, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MA906', 'teacher71', '星期二第11-13节{2-12周}', '下院107', '', '面授讲课', 112, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MA908', 'teacher72', '星期二第11-13节{1-16周}', '下院112', '预备知识：高等数学/线性代数', '面授讲课', 58, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MA909', 'teacher73', '星期二第9-10节{1-16周}', '上院310', '', '面授讲课', 127, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME034', 'teacher187', '星期二第9-10节{5-12周}', '不排教室', '地址：学生创新中心思源楼105', '面授讲课', 86, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME055', 'teacher188', '星期三第11-12节{1-16周}', '上院210', '', '面授讲课', 168, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME069', 'teacher189', '星期二第9-10节{1-8周}', '东中院2-203', '开课时间1-8周周二9-10节', '面授讲课', 160, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME085', 'teacher190', '星期二第11-13节{1-16周}', '下院508', '', '面授讲课', 153, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME096', 'teacher191', '星期一第9-10节{1-16周}', '上院205', '', '面授讲课', 142, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME117', 'teacher192', '星期二第11-13节{1-16周}', '中院105', '', '面授讲课', 124, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME128', 'teacher193', '星期二第11-13节{5-15周}', '不排教室', '地址：学生创新中心B楼305', '面授讲课', 34, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME135', 'teacher194', '星期一第11-13节{5-15周}', '不排教室', '时间：5~15周周一11~13节，地址：学生创新中心C楼201', '面授讲课', 114, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME140', 'teacher280', '星期二第11-12节{1-16周}', '中院310', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME140', 'teacher281', '星期二第11-12节{1-16周}', '中院310', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME140', 'teacher282', '星期二第11-12节{1-16周}', '中院310', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME141', 'teacher195', '星期四第11-13节{5-15周}', '不排教室', '地址：学生创新中心B楼303', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME142', 'teacher246', '星期六第1-4节{1周,5周}\\n星期六第1-4,6-9节{2-4周}', '不排教室', '地址：学生创新中心A楼504', '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME150', 'teacher125', '星期三第2-4节{5-15周}', '不排教室', '时间：5-15周，周三2～4节，地址：学生创新中心C楼201', '面授讲课', 93, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME901', 'teacher74', '星期四第11-13节{5-15周}', '不排教室', '时间：5-15周，周四，11～13节，地址：学生创新中心，思源楼200号', '面授讲课', 55, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME902', 'teacher75', '星期一第9-10节{1-16周}', '东中院4-404', '', '面授讲课', 90, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME903', 'teacher76', '星期四第11-13节{1-11周}', '东中院4-404', '', '面授讲课', 36, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME904', 'teacher77', '星期四第11-13节{5-15周}', '中院411', '本课程面向全校所有专业所有年级（其中，机动学院仅限1年级）', '面授讲课', 41, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME905', 'teacher78', '星期一第9-10节{1-16周}', '东中院4-204', '', '面授讲课', 129, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'ME908', 'teacher79', '星期二第11-13节{1-11周}', '下院313', '', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT023', 'teacher114', '星期二第11-13节{1-11周}', '下院113', '', '面授讲课', 125, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT901', 'teacher80', '星期一第11-13节{1-11周}', '下院209', '晚上3课时，本课程面对大二或大三非材料专业的学生', '面授讲课', 119, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT903', 'teacher256', '星期一第9-10节{1-16周}', '上院107', '专业、年级不限。中文授课（中文不熟练者，可用英语完成作业和演讲考核）', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT903', 'teacher257', '星期一第9-10节{1-16周}', '上院107', '专业、年级不限。中文授课（中文不熟练者，可用英语完成作业和演讲考核）', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT903', 'teacher258', '星期一第9-10节{1-16周}', '上院107', '专业、年级不限。中文授课（中文不熟练者，可用英语完成作业和演讲考核）', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT906', 'teacher81', '星期二第9-10节{1-16周}', '上院107', '无专业限制，无先修课程要求。', '面授讲课', 69, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT908', 'teacher252', '星期一第11-13节{5-10周}', '上院409', NULL, '面讲授课', 130, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MT908', 'teacher253', '星期一第11-13节{11-15周}', '上院409', NULL, '面讲授课', 156, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU033', 'teacher196', '星期二第11-13节{1-16周}', '下院211', '', '面授讲课', 114, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU041', 'teacher197', '星期二第11-13节{1-11周}', '逸夫楼200', '课程以美声唱法为主辅以通俗唱法；要求嗓音条件较好，音准节奏较好、性格开朗热情，首次课进行嗓音条件筛选；另若音准、节奏不好，无法通过本课程立即改善。上课地点逸夫楼200。', '面授讲课', 161, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU042', 'teacher198', '星期二第9-10节{1-16周}', '逸夫楼200', '要求节奏较好；人手一鼓已备；每周需录制视频作业，按作业质量打分累计。', '面授讲课', 152, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU047', 'teacher199', '星期二第11-12节{1-16周}', '东中院4-402', '', '面授讲课', 137, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU048', 'teacher200', '星期四第11-12节{1-16周}', '东上院304', '', '面授讲课', 81, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU901', 'teacher82', '星期四第9-10节{1-16周}', '东上院304', '', '面授讲课', 61, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU902', 'teacher83', '星期二第9-10节{1-16周}', '东上院304', '', '面授讲课', 36, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'MU903', 'teacher84', '星期二第9-10节{1-16周}', '下院211', '', '面授讲课', 77, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'NA009', 'teacher201', '星期三第11-12节{1-16周}', '上院204', '船舶海洋工程、土木工程、水环境工程、流体机械工程等专业学生优选', '面授讲课', 129, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'NT901', 'teacher85', '星期五第9-10节{1-16周}', '东中院4-204', '', '面授讲课', 132, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'OC901', 'teacher86', '星期二第11-13节{5-15周}', '上院310', '除船舶与海洋工程专业外的全校本科生均可选课', '面授讲课', 135, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'OC902', 'teacher243', '星期二第9-10节{1-8周}', '东中院4-404', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'OC902', 'teacher244', '星期二第9-10节{1-8周}', '东中院4-404', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PE005', 'teacher202', '星期四第9-10节{1-8周}', '不排教室', '围棋，上课地点:南区体育场二楼教室', '面授讲课', 123, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PE006', 'teacher203', '星期二第9-10节{1-16周}', '不排教室', '上课地点：胡法光楼211。', '面授讲课', 140, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PH010', 'teacher204', '星期一第9-10节{1-16周}', '东下院205', '', '面授讲课', 144, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PH053', 'teacher283', '星期一第11-12节{1-8周}\\n星期四第11-12节{1-8周}', '上院318', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI005', 'teacher205', '星期三第11-13节{1-16周}', '上院317', '', '面授讲课', 63, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI021', 'teacher206', '星期一第9-10节{1-16周}', '东中院4-102', '', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI906', 'teacher87', '星期二第9-10节{1-16周}', '东中院4-302', '', '面授讲课', 70, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI913', 'teacher88', '星期四第11-13节{1-16周}', '上院207', '', '面授讲课', 87, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI925', 'teacher89', '星期二第9-10节{1-16周}', '东中院4-202', '', '面授讲课', 76, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI928', 'teacher90', '星期三第11-12节{1-16周}', '上院312', '', '面授讲课', 158, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI929', 'teacher9', '星期五第11-12节{1-16周}', '上院310', '', '面授讲课', 93, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI930', 'teacher17', '星期二第9-10节{1-16周}', '东中院2-103', '', '面授讲课', 33, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PI931', 'teacher19', '星期四第9-10节{1-16周}', '东中院1-108', '', '面授讲课', 81, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PL004', 'teacher207', '星期四第9-10节{9-16周}', '东中院4-406', '中文不流利的留学生慎选。2019级风景园林系的同学不要选。', '面授讲课', 95, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PL015', 'teacher208', '星期一第11-12节{1-16周}', '上院212', '', '面授讲课', 38, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PL028', 'teacher209', '星期三第11-13节{1-11周}', '上院212', '', '面授讲课', 68, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PL031', 'teacher210', '星期一第11-13节{1-11周}', '上院112', '', '面授讲课', 79, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PL902', 'teacher91', '星期二第9-10节{1-16周}', '东中院1-109', '', '面授讲课', 32, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PM005', 'teacher211', '星期二第9-10节{1-16周}', '东中院4-206', '', '面授讲课', 153, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PM010', 'teacher212', '星期二第11-12节{1-16周}', '下院213', '', '面授讲课', 39, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PO012', 'teacher213', '星期二第9-10节{1-16周}', '东中院4-502', '', '面授讲课', 64, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PO202', 'teacher284', '星期一第11-13节{1-11周}', '东中院4-102', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PO202', 'teacher285', '星期一第11-13节{1-11周}', '东中院4-102', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PO903', 'teacher92', '星期五第9-10节{1-16周}', '东中院4-301', '', '面授讲课', 115, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PS009', 'teacher214', '星期一第11-13节{1-16周}', '东下院204', '无强制要求。欢迎对创造力、思维力和哲学思考具有浓厚兴趣和强烈好奇心的同学参加。课程阅读量大，作业多，要求高，请慎选。', '面授讲课', 157, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PS907', 'teacher93', '星期二第11-13节{1-16周}', '上院105', '', '面授讲课', 44, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PS912', 'teacher7', '星期二第9-10节{1-16周}', '东中院4-106', '', '面授讲课', 146, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU004', 'teacher215', '星期三第11-12节{1-16周}', '下院307', '', '面授讲课', 70, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU040', 'teacher216', '星期一第9-10节{1-16周}', '工程馆210', '', '面授讲课', 45, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU045', 'teacher217', '星期二第9-10节{1-16周}', '下院411', '教材使用《当代中国政治制度》中国社会科学出版社2019版，李寿初著。', '面授讲课', 89, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU050', 'teacher218', '星期一第9-10节{1-16周}', '上院207', '', '面授讲课', 156, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU078', 'teacher219', '星期四第9-10节{1-16周}', '上院105', '', '面授讲课', 163, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU086', 'teacher220', '星期四第11-13节{1-11周}', '上院105', '', '面授讲课', 66, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU095', 'teacher221', '星期二第11-13节{1-11周}', '中院205', '欢迎对课程有兴趣的同学，积极参与课堂互动，能够从课程有所收获，而不是单纯为了学分', '面授讲课', 92, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU902', 'teacher94', '星期二第9-10节{1-16周}', '东中院2-106', '', '面授讲课', 57, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU905', 'teacher95', '星期二第9-10节{1-16周}', '东中院3-305', '', '面授讲课', 57, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU906', 'teacher96', '星期一第9-10节{1-16周}', '东中院3-306', '', '面授讲课', 56, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU907', 'teacher245', '星期二第11-12节{1-8周}\\n星期四第9-10节{1-8周}', '东中院4-302', NULL, '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU908', 'teacher97', '星期一第11-13节{1-16周}', '上院207', '', '面授讲课', 93, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU910', 'teacher98', '星期四第9-10节{1-16周}', '东中院3-105', '', '面授讲课', 45, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU917', 'teacher99', '星期三第11-13节{1-16周}', '下院209', '', '面授讲课', 132, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU933', 'teacher100', '星期三第11-13节{1-11周}', '下院410', '', '面授讲课', 56, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU938', 'teacher101', '星期二第9-10节{1-16周}', '东中院1-108', '', '面授讲课', 158, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU941', 'teacher102', '星期一第11-13节{1-11周}', '上院313', '', '面授讲课', 104, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU942', 'teacher103', '星期四第9-10节{1-16周}', '上院107', '', '面授讲课', 96, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'PU981', 'teacher104', '星期四第9-10节{1-16周}', '上院319', '理论与案例相互交融，老师讲授与同学互动每堂课都会体现。一门开脑洞、长见识、需要独立思考的有趣课程。', '面授讲课', 145, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SA001', 'teacher222', '星期二第9-10节{1-16周}', '中院213', '', '面授讲课', 60, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE006', 'teacher223', '星期五第11-13节{5-15周}', '不排教室', '地址：学生创新中心B楼301', '面授讲课', 63, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE123', 'teacher232', '星期一第3-4节{1-16周}\\n星期一第3-4节{1-16周}', '东上院411', '仅限软件工程专业学生选课', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE124', 'teacher233', '星期二第3-4节{1-16周}\\n星期四第3-4节{1-16周}', '东上院411', '仅限软件工程专业学生选课', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE124', 'teacher234', '星期二第3-4节{1-16周}\\n星期四第3-4节{1-16周}', '东上院411', '仅限软件工程专业学生选课', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE125', 'teacher235', '星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}', '东上院411', '仅限软件工程专业学生选课', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE125', 'teacher236', '星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}', '东上院411', '仅限软件工程专业学生选课', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE302', 'teacher237', '星期二第1-2节{1-12周}\\n星期四第9-10节{1-12周}', '东上院411', '系统软件方向必修课，仅限软件工程专业学生选课', '面讲授课', 120, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE332', 'teacher0', '星期二第6-8节{1-16周}', '东上院411', '信息系统方向必修课，仅限软件工程专业学生选课', '面授讲课', 63, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SE344', 'teacher1', '星期四第6-8节{1-16周}', '东上院411', '数字媒体与应用方向必修，仅限软件工程专业学生选课', '面授讲课', 98, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO077', 'teacher224', '星期一第9-10节{1-16周}', '东中院4-104', '', '面授讲课', 136, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO087', 'teacher225', '星期二第11-13节{1-11周}', '东中院3-205', '无限制', '面授讲课', 48, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO094', 'teacher226', '星期四第9-10节{1-16周}', '东中院4-206', '', '面授讲课', 40, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO105', 'teacher129', '星期四第9-10节{1-16周}', '东中院1-107', '', '面授讲课', 126, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO108', 'teacher227', '星期五第9-10节{1-16周}', '东中院3-106', '', '面授讲课', 94, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO120', 'teacher228', '星期二第11-13节{1-11周}', '东中院3-304', '', '面授讲课', 60, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO904', 'teacher105', '星期一第9-10节{1-16周}', '下院209', '', '面授讲课', 74, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO922', 'teacher259', '星期二第11-13节{1-16周}', '上院207', '上海市精品课程，适合于本科生各年级学生选修。教学方式包括环境基础知识的讲授、实地参观、看经典电影、小组讨论和具体案例分析等。考核方式：平时成绩（40%）+ 期末汇报（60%）。', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO922', 'teacher260', '星期二第11-13节{1-16周}', '上院207', '上海市精品课程，适合于本科生各年级学生选修。教学方式包括环境基础知识的讲授、实地参观、看经典电影、小组讨论和具体案例分析等。考核方式：平时成绩（40%）+ 期末汇报（60%）。', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO922', 'teacher261', '星期二第11-13节{1-16周}', '上院207', '上海市精品课程，适合于本科生各年级学生选修。教学方式包括环境基础知识的讲授、实地参观、看经典电影、小组讨论和具体案例分析等。考核方式：平时成绩（40%）+ 期末汇报（60%）。', '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO923', 'teacher106', '星期二第9-10节{1-16周}', '东上院100', '', '面授讲课', 124, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO934', 'teacher107', '星期一第11-12节{1-16周}', '东中院4-201', '', '面授讲课', 116, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO936', 'teacher108', '星期一第9-10节{1-16周}', '中院506', '', '面授讲课', 154, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO937', 'teacher109', '星期二第9-10节{1-16周}', '东中院4-301', '', '面授讲课', 85, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO939', 'teacher110', '星期二第11-13节{1-11周}', '上院202', '', '面授讲课', 87, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO940', 'teacher111', '星期四第9-10节{1-16周}', '东中院4-301', '', '面授讲课', 131, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO941', 'teacher112', '星期一第9-10节{1-16周}', '东中院4-304', '', '面授讲课', 106, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO944', 'teacher113', '星期五第3-5节{1-15周}', '中院205', '', '面授讲课', 76, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO945', 'teacher250', '星期五第11-13节{1-11周}', '工程馆207', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'SO945', 'teacher251', '星期五第11-13节{1-11周}', '工程馆207', NULL, '面讲授课', 160, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'TA001', 'teacher229', '星期二第9-10节{1-16周}', '东中院4-103', '', '面授讲课', 148, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'TH201', 'teacher118', '星期五第9-10节{1-16周}', '东中院2-106', '', '面授讲课', 104, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'TY001', 'teacher286', '星期四第11-13节{2-12周}', '中院505', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'TY001', 'teacher287', '星期四第11-13节{2-12周}', '中院505', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'TY001', 'teacher288', '星期四第11-13节{2-12周}', '中院505', NULL, '面讲授课', 180, 0);
INSERT INTO `section` VALUES ('1', '2020-2021', 'WA002', 'teacher230', '星期五第9-10节{1-16周}', '工程馆210', '', '面授讲课', 41, 0);

SET FOREIGN_KEY_CHECKS = 1;
