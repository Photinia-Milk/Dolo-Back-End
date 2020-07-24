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

 Date: 23/07/2020 16:37:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `courseId` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `courseName` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `courseType` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `electiveType` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `credits` decimal(2, 1) NULL DEFAULT NULL,
  PRIMARY KEY (`courseId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('AD001', '素描', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AD003', '设计素描', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AI007', '人工智能', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('AM001', '管理基础', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM008', 'WTO法律文件选读', '无', '', 2.0);
INSERT INTO `course` VALUES ('AM016', '网络环境下的文科信息检索', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM025', '管理经济学（A类）', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM062', '消费者行为学（A）', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM065', '产业模式与创业', '无', '', 2.0);
INSERT INTO `course` VALUES ('AM070', '电子商务：创新与战略', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM108', '消费者行为学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM314', '沟通技巧与领导力开发', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AM922', '创业基础', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('AR007', '色彩艺术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AR904', '图像遗产与中国古代艺术', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('AR909', '书法与中国美学', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('AU007', '移动机器人自主定位导航算法实践', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AV001', '航空航天概论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AV012', '力学改变生活', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('AV020', '无人机系统总体设计', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AV022', '快速无人机原型设计', '通选', '', 2.0);
INSERT INTO `course` VALUES ('AV023', '航拍无人机与无人机航拍', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BE002', '开源硬件创客实战', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BI039', '分子影像学与疾病早期诊断', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BI041', '细胞世界', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BI901', '生命科学发展史', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI902', '生命伦理学', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('BI903', '生命科学实验探索', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI905', '地球生命', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI907', '基因与人', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI912', '遗传学与社会', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI913', '生物技术与人类', '通识核心课程', '自然科学', 3.0);
INSERT INTO `course` VALUES ('BI916', '气味科学中的健康密码', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI917', '脑与日常行为', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BI920', '细菌与人', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BM011', '现代医学导论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BM021', '急救与自救', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('BM902', '药物发展:延续生命的奥秘', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BM903', '大学生健康导论', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('BM904', '性与健康', '通识核心课程', '社会科学', 3.0);
INSERT INTO `course` VALUES ('BM908', '普通心理学', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('BU007', '技术经济学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU012', '商业模式设计与创新', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU013', '品牌审美与管理——F1超跑和法国红酒', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU017', '全球运营与管理', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU304', '新产品管理', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU320', '项目管理', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU327', '定价策略', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU426', '创业机会识别', '通选', '', 2.0);
INSERT INTO `course` VALUES ('BU463', '风险管理', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CA099', '以一斑窥全豹:仪器分析技术在企业质量控制中的应用', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CA904', '公共危机中的化学', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('CH072', '《四书》选读', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CH078', '书法文化与实践', '通选', '', 3.0);
INSERT INTO `course` VALUES ('CH079', '《史记》选读', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CH902', '唐诗宋词人文解读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH906', '古典诗词鉴赏与创作', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH911', '外国文学史', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH926', '古典诗文名篇选读', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH927', '中国现代诗歌导读', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH929', '汉语与认知：由汉语看汉民族的认知特点', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH931', '老庄元典选读', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH932', '现代中国文学与文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH934', '汉字文化', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CH935', '《礼记》选读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH936', '中国现代小说选读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH937', '当代中国经典作家导读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH942', '诗国与诗魂', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH944', '且共从容：唐宋词讲读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH945', '中文书写与汉字文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CH946', '中国文学与自然科学', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CI903', '演讲与口才', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL001', '当代西方人文艺术思潮', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CL002', '西方宗教文化概论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CL024', '日本民俗文化专题', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CL025', '中外文化交流两千年', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CL031', '读懂中国', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CL046', '敦煌文化', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('CL900', '《庄子》智慧与中国文化', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('CL907', '世界华文文学专题', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL908', '西方美术史', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL909', '女性文学与性别文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL915', '欧洲文化导论', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL916', '中日科技文化交流', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CL918', '神话与创意', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('CS057', 'OpenGL开发实时3D动画程序', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CS085', 'VR/AR设计与开发实践', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CS096', 'Unreal程序开发与实践', '通选', '', 2.0);
INSERT INTO `course` VALUES ('CS155', '无人驾驶算法开发', '通选', '', 3.0);
INSERT INTO `course` VALUES ('CS166', 'MATLAB基础应用', '通选', '', 1.0);
INSERT INTO `course` VALUES ('CS902', '程序设计思想与方法', '通识核心课程', '工程科学与技术', 3.0);
INSERT INTO `course` VALUES ('CS904', '计算机科学中的伦理问题', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('DR001', '书法艺术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('DR002', '篆刻艺术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('DR014', '海派连环画鉴赏：记忆与想象', '通选', '', 2.0);
INSERT INTO `course` VALUES ('DR015', '海派连环画研习与创作', '无', '', 2.0);
INSERT INTO `course` VALUES ('EC016', '工程经济学(F类)', '通选', '', 2.0);
INSERT INTO `course` VALUES ('EC100', '经济学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('EC901', '工程经济与管理', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('EC905', '媒体创意经济', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('ED903', '大学使命与大学文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('EE031', '开源硬件PCB设计-基于PADS', '通选', '', 2.0);
INSERT INTO `course` VALUES ('EN902', '20世纪英美短篇小说选读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('EN908', '学术英语交际:写作与发言', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('ES901', '智能信息处理', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('EV019', '绿色工程概论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('EV053', '水质改善与评价技术探究', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('EV901', '环境与可持续发展', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('EV902', '环境与健康', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('EV904', '全球变化下的自然和生态', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('FI005', '货币金融学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('FI453', '证券投资分析', '通选', '', 2.0);
INSERT INTO `course` VALUES ('FO001', '德语(上)', '通选', NULL, 4.0);
INSERT INTO `course` VALUES ('FO005', '基础法语(上)', '通选', NULL, 4.0);
INSERT INTO `course` VALUES ('FT011', '电影审美', '通选', '', 2.0);
INSERT INTO `course` VALUES ('FT018', '影视文化与艺术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('FT023', '香港电影专题研究', '通选', '', 2.0);
INSERT INTO `course` VALUES ('GA407', '花卉应用学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('GA901', '与风景的对话:中外园林艺术欣赏', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('GA903', '西方风景园林艺术史', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI102', '科学技术史', '通选', '', 2.0);
INSERT INTO `course` VALUES ('HI902', '科学技术史', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI903', '美国的文化与历史', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI904', '历史视野下的美国文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI927', '世界文化史', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI942', '科幻作品与当代科学争议', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI943', '中华文明史：明清社会变迁与早期全球化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('HI949', '中国历史地理', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('IN901', '信息素养与实践', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('IO024', 'Tridium物联网架构及其智慧楼宇实践', '通选', '', 2.0);
INSERT INTO `course` VALUES ('IO025', '物联网安全与漏洞挖掘利用', '无', '', 1.0);
INSERT INTO `course` VALUES ('JA001', '基础日语(上)', '通选', NULL, 4.0);
INSERT INTO `course` VALUES ('JA017', '日语与跨文化交流', '通选', '', 2.0);
INSERT INTO `course` VALUES ('JC031', '中国美学与艺术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('JC903', '美学', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('LA024', '品牌法律保护与管理', '通选', '', 3.0);
INSERT INTO `course` VALUES ('LA029', '婚姻、财产与法律', '通选', '', 2.0);
INSERT INTO `course` VALUES ('LA938', '欧盟法律文化导论', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('LI901', '文学与人生', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('LI903', '英美名诗赏析', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('LI910', '批判性思维与学术写作', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('LO901', '推理与思维训练', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('LT002', '基础拉丁语', '通选', '', 2.0);
INSERT INTO `course` VALUES ('LT004', '拉丁语（II）', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MA194', '桥牌与博弈论', '通选', '', 3.0);
INSERT INTO `course` VALUES ('MA278', '高等微积分', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MA906', '数学与科技进步', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('MA908', '数学的天空', '通识核心课程', '自然科学', 3.0);
INSERT INTO `course` VALUES ('MA909', '中国传统文化中的数学算法', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('ME034', '移动机器人构建与编程', '通选', '', 1.0);
INSERT INTO `course` VALUES ('ME055', '新能源汽车动力系统及控制', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME069', '偷师大自然:动物仿生学', '通选', '', 1.0);
INSERT INTO `course` VALUES ('ME085', '智能材料与微精驱动原理与技术', '通选', '', 3.0);
INSERT INTO `course` VALUES ('ME096', '机器人触觉感知', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME117', '现代汽车排放污染物控制新技术', '通选', '', 3.0);
INSERT INTO `course` VALUES ('ME128', 'VEX机器人设计与开发', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME135', '3D打印结构优化与创新设计', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME140', '3D打印原理与技术', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('ME141', 'TI-RSLK机器人设计与实践', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME142', '工业机器人与视觉系统', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('ME150', '3D打印-选区激光熔化技术：聚沙成塔-从原料到产品', '通选', '', 2.0);
INSERT INTO `course` VALUES ('ME901', '工程技术探究', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('ME902', '脑与机器人', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('ME903', '创新思维与现代设计', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('ME904', '形象思维与工程语言', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('ME905', '力学仿生——启示与探索', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('ME908', '机器的征途：空天科技', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('MT023', '中国古代材料史', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MT901', '材料与文明', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('MT903', '材料美学', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('MT906', '走进纳米科学', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('MT908', '秘宝寻材：宝藏中的材料科学', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('MU033', '戏剧音乐名作欣赏', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MU041', '歌唱的呼吸与发声', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MU042', '非洲鼓演奏体验', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MU047', '中国传统音乐', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MU048', '流行音乐与文化', '通选', '', 2.0);
INSERT INTO `course` VALUES ('MU901', '交响音乐鉴赏', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('MU902', '中西乐理及其应用', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('MU903', '世界民族音乐鉴赏', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('NA009', '水力学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('NT901', '自然界中的混沌与分岔', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('OC901', '海洋学导论', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('OC902', '海洋可再生资源', '通识核心课程', '工程科学与技术', 2.0);
INSERT INTO `course` VALUES ('PE005', '体育（5）', '通选', '', 1.0);
INSERT INTO `course` VALUES ('PE006', '生命安全与救援——运动及户外活动中的安全与救护', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PH010', '宝玉石鉴赏', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PH053', '显微镜大世界', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('PI005', '宇宙论的历史与哲学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PI021', '佛教哲学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PI906', '佛教与中国传统文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PI913', '西方哲学史', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('PI925', '西方哲学经典导读', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PI928', '国学经典《道德经》与中西文化交流', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PI929', '儒家思想与中国文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PI930', '游戏哲学', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PI931', '认知科学哲学', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PL004', '插花艺术', '通选', '', 1.0);
INSERT INTO `course` VALUES ('PL015', '芳香植物精油与芳香疗法', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PL028', '芳香疗法与身心健康', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PL031', '植物与生活', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PL902', '国花、市花与文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('PM005', '中药学通论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PM010', '中医药养生与保健', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PO012', '新能源发电技术', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PO202', '能源与可持续发展', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('PO903', '清洁能源技术：原理与应用', '通识核心课程', '自然科学', 2.0);
INSERT INTO `course` VALUES ('PS009', '思维力与创造力', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PS907', '积极心理学', '通识核心课程', '人文学科', 3.0);
INSERT INTO `course` VALUES ('PS912', '心理与行为', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU004', '现代心理学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU040', '国际安全', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU045', '中国政治制度', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU050', '国际关系学导论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU078', '各国政府与政治', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU086', '西方政治学入门', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU095', '政治与社会心理学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('PU902', '当代中国社会问题', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU905', '心理学与生活', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU906', '经济与社会伦理', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU907', '公共政策与公民生活', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU908', '中俄关系的演变与展望', '通识核心课程', '社会科学', 3.0);
INSERT INTO `course` VALUES ('PU910', '城市文明的历史与未来', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU917', '政治经济学经典导读', '通识核心课程', '社会科学', 3.0);
INSERT INTO `course` VALUES ('PU933', '政治人的成长', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU938', '治理之善：公共行政热点解析', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU941', '领导力学习与实践', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU942', '政治的边界与逻辑', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('PU981', '组织文化研究', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SA001', '梵语（1）', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SE006', '腾讯游戏程序设计及经典案例分析', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SE123', '软件工程原理与实践', '必修', NULL, 3.0);
INSERT INTO `course` VALUES ('SE124', '计算机系统工程', '必修', NULL, 4.0);
INSERT INTO `course` VALUES ('SE125', '机器学习', '必修', NULL, 3.0);
INSERT INTO `course` VALUES ('SE302', '编译原理与技术', '限选', NULL, 3.0);
INSERT INTO `course` VALUES ('SE332', '信息系统分析与设计', '限选', '', 3.0);
INSERT INTO `course` VALUES ('SE344', '计算机图形学', '限选', '', 3.0);
INSERT INTO `course` VALUES ('SO077', '战后日本社会', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SO087', '就业模式设计与创新', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SO094', '性别、亲密关系与社会', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SO105', '中国脱贫攻坚', '无', '', 2.0);
INSERT INTO `course` VALUES ('SO108', '民俗与中国文化', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SO120', '社会学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('SO904', '古希腊文明演绎', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('SO922', '人与环境', '通识核心课程', '自然科学', 3.0);
INSERT INTO `course` VALUES ('SO923', '新闻媒介与社会', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SO934', '人际交往艺术', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('SO936', '职业生涯发展与规划', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SO937', '风险与社会保障', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SO939', '大众传媒与文化', '通识核心课程', '人文学科', 2.0);
INSERT INTO `course` VALUES ('SO940', '社会科学研究方法', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SO941', '市场调研：方法与实践', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('SO944', '全球化创新：原理与实践', '通识核心课程', '无', 3.0);
INSERT INTO `course` VALUES ('SO945', '社会学与人学研究', '通识核心课程', '社会科学', 2.0);
INSERT INTO `course` VALUES ('TA001', '税收经济学', '通选', '', 2.0);
INSERT INTO `course` VALUES ('TH201', '习近平新时代中国特色社会主义思想概论', '通选', '', 2.0);
INSERT INTO `course` VALUES ('TY001', '“UTJS”体验式教育:大学生演讲与沟通训练', '通选', NULL, 2.0);
INSERT INTO `course` VALUES ('WA002', '战争的起源：理论与历史', '通选', '', 2.0);

SET FOREIGN_KEY_CHECKS = 1;
