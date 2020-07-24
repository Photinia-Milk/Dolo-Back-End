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

 Date: 23/07/2020 17:27:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sectime
-- ----------------------------
DROP TABLE IF EXISTS `sectime`;
CREATE TABLE `sectime`  (
  `timeslotId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `weeks` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teacherUserName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`teacherUserName`, `year`, `courseId`, `semester`, `weeks`, `timeslotId`) USING BTREE,
  INDEX `fk_secTime_timeslot_1`(`timeslotId`) USING BTREE,
  INDEX `fk_secTime_section_1`(`semester`, `year`, `courseId`, `teacherUserName`) USING BTREE,
  CONSTRAINT `fk_secTime_section_1` FOREIGN KEY (`semester`, `year`, `courseId`, `teacherUserName`) REFERENCES `section` (`semester`, `year`, `courseId`, `teacherUserName`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_secTime_timeslot_1` FOREIGN KEY (`timeslotId`) REFERENCES `timeslot` (`timeslotId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sectime
-- ----------------------------
INSERT INTO `sectime` VALUES ('1', '1', '2020-2021', 'SE332', '1-16周', 'teacher0');
INSERT INTO `sectime` VALUES ('1', '1', '2020-2021', 'BU013', '1-11周', 'teacher151');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PU942', '1-16周', 'teacher103');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PU981', '1-16周', 'teacher104');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'SO940', '1-16周', 'teacher111');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'IO025', '5-12周', 'teacher117');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CH944', '1-16周', 'teacher12');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'DR014', '1-16周', 'teacher127');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'SO105', '1-16周', 'teacher129');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AD003', '1-16周', 'teacher131');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AM008', '1-16周', 'teacher133');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AM016', '1-16周', 'teacher134');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AM025', '1-16周', 'teacher135');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BM011', '1-16周', 'teacher148');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BU007', '1-16周', 'teacher149');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CH946', '1-16周', 'teacher15');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BU012', '1-16周', 'teacher150');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL002', '1-16周', 'teacher160');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL031', '1-16周', 'teacher163');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'HI949', '1-16周', 'teacher18');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PI931', '1-16周', 'teacher19');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PE005', '1-8周', 'teacher202');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PL004', '9-16周', 'teacher207');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AR904', '1-16周', 'teacher21');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PU078', '1-16周', 'teacher219');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BI901', '1-16周', 'teacher22');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'SO094', '1-16周', 'teacher226');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'SE302', '1-12周', 'teacher237');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BM902', '1-8周', 'teacher238');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BM902', '1-8周', 'teacher239');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PU907', '1-8周', 'teacher245');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'FO005', '1-16周', 'teacher248');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AI007', '1-16周', 'teacher262');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'AI007', '1-16周', 'teacher263');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'FO001', '1-16周', 'teacher278');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'JA001', '1-16周', 'teacher279');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'BI917', '1-16周', 'teacher29');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CA904', '1-16周', 'teacher33');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CH937', '1-16周', 'teacher45');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL907', '1-16周', 'teacher47');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL908', '1-16周', 'teacher48');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL909', '1-16周', 'teacher49');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'CL918', '1-16周', 'teacher52');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'EC905', '1-16周', 'teacher55');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'IN901', '1-16周', 'teacher66');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'MU901', '1-16周', 'teacher82');
INSERT INTO `sectime` VALUES ('10', '1', '2020-2021', 'PU910', '1-16周', 'teacher98');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'EE031', '5-15周', 'teacher116');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CS166', '1-6周', 'teacher120');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'AU007', '5-15周', 'teacher121');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'AM001', '1-11周', 'teacher132');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CL900', '1-16周', 'teacher14');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'AV020', '1-4周,10-16周', 'teacher143');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'AV022', '5-15周', 'teacher144');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'BU304', '1-11周', 'teacher153');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'BU327', '1-11周', 'teacher155');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CS096', '5-15周', 'teacher166');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'FI005', '1-11周', 'teacher173');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'FT018', '1-11周', 'teacher176');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'ME141', '5-15周', 'teacher195');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'PU086', '1-11周', 'teacher220');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CL046', '9-14周', 'teacher247');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'BI913', '1-16周', 'teacher254');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'BI913', '1-16周', 'teacher255');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'TY001', '2-12周', 'teacher286');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'TY001', '2-12周', 'teacher287');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'TY001', '2-12周', 'teacher288');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CH911', '1-16周', 'teacher36');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'CL916', '1-11周', 'teacher51');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'GA901', '1-11周', 'teacher61');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'ME901', '5-15周', 'teacher74');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'ME903', '1-11周', 'teacher76');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'ME904', '5-15周', 'teacher77');
INSERT INTO `sectime` VALUES ('11', '1', '2020-2021', 'PI913', '1-16周', 'teacher88');
INSERT INTO `sectime` VALUES ('12', '1', '2020-2021', 'AR909', '1-16周', 'teacher16');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'SO904', '1-16周', 'teacher105');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'SO936', '1-16周', 'teacher108');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'SO941', '1-16周', 'teacher112');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'AM314', '1-16周', 'teacher140');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'AR007', '1-16周', 'teacher141');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BI039', '1-16周', 'teacher146');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BI041', '1-16周', 'teacher147');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BU463', '1-16周', 'teacher157');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'CL001', '1-16周', 'teacher159');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'CL025', '1-16周', 'teacher162');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'LT002', '1-16周', 'teacher184');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'ME096', '1-16周', 'teacher191');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'PH010', '1-16周', 'teacher204');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'PI021', '1-16周', 'teacher206');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'PU040', '1-16周', 'teacher216');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'PU050', '1-16周', 'teacher218');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'SO077', '1-16周', 'teacher224');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BI902', '1-16周', 'teacher23');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BM902', '1-4周', 'teacher238');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'BM902', '1-4周', 'teacher239');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'FO005', '1-16周', 'teacher248');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'MT903', '1-16周', 'teacher256');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'MT903', '1-16周', 'teacher257');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'MT903', '1-16周', 'teacher258');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'CH929', '1-16周', 'teacher39');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'ME902', '1-16周', 'teacher75');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'ME905', '1-16周', 'teacher78');
INSERT INTO `sectime` VALUES ('13', '1', '2020-2021', 'PU906', '1-16周', 'teacher96');
INSERT INTO `sectime` VALUES ('14', '1', '2020-2021', 'BI903', '8-16周', 'teacher24');
INSERT INTO `sectime` VALUES ('15', '1', '2020-2021', 'BM904', '1-16周', 'teacher31');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'IO024', '1-11周', 'teacher180');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'SE006', '5-15周', 'teacher223');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'SO945', '1-11周', 'teacher250');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'SO945', '1-11周', 'teacher251');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'CH931', '1-16周', 'teacher40');
INSERT INTO `sectime` VALUES ('16', '1', '2020-2021', 'JC903', '5-15周', 'teacher67');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'TH201', '1-16周', 'teacher118');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'GA407', '1-16周', 'teacher178');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'JC031', '1-16周', 'teacher182');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'SO108', '1-16周', 'teacher227');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'WA002', '1-16周', 'teacher230');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'EV901', '1-8周', 'teacher240');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'EV901', '1-8周', 'teacher241');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'EV901', '1-8周', 'teacher242');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'ES901', '1-16周', 'teacher59');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'NT901', '1-16周', 'teacher85');
INSERT INTO `sectime` VALUES ('17', '1', '2020-2021', 'PO903', '1-16周', 'teacher92');
INSERT INTO `sectime` VALUES ('18', '1', '2020-2021', 'CH072', '1-16周', 'teacher158');
INSERT INTO `sectime` VALUES ('18', '1', '2020-2021', 'EC016', '1-16周', 'teacher170');
INSERT INTO `sectime` VALUES ('18', '1', '2020-2021', 'MU048', '1-16周', 'teacher200');
INSERT INTO `sectime` VALUES ('18', '1', '2020-2021', 'PH053', '1-8周', 'teacher283');
INSERT INTO `sectime` VALUES ('18', '1', '2020-2021', 'LI901', '1-16周', 'teacher68');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'SO934', '1-16周', 'teacher107');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'LT004', '1-16周', 'teacher185');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'PL015', '1-16周', 'teacher208');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'CS904', '1-8周', 'teacher249');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher266');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher267');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher268');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher269');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher270');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher271');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher272');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher273');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher274');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'AV012', '1-16周', 'teacher275');
INSERT INTO `sectime` VALUES ('19', '1', '2020-2021', 'PH053', '1-8周', 'teacher283');
INSERT INTO `sectime` VALUES ('2', '1', '2020-2021', 'SE344', '1-16周', 'teacher1');
INSERT INTO `sectime` VALUES ('20', '1', '2020-2021', 'SO944', '1-15周', 'teacher113');
INSERT INTO `sectime` VALUES ('21', '1', '2020-2021', 'CA099', '5-8周', 'teacher124');
INSERT INTO `sectime` VALUES ('22', '1', '2020-2021', 'ME150', '5-15周', 'teacher125');
INSERT INTO `sectime` VALUES ('23', '1', '2020-2021', 'CL024', '1-16周', 'teacher161');
INSERT INTO `sectime` VALUES ('24', '1', '2020-2021', 'FT011', '5-15周', 'teacher175');
INSERT INTO `sectime` VALUES ('25', '1', '2020-2021', 'SE123', '1-16周', 'teacher232');
INSERT INTO `sectime` VALUES ('26', '1', '2020-2021', 'SE123', '1-16周', 'teacher232');
INSERT INTO `sectime` VALUES ('27', '1', '2020-2021', 'SE124', '1-16周', 'teacher233');
INSERT INTO `sectime` VALUES ('27', '1', '2020-2021', 'SE124', '1-16周', 'teacher234');
INSERT INTO `sectime` VALUES ('28', '1', '2020-2021', 'SE124', '1-16周', 'teacher233');
INSERT INTO `sectime` VALUES ('28', '1', '2020-2021', 'SE124', '1-16周', 'teacher234');
INSERT INTO `sectime` VALUES ('29', '1', '2020-2021', 'SE125', '1-16周', 'teacher235');
INSERT INTO `sectime` VALUES ('29', '1', '2020-2021', 'SE125', '1-16周', 'teacher236');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PU938', '1-16周', 'teacher101');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'SO923', '1-16周', 'teacher106');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'SO937', '1-16周', 'teacher109');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'HI943', '1-16周', 'teacher11');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MA278', '1-16周', 'teacher126');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'DR015', '1-16周', 'teacher128');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'AD001', '1-16周', 'teacher130');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'AM062', '1-16周', 'teacher136');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'AM108', '1-16周', 'teacher139');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'BU426', '1-16周', 'teacher156');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'CS057', '1-16周', 'teacher164');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'DR001', '1-16周', 'teacher168');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PI930', '1-16周', 'teacher17');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'EC100', '1-16周', 'teacher171');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'EV019', '1-16周', 'teacher172');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'FI453', '1-16周', 'teacher174');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'JA017', '1-16周', 'teacher181');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'ME034', '5-12周', 'teacher187');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'ME069', '1-8周', 'teacher189');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MU042', '1-16周', 'teacher198');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'LI910', '1-16周', 'teacher2');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PE006', '1-16周', 'teacher203');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PM005', '1-16周', 'teacher211');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PO012', '1-16周', 'teacher213');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PU045', '1-16周', 'teacher217');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'SA001', '1-16周', 'teacher222');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'TA001', '1-16周', 'teacher229');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'OC902', '1-8周', 'teacher243');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'OC902', '1-8周', 'teacher244');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'BI905', '1-16周', 'teacher25');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'BI907', '1-16周', 'teacher26');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'FO001', '1-16周', 'teacher278');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'JA001', '1-16周', 'teacher279');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'BM903', '1-16周', 'teacher30');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'CH902', '1-16周', 'teacher34');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'CH936', '1-16周', 'teacher44');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'CL915', '1-16周', 'teacher50');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'EC901', '1-16周', 'teacher54');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'ED903', '1-16周', 'teacher56');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'EN902', '1-16周', 'teacher57');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'HI903', '1-16周', 'teacher63');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'HI904', '1-16周', 'teacher64');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'HI927', '1-16周', 'teacher65');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'LI903', '1-16周', 'teacher69');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PS912', '1-16周', 'teacher7');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'LO901', '1-16周', 'teacher70');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MA909', '1-16周', 'teacher73');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MT906', '1-16周', 'teacher81');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MU902', '1-16周', 'teacher83');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'MU903', '1-16周', 'teacher84');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PI906', '1-16周', 'teacher87');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PI925', '1-16周', 'teacher89');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PL902', '1-16周', 'teacher91');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PU902', '1-16周', 'teacher94');
INSERT INTO `sectime` VALUES ('3', '1', '2020-2021', 'PU905', '1-16周', 'teacher95');
INSERT INTO `sectime` VALUES ('30', '1', '2020-2021', 'SE125', '2-16周(双)', 'teacher235');
INSERT INTO `sectime` VALUES ('30', '1', '2020-2021', 'SE125', '2-16周(双)', 'teacher236');
INSERT INTO `sectime` VALUES ('31', '1', '2020-2021', 'SE302', '1-12周', 'teacher237');
INSERT INTO `sectime` VALUES ('32', '1', '2020-2021', 'ME142', '1周,5周', 'teacher246');
INSERT INTO `sectime` VALUES ('32', '1', '2020-2021', 'ME142', '2-4周', 'teacher246');
INSERT INTO `sectime` VALUES ('33', '1', '2020-2021', 'ME142', '2-4周', 'teacher246');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO939', '1-11周', 'teacher110');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'MT023', '1-11周', 'teacher114');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'AV023', '5-15周', 'teacher115');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'EV904', '1-11周', 'teacher13');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'AM070', '1-11周', 'teacher138');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'BU320', '6-16周', 'teacher154');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'ME085', '1-16周', 'teacher190');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'ME117', '1-16周', 'teacher192');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'ME128', '5-15周', 'teacher193');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'MU033', '1-16周', 'teacher196');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'MU041', '1-11周', 'teacher197');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'PU095', '1-11周', 'teacher221');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO087', '1-11周', 'teacher225');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO120', '1-11周', 'teacher228');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO922', '1-16周', 'teacher259');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO922', '1-16周', 'teacher260');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'SO922', '1-16周', 'teacher261');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'BI912', '1-11周', 'teacher27');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'BI916', '1-11周', 'teacher28');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'GA903', '1-11周', 'teacher3');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'BM908', '1-11周', 'teacher32');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'CH926', '1-16周', 'teacher37');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'CH932', '1-11周', 'teacher41');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'CI903', '1-11周', 'teacher46');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'CS902', '1-16周', 'teacher53');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'EV902', '1-11周', 'teacher60');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'HI902', '1-11周', 'teacher62');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'MA906', '2-12周', 'teacher71');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'MA908', '1-16周', 'teacher72');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'ME908', '1-11周', 'teacher79');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'OC901', '5-15周', 'teacher86');
INSERT INTO `sectime` VALUES ('4', '1', '2020-2021', 'PS907', '1-16周', 'teacher93');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'CH079', '1-16周', 'teacher123');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'ME055', '1-16周', 'teacher188');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'NA009', '1-16周', 'teacher201');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'PU004', '1-16周', 'teacher215');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'CS904', '1-8周', 'teacher249');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'BM021', '1-16周', 'teacher276');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'BM021', '1-16周', 'teacher277');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'CH906', '1-16周', 'teacher35');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'CH945', '1-16周', 'teacher4');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'CH935', '1-16周', 'teacher43');
INSERT INTO `sectime` VALUES ('5', '1', '2020-2021', 'PI928', '1-16周', 'teacher90');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PU941', '1-11周', 'teacher102');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'CH078', '1-16周', 'teacher119');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'AM065', '1-11周', 'teacher137');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'AV001', '2-12周', 'teacher142');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'CS155', '1-16周', 'teacher167');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'FT023', '1-11周', 'teacher177');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'HI102', '1-16周', 'teacher179');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'ME135', '5-15周', 'teacher194');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PL031', '1-11周', 'teacher210');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PS009', '1-16周', 'teacher214');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'CL046', '9-14周', 'teacher247');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'MT908', '5-10周', 'teacher252');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'MT908', '11-15周', 'teacher253');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PO202', '1-11周', 'teacher284');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PO202', '1-11周', 'teacher285');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'CH934', '1-16周', 'teacher42');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'BI920', '1-11周', 'teacher5');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'MT901', '1-11周', 'teacher80');
INSERT INTO `sectime` VALUES ('6', '1', '2020-2021', 'PU908', '1-16周', 'teacher97');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'BU017', '1-16周', 'teacher152');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'DR002', '1-16周', 'teacher169');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'MU047', '1-16周', 'teacher199');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'PM010', '1-16周', 'teacher212');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'PU907', '1-8周', 'teacher245');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'ME140', '1-16周', 'teacher280');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'ME140', '1-16周', 'teacher281');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'ME140', '1-16周', 'teacher282');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'EN908', '1-16周', 'teacher58');
INSERT INTO `sectime` VALUES ('7', '1', '2020-2021', 'LA938', '1-15周(单)', 'teacher6');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'CH942', '1-11周', 'teacher10');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'PU933', '1-11周', 'teacher100');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'LA029', '1-11周', 'teacher122');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'BE002', '5-15周', 'teacher145');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'CS085', '5-15周', 'teacher165');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'LA024', '1-16周', 'teacher183');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'MA194', '1-16周', 'teacher186');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'AM922', '1-11周', 'teacher20');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'PI005', '1-16周', 'teacher205');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'PL028', '1-11周', 'teacher209');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'EV053', '5-15周', 'teacher264');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'EV053', '5-15周', 'teacher265');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'CH927', '1-16周', 'teacher38');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'HI942', '1-11周', 'teacher8');
INSERT INTO `sectime` VALUES ('8', '1', '2020-2021', 'PU917', '1-16周', 'teacher99');
INSERT INTO `sectime` VALUES ('9', '1', '2020-2021', 'PI929', '1-16周', 'teacher9');

SET FOREIGN_KEY_CHECKS = 1;
