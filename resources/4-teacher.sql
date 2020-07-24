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

 Date: 23/07/2020 17:32:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `deptName` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `rank` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userName`) USING BTREE,
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`userName`) REFERENCES `userauth` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('teacher0', '', '研究员', '蔡鸿明');
INSERT INTO `teacher` VALUES ('teacher1', '', '副教授', '肖双九');
INSERT INTO `teacher` VALUES ('teacher10', '', '教授', '杨庆存');
INSERT INTO `teacher` VALUES ('teacher100', '', '副教授', '郑晓华');
INSERT INTO `teacher` VALUES ('teacher101', '', '讲师(高校)', '章伟');
INSERT INTO `teacher` VALUES ('teacher102', '', '讲师(高校)', '卢永彬');
INSERT INTO `teacher` VALUES ('teacher103', '', '副教授', '魏英杰');
INSERT INTO `teacher` VALUES ('teacher104', '', '副教授', '周国华');
INSERT INTO `teacher` VALUES ('teacher105', '', '教授', '吴诗玉');
INSERT INTO `teacher` VALUES ('teacher106', '', '教授', '谢金文');
INSERT INTO `teacher` VALUES ('teacher107', '', '教授', '薛可');
INSERT INTO `teacher` VALUES ('teacher108', '', '讲师(高校思政)', '金韦明');
INSERT INTO `teacher` VALUES ('teacher109', '', '副教授', '张录法');
INSERT INTO `teacher` VALUES ('teacher11', '', '教授', '邱澎生');
INSERT INTO `teacher` VALUES ('teacher110', '', '副教授', '王茜');
INSERT INTO `teacher` VALUES ('teacher111', '', '讲师(高校)', '杜江勤');
INSERT INTO `teacher` VALUES ('teacher112', '', '副教授', '李晓静');
INSERT INTO `teacher` VALUES ('teacher113', '', '教授', '丁显廷');
INSERT INTO `teacher` VALUES ('teacher114', '', '高级工程师', '陈彬');
INSERT INTO `teacher` VALUES ('teacher115', '', '副研究员', '宋立博');
INSERT INTO `teacher` VALUES ('teacher116', '', '副研究员', '宋立博');
INSERT INTO `teacher` VALUES ('teacher117', '', '实验师', '陈力波');
INSERT INTO `teacher` VALUES ('teacher118', '', '教授', '陈锡喜');
INSERT INTO `teacher` VALUES ('teacher119', '', '教授', '周斌');
INSERT INTO `teacher` VALUES ('teacher12', '', '副教授', '姚旭峰');
INSERT INTO `teacher` VALUES ('teacher120', '', '工程师', '金晔');
INSERT INTO `teacher` VALUES ('teacher121', '', '工程师', '董德礼');
INSERT INTO `teacher` VALUES ('teacher122', '', '副教授', '张晓梅');
INSERT INTO `teacher` VALUES ('teacher123', '', '副教授', '姚大勇');
INSERT INTO `teacher` VALUES ('teacher124', '', '无', '樊柳荫');
INSERT INTO `teacher` VALUES ('teacher125', '', '工程师', '徐巍');
INSERT INTO `teacher` VALUES ('teacher126', '', '教授', '王维克');
INSERT INTO `teacher` VALUES ('teacher127', '', '教授', '李钢');
INSERT INTO `teacher` VALUES ('teacher128', '', '教授', '李钢');
INSERT INTO `teacher` VALUES ('teacher129', '', '无', '张远新');
INSERT INTO `teacher` VALUES ('teacher13', '', '副教授', '殷杉');
INSERT INTO `teacher` VALUES ('teacher130', '', '讲师(高校)', '马红冰');
INSERT INTO `teacher` VALUES ('teacher131', '', '讲师(高校)', '马红冰');
INSERT INTO `teacher` VALUES ('teacher132', '', '教授', '李寿德');
INSERT INTO `teacher` VALUES ('teacher133', '', '副教授', '莫童');
INSERT INTO `teacher` VALUES ('teacher134', '', '副研究馆员', '陆宏弟');
INSERT INTO `teacher` VALUES ('teacher135', '', '教授', '杨忠直');
INSERT INTO `teacher` VALUES ('teacher136', '', '副教授', '井淼');
INSERT INTO `teacher` VALUES ('teacher137', '', '副教授', '李海刚');
INSERT INTO `teacher` VALUES ('teacher138', '', '副教授', '李海刚');
INSERT INTO `teacher` VALUES ('teacher139', '', '教授', '史清华');
INSERT INTO `teacher` VALUES ('teacher14', '', '教授', '陈业新');
INSERT INTO `teacher` VALUES ('teacher140', '', '副教授', '胡巍');
INSERT INTO `teacher` VALUES ('teacher141', '', '讲师(高校)', '马红冰');
INSERT INTO `teacher` VALUES ('teacher142', '', '副教授', '康小明');
INSERT INTO `teacher` VALUES ('teacher143', '', '实验师', '吴俊琦');
INSERT INTO `teacher` VALUES ('teacher144', '', '工程师', '钟兴军');
INSERT INTO `teacher` VALUES ('teacher145', '', '工程师', '董德礼');
INSERT INTO `teacher` VALUES ('teacher146', '', '副教授', '熊丽琴');
INSERT INTO `teacher` VALUES ('teacher147', '', '副教授', '赵耕春');
INSERT INTO `teacher` VALUES ('teacher148', '', '教授', '王莲芸');
INSERT INTO `teacher` VALUES ('teacher149', '', '讲师(高校)', '王爱民');
INSERT INTO `teacher` VALUES ('teacher15', '', '教授', '张全之');
INSERT INTO `teacher` VALUES ('teacher150', '', '副教授', '刘欣');
INSERT INTO `teacher` VALUES ('teacher151', '', '副教授', '李杰');
INSERT INTO `teacher` VALUES ('teacher152', '', '讲师(高校)', '汪蓉');
INSERT INTO `teacher` VALUES ('teacher153', '', '讲师(高校)', '庄晖');
INSERT INTO `teacher` VALUES ('teacher154', '', '教授', '曾赛星');
INSERT INTO `teacher` VALUES ('teacher155', '', '副教授', '侯建荣');
INSERT INTO `teacher` VALUES ('teacher156', '', '副教授', '黄采金');
INSERT INTO `teacher` VALUES ('teacher157', '', '教授', '顾孟迪');
INSERT INTO `teacher` VALUES ('teacher158', '', '副教授', '邓刚');
INSERT INTO `teacher` VALUES ('teacher159', '', '教授', '高宣扬KHA-SAEN-YANG');
INSERT INTO `teacher` VALUES ('teacher16', '', '教授', '周斌');
INSERT INTO `teacher` VALUES ('teacher160', '', '讲师(高校)', '孟令兵');
INSERT INTO `teacher` VALUES ('teacher161', '', '讲师(高校)', '陈爱国');
INSERT INTO `teacher` VALUES ('teacher162', '', '副教授', '张朝阳');
INSERT INTO `teacher` VALUES ('teacher163', '', '教授', '陈鹏');
INSERT INTO `teacher` VALUES ('teacher164', '', '副教授', '赵现朝');
INSERT INTO `teacher` VALUES ('teacher165', '', '教授', '杨旭波');
INSERT INTO `teacher` VALUES ('teacher166', '', '教授', '杨旭波');
INSERT INTO `teacher` VALUES ('teacher167', '', '副教授', '黄宏成');
INSERT INTO `teacher` VALUES ('teacher168', '', '副教授', '徐庆华');
INSERT INTO `teacher` VALUES ('teacher169', '', '副教授', '徐庆华');
INSERT INTO `teacher` VALUES ('teacher17', '', '讲师(高校)', '黄远帆');
INSERT INTO `teacher` VALUES ('teacher170', '', '教授', '杨忠直');
INSERT INTO `teacher` VALUES ('teacher171', '', '副教授', '汤石章');
INSERT INTO `teacher` VALUES ('teacher172', '', '研究员', '靳强');
INSERT INTO `teacher` VALUES ('teacher173', '', '副教授', '卓建伟');
INSERT INTO `teacher` VALUES ('teacher174', '', '副教授', '蔡明超');
INSERT INTO `teacher` VALUES ('teacher175', '', '副教授', '施立峻');
INSERT INTO `teacher` VALUES ('teacher176', '', '教授', '易存国');
INSERT INTO `teacher` VALUES ('teacher177', '', '副教授', '王宇平');
INSERT INTO `teacher` VALUES ('teacher178', '', '副教授', '李洁');
INSERT INTO `teacher` VALUES ('teacher179', '', '讲师(高校)', '吴新忠');
INSERT INTO `teacher` VALUES ('teacher18', '', '助理研究员', '赵玉蕙');
INSERT INTO `teacher` VALUES ('teacher180', '', '副教授', '杜志敏');
INSERT INTO `teacher` VALUES ('teacher181', '', '副教授', '王琳');
INSERT INTO `teacher` VALUES ('teacher182', '', '教授', '易存国');
INSERT INTO `teacher` VALUES ('teacher183', '', '副教授', '刘维');
INSERT INTO `teacher` VALUES ('teacher184', '', '讲师(高校)', '李鹃');
INSERT INTO `teacher` VALUES ('teacher185', '', '讲师(高校)', '李鹃');
INSERT INTO `teacher` VALUES ('teacher186', '', '副教授', '张跃辉');
INSERT INTO `teacher` VALUES ('teacher187', '', '高级工程师', '张培艳');
INSERT INTO `teacher` VALUES ('teacher188', '', '教授', '杨林');
INSERT INTO `teacher` VALUES ('teacher189', '', '副教授', '胡文蓉');
INSERT INTO `teacher` VALUES ('teacher19', '', '副教授', '王球');
INSERT INTO `teacher` VALUES ('teacher190', '', '教授', '杨斌堂');
INSERT INTO `teacher` VALUES ('teacher191', '', '助理研究员', '李红兵');
INSERT INTO `teacher` VALUES ('teacher192', '', '副教授', '管斌');
INSERT INTO `teacher` VALUES ('teacher193', '', '副研究员', '冷春涛');
INSERT INTO `teacher` VALUES ('teacher194', '', '工程师', '李翠超');
INSERT INTO `teacher` VALUES ('teacher195', '', '工程师', '徐季旻');
INSERT INTO `teacher` VALUES ('teacher196', '', '讲师(高校)', '胡慈舟');
INSERT INTO `teacher` VALUES ('teacher197', '', '讲师(高校思政)', '王丽华');
INSERT INTO `teacher` VALUES ('teacher198', '', '讲师(高校思政)', '王丽华');
INSERT INTO `teacher` VALUES ('teacher199', '', '无', '沈兴');
INSERT INTO `teacher` VALUES ('teacher2', '', '副教授', '赵思渊');
INSERT INTO `teacher` VALUES ('teacher20', '', '教授', '赵旭');
INSERT INTO `teacher` VALUES ('teacher200', '', '无', '杜鹃');
INSERT INTO `teacher` VALUES ('teacher201', '', '教授', '喻国良');
INSERT INTO `teacher` VALUES ('teacher202', '', '讲师(高校)', '赵军民');
INSERT INTO `teacher` VALUES ('teacher203', '', '副教授', '姚武');
INSERT INTO `teacher` VALUES ('teacher204', '', '副教授', '施健');
INSERT INTO `teacher` VALUES ('teacher205', '', '讲师(高校)', '吴新忠');
INSERT INTO `teacher` VALUES ('teacher206', '', '副教授', '范慕尤');
INSERT INTO `teacher` VALUES ('teacher207', '', '副教授', '李洁');
INSERT INTO `teacher` VALUES ('teacher208', '', '教授', '姚雷');
INSERT INTO `teacher` VALUES ('teacher209', '', '副研究员', '吴亚妮');
INSERT INTO `teacher` VALUES ('teacher21', '', '副教授', '安琪');
INSERT INTO `teacher` VALUES ('teacher210', '', '副研究员', '耿雪青');
INSERT INTO `teacher` VALUES ('teacher211', '', '副教授', '王梦月');
INSERT INTO `teacher` VALUES ('teacher212', '', '副研究员', '王贵荣');
INSERT INTO `teacher` VALUES ('teacher213', '', '教授', '于立军');
INSERT INTO `teacher` VALUES ('teacher214', '', '副教授', '张雪萍');
INSERT INTO `teacher` VALUES ('teacher215', '', '讲师(高校)', '张攀');
INSERT INTO `teacher` VALUES ('teacher216', '', '教授', '朱德米');
INSERT INTO `teacher` VALUES ('teacher217', '', '副教授', '李寿初');
INSERT INTO `teacher` VALUES ('teacher218', '', '讲师(高校)', '张学昆');
INSERT INTO `teacher` VALUES ('teacher219', '', '讲师(高校)', '黄宗昊');
INSERT INTO `teacher` VALUES ('teacher22', '', '教授', '孟和');
INSERT INTO `teacher` VALUES ('teacher220', '', '讲师(高校)', '黄宗昊');
INSERT INTO `teacher` VALUES ('teacher221', '', '讲师(高校)', '翟一达');
INSERT INTO `teacher` VALUES ('teacher222', '', '讲师(高校)', '王品');
INSERT INTO `teacher` VALUES ('teacher223', '', '工程师', '徐季旻');
INSERT INTO `teacher` VALUES ('teacher224', '', '讲师(高校)', '陈爱国');
INSERT INTO `teacher` VALUES ('teacher225', '', '副教授', '黄采金');
INSERT INTO `teacher` VALUES ('teacher226', '', '讲师(高校)', '沈洋');
INSERT INTO `teacher` VALUES ('teacher227', '', '教授', '陈业新');
INSERT INTO `teacher` VALUES ('teacher228', '', '教授', '史清华');
INSERT INTO `teacher` VALUES ('teacher229', '', '副教授', '闻媛');
INSERT INTO `teacher` VALUES ('teacher23', '', '副教授', '蒋群');
INSERT INTO `teacher` VALUES ('teacher230', '', '教授', '朱德米');
INSERT INTO `teacher` VALUES ('teacher232', NULL, '副教授', '沈备军');
INSERT INTO `teacher` VALUES ('teacher233', NULL, '副教授', '夏虞斌');
INSERT INTO `teacher` VALUES ('teacher234', NULL, '副教授', '王肇国');
INSERT INTO `teacher` VALUES ('teacher235', NULL, '副教授', '姚建国');
INSERT INTO `teacher` VALUES ('teacher236', NULL, '助理工程师', '丁玥');
INSERT INTO `teacher` VALUES ('teacher237', NULL, '教授', '臧斌宇');
INSERT INTO `teacher` VALUES ('teacher238', NULL, '副教授', '毛文伟');
INSERT INTO `teacher` VALUES ('teacher239', NULL, '副教授', '钱秀萍');
INSERT INTO `teacher` VALUES ('teacher24', '', '研究员(实验技术)', '曹阳');
INSERT INTO `teacher` VALUES ('teacher240', NULL, '教授', '楼紫阳');
INSERT INTO `teacher` VALUES ('teacher241', NULL, '副研究员', '赵玲');
INSERT INTO `teacher` VALUES ('teacher242', NULL, '副教授', '林燕');
INSERT INTO `teacher` VALUES ('teacher243', NULL, '副教授', '吕海宁');
INSERT INTO `teacher` VALUES ('teacher244', NULL, '讲师(高校)', '刘明月');
INSERT INTO `teacher` VALUES ('teacher245', NULL, '教授', '郭俊华');
INSERT INTO `teacher` VALUES ('teacher246', NULL, '副教授', '黄宏成');
INSERT INTO `teacher` VALUES ('teacher247', NULL, '教授', '胡洁');
INSERT INTO `teacher` VALUES ('teacher248', NULL, '副教授', '曹慧');
INSERT INTO `teacher` VALUES ('teacher249', NULL, '副教授', '李超');
INSERT INTO `teacher` VALUES ('teacher25', '', '副教授', '褚建君');
INSERT INTO `teacher` VALUES ('teacher250', NULL, '教授', '陈映芳');
INSERT INTO `teacher` VALUES ('teacher251', NULL, '副教授', '魏英杰');
INSERT INTO `teacher` VALUES ('teacher252', NULL, '副研究员', '陈娟');
INSERT INTO `teacher` VALUES ('teacher253', NULL, '教授', '彭立明');
INSERT INTO `teacher` VALUES ('teacher254', NULL, '副研究员', '王玉亮');
INSERT INTO `teacher` VALUES ('teacher255', NULL, '教授', '周选围');
INSERT INTO `teacher` VALUES ('teacher256', NULL, '工程师', '宁月生');
INSERT INTO `teacher` VALUES ('teacher257', NULL, '副教授', '赵斌元');
INSERT INTO `teacher` VALUES ('teacher258', NULL, '副研究员', '刘庆雷');
INSERT INTO `teacher` VALUES ('teacher259', NULL, '教授', '邵嘉慧');
INSERT INTO `teacher` VALUES ('teacher26', '', '教授', '李大伟');
INSERT INTO `teacher` VALUES ('teacher260', NULL, '讲师(高校)', '马煜宁');
INSERT INTO `teacher` VALUES ('teacher261', NULL, '高级实验师', '孙承兴');
INSERT INTO `teacher` VALUES ('teacher262', NULL, '副教授', '孔令和');
INSERT INTO `teacher` VALUES ('teacher263', NULL, '副教授', '严骏驰');
INSERT INTO `teacher` VALUES ('teacher264', NULL, '无', '樊柳荫');
INSERT INTO `teacher` VALUES ('teacher265', NULL, '副教授', '白晓慧');
INSERT INTO `teacher` VALUES ('teacher266', NULL, '高级工程师', '余征跃');
INSERT INTO `teacher` VALUES ('teacher267', NULL, '高级实验师', '杨凤鹏');
INSERT INTO `teacher` VALUES ('teacher268', NULL, '高级实验师', '但文蛟');
INSERT INTO `teacher` VALUES ('teacher269', NULL, '助理研究员', '孙晨');
INSERT INTO `teacher` VALUES ('teacher27', '', '高级实验师', '葛海燕');
INSERT INTO `teacher` VALUES ('teacher270', NULL, '工程师', '祁洋');
INSERT INTO `teacher` VALUES ('teacher271', NULL, '高级工程师', '陈玉坤');
INSERT INTO `teacher` VALUES ('teacher272', NULL, '副教授', '梁夫友');
INSERT INTO `teacher` VALUES ('teacher273', NULL, '教授', '张卫刚');
INSERT INTO `teacher` VALUES ('teacher274', NULL, '工程师', '蔡晓静');
INSERT INTO `teacher` VALUES ('teacher275', NULL, '工程师', '杨英强');
INSERT INTO `teacher` VALUES ('teacher276', NULL, '无', '刘金生');
INSERT INTO `teacher` VALUES ('teacher277', NULL, '副主任医师', '黄晓兰');
INSERT INTO `teacher` VALUES ('teacher278', NULL, '副教授', '高亚祯');
INSERT INTO `teacher` VALUES ('teacher279', NULL, '副教授', '丁剑');
INSERT INTO `teacher` VALUES ('teacher28', '', '副研究员', '吴亚妮');
INSERT INTO `teacher` VALUES ('teacher280', NULL, '教授', '曾小勤');
INSERT INTO `teacher` VALUES ('teacher281', NULL, '助理研究员', '应韬');
INSERT INTO `teacher` VALUES ('teacher282', NULL, '讲师(高校思政)', '朱彦彦');
INSERT INTO `teacher` VALUES ('teacher283', NULL, '副研究员', '高国');
INSERT INTO `teacher` VALUES ('teacher284', NULL, '教授', '邓康耀');
INSERT INTO `teacher` VALUES ('teacher285', NULL, '副教授', '杨名洋');
INSERT INTO `teacher` VALUES ('teacher286', NULL, '助教(高校思政)', '江俊达');
INSERT INTO `teacher` VALUES ('teacher287', NULL, '讲师(高校思政)', '孟祥琦');
INSERT INTO `teacher` VALUES ('teacher288', NULL, '助教(高校思政)', '高杏');
INSERT INTO `teacher` VALUES ('teacher29', '', '副研究员', '赵文娟');
INSERT INTO `teacher` VALUES ('teacher3', '', '副教授', '于冰沁');
INSERT INTO `teacher` VALUES ('teacher30', '', '教授', '王莲芸');
INSERT INTO `teacher` VALUES ('teacher31', '', '教授', '陈斌');
INSERT INTO `teacher` VALUES ('teacher32', '', '讲师(高校)', '仇剑崟');
INSERT INTO `teacher` VALUES ('teacher33', '', '讲师(高校)', '仇毅翔');
INSERT INTO `teacher` VALUES ('teacher34', '', '教授', '李康化');
INSERT INTO `teacher` VALUES ('teacher35', '', '教授', '张玉梅');
INSERT INTO `teacher` VALUES ('teacher36', '', '副教授', '刘佑军');
INSERT INTO `teacher` VALUES ('teacher37', '', '副教授', '朱兴和');
INSERT INTO `teacher` VALUES ('teacher38', '', '副教授', '汪云霞');
INSERT INTO `teacher` VALUES ('teacher39', '', '副研究员', '陈婷珠');
INSERT INTO `teacher` VALUES ('teacher4', '', '讲师(高校)', '刘兴华');
INSERT INTO `teacher` VALUES ('teacher40', '', '副教授', '吕旭龙');
INSERT INTO `teacher` VALUES ('teacher41', '', '教授', '符杰祥');
INSERT INTO `teacher` VALUES ('teacher42', '', '副教授(专职教学)', '刘元春');
INSERT INTO `teacher` VALUES ('teacher43', '', '副教授', '唐启翠');
INSERT INTO `teacher` VALUES ('teacher44', '', '助理研究员', '夏伟');
INSERT INTO `teacher` VALUES ('teacher45', '', '教授', '何延红');
INSERT INTO `teacher` VALUES ('teacher46', '', '副教授', '胡建军');
INSERT INTO `teacher` VALUES ('teacher47', '', '副教授', '汪云霞');
INSERT INTO `teacher` VALUES ('teacher48', '', '副教授', '陈霆');
INSERT INTO `teacher` VALUES ('teacher49', '', '副教授', '施旻');
INSERT INTO `teacher` VALUES ('teacher5', '', '教授', '陈代杰');
INSERT INTO `teacher` VALUES ('teacher50', '', '副教授', '童剑平');
INSERT INTO `teacher` VALUES ('teacher51', '', '教授', '萨日娜');
INSERT INTO `teacher` VALUES ('teacher52', '', '副教授', '唐启翠');
INSERT INTO `teacher` VALUES ('teacher53', '', '教授', '黄林鹏');
INSERT INTO `teacher` VALUES ('teacher54', '', '教授、副教授、高级工程师', '胡昊、史健勇、徐峰');
INSERT INTO `teacher` VALUES ('teacher55', '', '教授', '童清艳');
INSERT INTO `teacher` VALUES ('teacher56', '', '副教授', '董煜宇');
INSERT INTO `teacher` VALUES ('teacher57', '', '教授', '都岚岚');
INSERT INTO `teacher` VALUES ('teacher58', '', '教授', '张荔');
INSERT INTO `teacher` VALUES ('teacher59', '', '教授', '杨杰');
INSERT INTO `teacher` VALUES ('teacher6', '', '教授', '侯利阳');
INSERT INTO `teacher` VALUES ('teacher60', '', '副研究员', '王鲁梅');
INSERT INTO `teacher` VALUES ('teacher61', '', '副教授', '李玉红');
INSERT INTO `teacher` VALUES ('teacher62', '', '教授', '关增建');
INSERT INTO `teacher` VALUES ('teacher63', '', '副教授', '任玉雪');
INSERT INTO `teacher` VALUES ('teacher64', '', '教授', '魏啸飞');
INSERT INTO `teacher` VALUES ('teacher65', '', '教授', '高福进');
INSERT INTO `teacher` VALUES ('teacher66', '', '研究馆员', '潘卫');
INSERT INTO `teacher` VALUES ('teacher67', '', '副教授', '施立峻');
INSERT INTO `teacher` VALUES ('teacher68', '', '讲师(高校)', '张蕴艳');
INSERT INTO `teacher` VALUES ('teacher69', '', '副教授', '何艳');
INSERT INTO `teacher` VALUES ('teacher7', '', '讲师(高校)', '张静抒');
INSERT INTO `teacher` VALUES ('teacher70', '', '教授', '黄伟力');
INSERT INTO `teacher` VALUES ('teacher71', '', '教授', '沈灏');
INSERT INTO `teacher` VALUES ('teacher72', '', '副教授', '张跃辉');
INSERT INTO `teacher` VALUES ('teacher73', '', '教授', '黄建国');
INSERT INTO `teacher` VALUES ('teacher74', '', '教授', '陈江平');
INSERT INTO `teacher` VALUES ('teacher75', '', '教授', '曹其新');
INSERT INTO `teacher` VALUES ('teacher76', '', '副教授', '蔡伟伟');
INSERT INTO `teacher` VALUES ('teacher77', '', '教授', '杨培中');
INSERT INTO `teacher` VALUES ('teacher78', '', '副教授', '林志良');
INSERT INTO `teacher` VALUES ('teacher79', '', '研究员', '胡士强');
INSERT INTO `teacher` VALUES ('teacher8', '', '副教授', '穆蕴秋');
INSERT INTO `teacher` VALUES ('teacher80', '', '讲师(高校)', '赵冰冰');
INSERT INTO `teacher` VALUES ('teacher81', '', '教授', '程先华');
INSERT INTO `teacher` VALUES ('teacher82', '', '无', '杜鹃');
INSERT INTO `teacher` VALUES ('teacher83', '', '无', '杜鹃');
INSERT INTO `teacher` VALUES ('teacher84', '', '讲师(高校)', '胡慈舟');
INSERT INTO `teacher` VALUES ('teacher85', '', '讲师(高校)', '谭婷');
INSERT INTO `teacher` VALUES ('teacher86', '', '讲师(高校)', '徐雪松');
INSERT INTO `teacher` VALUES ('teacher87', '', '讲师(高校)', '孟令兵');
INSERT INTO `teacher` VALUES ('teacher88', '', '副教授', '陈勇');
INSERT INTO `teacher` VALUES ('teacher89', '', '副教授', '蔡文菁');
INSERT INTO `teacher` VALUES ('teacher9', '', '讲师(高校)', '刘训茜');
INSERT INTO `teacher` VALUES ('teacher90', '', '副教授', '王越西');
INSERT INTO `teacher` VALUES ('teacher91', '', '研究员', '申晓辉');
INSERT INTO `teacher` VALUES ('teacher92', '', '副教授', '房建华');
INSERT INTO `teacher` VALUES ('teacher93', '', '无', '张艳萍');
INSERT INTO `teacher` VALUES ('teacher94', '', '副教授', '周建国');
INSERT INTO `teacher` VALUES ('teacher95', '', '教授', '吕晓俊');
INSERT INTO `teacher` VALUES ('teacher96', '', '副教授', '闻媛');
INSERT INTO `teacher` VALUES ('teacher97', '', '讲师(高校)', '张学昆');
INSERT INTO `teacher` VALUES ('teacher98', '', '讲师(高校)', '卢婷婷');
INSERT INTO `teacher` VALUES ('teacher99', '', '副教授', '黄琪轩');

SET FOREIGN_KEY_CHECKS = 1;
