CREATE TABLE `administrators`  (
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `course`  (
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseName` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `courseType` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `electiveType` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `credits` decimal(2, 1) NULL DEFAULT NULL,
  PRIMARY KEY (`courseId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `sectime`  (
  `timeslotId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `weeks` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teacherUserName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`teacherUserName`, `year`, `courseId`, `semester`, `weeks`, `timeslotId`) USING BTREE,
  INDEX `fk_secTime_timeslot_1`(`timeslotId`) USING BTREE,
  INDEX `fk_secTime_section_1`(`semester`, `year`, `courseId`, `teacherUserName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

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
  INDEX `FK_Relationship_3`(`teacherUserName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `student`  (
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `deptName` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `grade` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` tinyint(1) NULL DEFAULT NULL,
  `admissonDate` date NULL DEFAULT NULL,
  `country` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `documentType` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `takes`  (
  `semester` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `grade` decimal(3, 0) NULL DEFAULT NULL,
  `gpa` decimal(3, 2) NULL DEFAULT NULL,
  `teacherUserName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`semester`, `year`, `courseId`, `userName`, `teacherUserName`) USING BTREE,
  INDEX `FK_takes2`(`userName`) USING BTREE,
  INDEX `fk_takes_section_1`(`semester`, `year`, `courseId`, `teacherUserName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `teacher`  (
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `deptName` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `rank` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `timeslot`  (
  `timeslotId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `day` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `startTime` int(0) NULL DEFAULT NULL,
  `endTime` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`timeslotId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

CREATE TABLE `userauth`  (
  `userName` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

ALTER TABLE `administrators` ADD CONSTRAINT `FK_Reference_9` FOREIGN KEY (`userName`) REFERENCES `userauth` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `sectime` ADD CONSTRAINT `fk_secTime_section_1` FOREIGN KEY (`semester`, `year`, `courseId`, `teacherUserName`) REFERENCES `section` (`semester`, `year`, `courseId`, `teacherUserName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `sectime` ADD CONSTRAINT `fk_secTime_timeslot_1` FOREIGN KEY (`timeslotId`) REFERENCES `timeslot` (`timeslotId`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `section` ADD CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `section` ADD CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`teacherUserName`) REFERENCES `teacher` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `student` ADD CONSTRAINT `FK_Reference_7` FOREIGN KEY (`userName`) REFERENCES `userauth` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `takes` ADD CONSTRAINT `FK_takes2` FOREIGN KEY (`userName`) REFERENCES `student` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `takes` ADD CONSTRAINT `fk_takes_section_1` FOREIGN KEY (`semester`, `year`, `courseId`, `teacherUserName`) REFERENCES `section` (`semester`, `year`, `courseId`, `teacherUserName`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `teacher` ADD CONSTRAINT `FK_Reference_8` FOREIGN KEY (`userName`) REFERENCES `userauth` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT;

