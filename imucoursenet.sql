/*
MySQL Data Transfer
Source Host: localhost
Source Database: imucoursenet
Target Host: localhost
Target Database: imucoursenet
Date: 2012/12/29 16:23:13
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `courseId` int(11) NOT NULL auto_increment,
  `courseName` varchar(50) NOT NULL,
  `courseDescription` varchar(100) default NULL,
  `departmentId` int(11) NOT NULL,
  `courseTypeId` int(11) NOT NULL,
  PRIMARY KEY  (`courseId`),
  KEY `departmentId` (`departmentId`),
  KEY `courseTypeId` (`courseTypeId`),
  CONSTRAINT `tb_course_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `tb_department` (`departmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tb_course_ibfk_2` FOREIGN KEY (`courseTypeId`) REFERENCES `tb_coursetype` (`courseTypeId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_coursedetail
-- ----------------------------
DROP TABLE IF EXISTS `tb_coursedetail`;
CREATE TABLE `tb_coursedetail` (
  `courseDetailId` int(11) NOT NULL auto_increment,
  `courseId` int(11) NOT NULL,
  `teacherId` int(11) NOT NULL,
  `teachPlan` text,
  `referenceBook` text,
  `courseIntroduce` text,
  `establishDate` date NOT NULL,
  `state` int(11) default '-1',
  `userId` int(11) default NULL,
  PRIMARY KEY  (`courseDetailId`),
  KEY `courseId` (`courseId`),
  KEY `teacherId` (`teacherId`),
  KEY `FKE8A4E27D8A85AB54` (`userId`),
  CONSTRAINT `FKE8A4E27D8A85AB54` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `tb_coursedetail_ibfk_1` FOREIGN KEY (`courseId`) REFERENCES `tb_course` (`courseId`),
  CONSTRAINT `tb_coursedetail_ibfk_2` FOREIGN KEY (`teacherId`) REFERENCES `tb_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_coursenotification
-- ----------------------------
DROP TABLE IF EXISTS `tb_coursenotification`;
CREATE TABLE `tb_coursenotification` (
  `courseNotificationId` int(11) NOT NULL auto_increment,
  `courseDetailId` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` text,
  `editDate` datetime NOT NULL,
  `checkCounts` int(11) NOT NULL,
  PRIMARY KEY  (`courseNotificationId`),
  KEY `courseDetailId` (`courseDetailId`),
  CONSTRAINT `tb_coursenotification_ibfk_1` FOREIGN KEY (`courseDetailId`) REFERENCES `tb_coursedetail` (`courseDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_coursetaking
-- ----------------------------
DROP TABLE IF EXISTS `tb_coursetaking`;
CREATE TABLE `tb_coursetaking` (
  `courseTakingId` int(11) NOT NULL auto_increment,
  `courseDetailId` int(11) NOT NULL,
  `studentId` int(11) NOT NULL,
  `score` int(11) default NULL,
  `state` int(11) default NULL,
  PRIMARY KEY  (`courseTakingId`),
  KEY `courseDetailId` (`courseDetailId`),
  KEY `studentId` (`studentId`),
  CONSTRAINT `tb_coursetaking_ibfk_1` FOREIGN KEY (`courseDetailId`) REFERENCES `tb_coursedetail` (`courseDetailId`),
  CONSTRAINT `tb_coursetaking_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `tb_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_coursetype
-- ----------------------------
DROP TABLE IF EXISTS `tb_coursetype`;
CREATE TABLE `tb_coursetype` (
  `courseTypeId` int(11) NOT NULL auto_increment,
  `courseTypeName` varchar(50) NOT NULL,
  `courseTypeDescription` varchar(100) default NULL,
  PRIMARY KEY  (`courseTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_courseware
-- ----------------------------
DROP TABLE IF EXISTS `tb_courseware`;
CREATE TABLE `tb_courseware` (
  `coursewareId` int(11) NOT NULL auto_increment,
  `courseDetailId` int(11) NOT NULL,
  `saveLocation` varchar(200) NOT NULL,
  `title` varchar(50) NOT NULL,
  `uploadDate` datetime NOT NULL,
  `downloadCounts` int(11) NOT NULL default '0',
  PRIMARY KEY  (`coursewareId`),
  KEY `courseDetailId` (`courseDetailId`),
  CONSTRAINT `tb_courseware_ibfk_1` FOREIGN KEY (`courseDetailId`) REFERENCES `tb_coursedetail` (`courseDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_coursework
-- ----------------------------
DROP TABLE IF EXISTS `tb_coursework`;
CREATE TABLE `tb_coursework` (
  `courseWorkId` int(11) NOT NULL auto_increment,
  `courseWorkRequirementId` int(11) NOT NULL,
  `studentId` int(11) NOT NULL,
  `courseWorkLocation` varchar(200) NOT NULL,
  `editDate` datetime NOT NULL,
  `title` varchar(50) NOT NULL,
  PRIMARY KEY  (`courseWorkId`),
  KEY `studentId` (`studentId`),
  KEY `courseWorkRequirementId` (`courseWorkRequirementId`),
  CONSTRAINT `tb_coursework_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `tb_coursework_ibfk_3` FOREIGN KEY (`courseWorkRequirementId`) REFERENCES `tb_courseworkrequirement` (`courseWorkRequirementId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_courseworkrequirement
-- ----------------------------
DROP TABLE IF EXISTS `tb_courseworkrequirement`;
CREATE TABLE `tb_courseworkrequirement` (
  `courseWorkRequirementId` int(11) NOT NULL auto_increment,
  `courseDetailId` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `requirementContent` text,
  `createDate` datetime NOT NULL,
  `deadLine` datetime NOT NULL,
  PRIMARY KEY  (`courseWorkRequirementId`),
  KEY `courseDetailId` (`courseDetailId`),
  CONSTRAINT `tb_courseworkrequirement_ibfk_1` FOREIGN KEY (`courseDetailId`) REFERENCES `tb_coursedetail` (`courseDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_department
-- ----------------------------
DROP TABLE IF EXISTS `tb_department`;
CREATE TABLE `tb_department` (
  `departmentId` int(11) NOT NULL auto_increment,
  `departmentName` varchar(50) NOT NULL,
  `departmentDescription` text NOT NULL,
  PRIMARY KEY  (`departmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_letter
-- ----------------------------
DROP TABLE IF EXISTS `tb_letter`;
CREATE TABLE `tb_letter` (
  `letterId` int(11) NOT NULL auto_increment,
  `senderId` int(11) default NULL,
  `receiverId` int(11) NOT NULL,
  `date` date NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` text,
  `state` int(11) default '1',
  `userId` int(11) default NULL,
  PRIMARY KEY  (`letterId`),
  KEY `senderId` (`senderId`),
  KEY `receiverId` (`receiverId`),
  KEY `FK52B69B17705261AD` (`userId`),
  KEY `FK52B69B178A85AB54` (`userId`),
  CONSTRAINT `FK52B69B17705261AD` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `FK52B69B178A85AB54` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `tb_letter_ibfk_1` FOREIGN KEY (`senderId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `tb_letter_ibfk_2` FOREIGN KEY (`receiverId`) REFERENCES `tb_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_message
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `messageId` int(11) NOT NULL auto_increment,
  `userId` int(11) NOT NULL,
  `content` text NOT NULL,
  `editDate` datetime NOT NULL,
  PRIMARY KEY  (`messageId`),
  KEY `userId` (`userId`),
  CONSTRAINT `tb_message_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_news
-- ----------------------------
DROP TABLE IF EXISTS `tb_news`;
CREATE TABLE `tb_news` (
  `newsId` int(11) NOT NULL auto_increment,
  `content` varchar(255) NOT NULL,
  `newsTitle` varchar(255) NOT NULL,
  `author` varchar(255) default NULL,
  `checkCounts` int(11) NOT NULL,
  `editDate` datetime NOT NULL,
  PRIMARY KEY  (`newsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_notice
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `noticeId` int(11) NOT NULL auto_increment,
  `content` varchar(255) default NULL,
  `noticeTitle` varchar(255) NOT NULL,
  `author` varchar(255) default NULL,
  `checkCounts` int(11) NOT NULL,
  `editDate` datetime NOT NULL,
  PRIMARY KEY  (`noticeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_post
-- ----------------------------
DROP TABLE IF EXISTS `tb_post`;
CREATE TABLE `tb_post` (
  `postId` int(11) NOT NULL auto_increment,
  `courseId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` text,
  `editDate` date NOT NULL,
  `checkCounts` int(11) NOT NULL default '0',
  `replyCounts` int(11) NOT NULL default '0',
  PRIMARY KEY  (`postId`),
  KEY `userId` (`userId`),
  KEY `courseId` (`courseId`),
  CONSTRAINT `tb_post_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`),
  CONSTRAINT `tb_post_ibfk_4` FOREIGN KEY (`courseId`) REFERENCES `tb_course` (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_postreply
-- ----------------------------
DROP TABLE IF EXISTS `tb_postreply`;
CREATE TABLE `tb_postreply` (
  `postReplyId` int(11) NOT NULL auto_increment,
  `postId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `content` text,
  `editDate` date NOT NULL,
  PRIMARY KEY  (`postReplyId`),
  KEY `postId` (`postId`),
  KEY `userId` (`userId`),
  CONSTRAINT `tb_postreply_ibfk_1` FOREIGN KEY (`postId`) REFERENCES `tb_post` (`postId`),
  CONSTRAINT `tb_postreply_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `tb_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_specialty
-- ----------------------------
DROP TABLE IF EXISTS `tb_specialty`;
CREATE TABLE `tb_specialty` (
  `specialtyId` int(11) NOT NULL auto_increment,
  `departmentId` int(11) NOT NULL,
  `specialtyName` varchar(50) NOT NULL,
  `specialtyDescription` varchar(100) default NULL,
  PRIMARY KEY  (`specialtyId`),
  KEY `departmentId` (`departmentId`),
  CONSTRAINT `tb_specialty_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `tb_department` (`departmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `userId` int(11) NOT NULL auto_increment,
  `userAccount` varchar(20) NOT NULL,
  `userPass` varchar(20) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `userMail` varchar(50) NOT NULL,
  `userType` int(11) NOT NULL,
  `departmentId` int(11) NOT NULL,
  `specialtyId` int(11) default NULL,
  PRIMARY KEY  (`userId`),
  KEY `departmentId` (`departmentId`),
  KEY `specialtyId` (`specialtyId`),
  CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `tb_department` (`departmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tb_user_ibfk_2` FOREIGN KEY (`specialtyId`) REFERENCES `tb_specialty` (`specialtyId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tb_course` VALUES ('1', 'C++', '编程入门....', '3', '1');
INSERT INTO `tb_course` VALUES ('2', 'C', '编程入门.', '1', '1');
INSERT INTO `tb_course` VALUES ('3', 'JAVA', '应用型', '3', '1');
INSERT INTO `tb_coursedetail` VALUES ('1', '1', '2', 'Bmp文件结构以及每部分的具体内容\r\n灰度直方图，直方图均衡化，累积直方图\r\n空域滤波：平滑滤波（线性，非线性）锐化滤波（线性，非线性）\r\n几何变换：平移，旋转对称，缩放（变换矩阵，插值算法）\r\n噪声抑制：均值，中值，高斯(均值，中值对两类噪声比较)\r\n编码技术: 无损压缩，（霍夫曼，行程）有损压缩（DCT），三种冗余数据\r\n基于阈值值的图像分割：直方图阈值法，类间方差阈值法，最大熵阈值法\r\n形态学图像处理：膨胀运算，腐蚀运算，开运算，闭运算\r\nMatlab：打开，显示，写入，旋转，缩放  Matlab下平移如何实现？', '1.《C语言基础》--谭浩强\r\n2.《C语言进阶》--谭浩强', '111111', '2012-11-30', '1', null);
INSERT INTO `tb_coursedetail` VALUES ('2', '2', '7', null, null, null, '2012-12-03', '1', null);
INSERT INTO `tb_coursedetail` VALUES ('3', '2', '2', null, null, null, '2012-12-06', '1', null);
INSERT INTO `tb_coursedetail` VALUES ('4', '3', '2', null, null, null, '2012-12-08', '1', null);
INSERT INTO `tb_coursenotification` VALUES ('2', '1', '明天查作业', '											明天查作业，不交的挂科。\r\n大家都来哦。\r\n										', '2012-12-12 23:12:29', '10');
INSERT INTO `tb_coursetaking` VALUES ('1', '2', '3', null, '1');
INSERT INTO `tb_coursetaking` VALUES ('2', '1', '3', null, '1');
INSERT INTO `tb_coursetype` VALUES ('1', '必修课。', '计算机必修');
INSERT INTO `tb_coursetype` VALUES ('2', '专业修选课', '专业内自由选择');
INSERT INTO `tb_courseware` VALUES ('8', '3', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\产品研发部\\C_必修课。\\赵亚星\\DLX流水线模拟程序说明.doc', 'DLX流水线模拟程序说明.doc', '2012-12-06 13:13:26', '0');
INSERT INTO `tb_courseware` VALUES ('9', '1', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\计算机学院\\C++_必修课。\\赵亚星\\0 绪论.ppt', '0 绪论.ppt', '2012-12-20 13:49:44', '0');
INSERT INTO `tb_courseware` VALUES ('10', '1', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\计算机学院\\C++_必修课。\\赵亚星\\1-4 BMP文件格式.ppt', '1-4 BMP文件格式.ppt', '2012-12-20 13:49:51', '0');
INSERT INTO `tb_coursework` VALUES ('4', '2', '3', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\计算机学院\\C++_必修课。\\赵亚星\\课程作业\\第二次作业\\8 图像编码技术.ppt', '2012-12-13 00:00:00', '8 图像编码技术.ppt');
INSERT INTO `tb_coursework` VALUES ('5', '1', '3', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\计算机学院\\C++_必修课。\\赵亚星\\课程作业\\第一次作业\\7 频域图像增强.ppt', '2012-12-13 00:00:00', '7 频域图像增强.ppt');
INSERT INTO `tb_coursework` VALUES ('6', '4', '3', 'E:\\MyEclipse 10\\.metadata\\.me_tcat\\webapps\\IMUCourseNet\\uploadFiles\\计算机学院\\C++_必修课。\\赵亚星\\课程作业\\发送的发送的\\8 图像编码技术.ppt', '2012-12-20 13:51:00', '8 图像编码技术.ppt');
INSERT INTO `tb_courseworkrequirement` VALUES ('1', '1', '第一次作业', '做一个9*9乘法表；', '2012-12-07 13:47:18', '2012-12-07 13:47:18');
INSERT INTO `tb_courseworkrequirement` VALUES ('2', '1', '第二次作业', '做一个基于MFC的计算器。', '2012-12-07 19:21:15', '2012-12-07 19:21:15');
INSERT INTO `tb_courseworkrequirement` VALUES ('3', '1', ' 对付对付', '大幅度', '2012-12-13 09:48:12', '2012-12-13 09:48:12');
INSERT INTO `tb_courseworkrequirement` VALUES ('4', '1', '发送的发送的', '放水电费', '2012-12-13 09:55:35', '2012-12-31 00:00:00');
INSERT INTO `tb_department` VALUES ('1', '产品研发部', '研发各种软件');
INSERT INTO `tb_department` VALUES ('2', '产品测试部', '测试开发的软件');
INSERT INTO `tb_department` VALUES ('3', '计算机学院', '计算机学院');
INSERT INTO `tb_department` VALUES ('4', '软件学院', '依托于计算机学院');
INSERT INTO `tb_department` VALUES ('5', '数学学院', '内大的好专业');
INSERT INTO `tb_department` VALUES ('7', '化学学院', '化学相关专业,就业好。');
INSERT INTO `tb_message` VALUES ('1', '3', '恭喜恭喜~', '2012-12-02 00:00:00');
INSERT INTO `tb_message` VALUES ('3', '3', '123', '2012-12-02 00:00:00');
INSERT INTO `tb_message` VALUES ('4', '3', '544444', '2012-12-02 00:00:00');
INSERT INTO `tb_message` VALUES ('16', '1', '我来了。', '2012-12-12 20:05:15');
INSERT INTO `tb_message` VALUES ('17', '1', 'heihie', '2012-12-20 13:31:33');
INSERT INTO `tb_news` VALUES ('1', '345', '123', 'admin', '0', '2012-12-12 08:41:13');
INSERT INTO `tb_news` VALUES ('2', '测试一下。', '教学网测试', 'admin', '0', '2012-12-12 23:16:37');
INSERT INTO `tb_notice` VALUES ('1', '明天放假。', '通知，注意。', 'admin', '0', '2012-12-12 09:47:01');
INSERT INTO `tb_notice` VALUES ('2', '123', '111', 'admin', '0', '2012-12-13 08:26:07');
INSERT INTO `tb_notice` VALUES ('3', '111111111111111111111111111111111111111111111111111111111111', '111', 'admin', '0', '2012-12-20 17:57:00');
INSERT INTO `tb_post` VALUES ('1', '1', '2', 'fdfdf', 'fdfdfdfdf', '2012-12-13', '18', '9');
INSERT INTO `tb_post` VALUES ('2', '2', '3', '老师好', 'rtrr', '2012-12-20', '0', '0');
INSERT INTO `tb_postreply` VALUES ('1', '1', '2', '232143243fdgfdgfgdfgfdg', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('2', '1', '2', 'gdfgdfgdfgdfgdfgdfgdfgfdgdfg', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('3', '1', '2', 'gfd', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('4', '1', '2', 'ddd', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('5', '1', '2', '大家好。', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('6', '1', '2', '大家好。', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('7', '1', '2', '和风格恢复规划', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('8', '1', '2', 'gfdgdf', '2012-12-13');
INSERT INTO `tb_postreply` VALUES ('9', '1', '2', 'sdfsdfsdf', '2012-12-13');
INSERT INTO `tb_specialty` VALUES ('1', '3', '计算机科学与技术', '好专业啊。11');
INSERT INTO `tb_specialty` VALUES ('2', '4', '软件工程', '需大于供的专业。');
INSERT INTO `tb_user` VALUES ('1', 'admin', 'admin', '范英明', 'yingmingfan@gmail.com', '1', '3', null);
INSERT INTO `tb_user` VALUES ('2', 'teacher', 'teacher', '赵亚星', 'zyx@qq.com', '2', '3', null);
INSERT INTO `tb_user` VALUES ('3', 'student', 'student', '潘胜文', 'shengwenpan@gmail.com', '3', '4', null);
INSERT INTO `tb_user` VALUES ('7', 'teacher1', 'teacher', '班老师', 'ban@imu.edu.cn', '2', '3', null);
INSERT INTO `tb_user` VALUES ('15', '00947002', '1', '002', '12', '3', '3', '1');
INSERT INTO `tb_user` VALUES ('17', '123', '123', '12311111', '123', '1', '2', null);
INSERT INTO `tb_user` VALUES ('20', '111', '', '', '', '1', '1', null);
INSERT INTO `tb_user` VALUES ('21', 'dsasd', 'adasd', 'adsd', 'dasd', '1', '2', null);
INSERT INTO `tb_user` VALUES ('22', 'fsdfsdf', 'sdff', 'df', 'dfd', '1', '1', null);
INSERT INTO `tb_user` VALUES ('23', 'ddd', 'dd', 'dd', 'dd', '1', '1', null);
INSERT INTO `tb_user` VALUES ('24', 'dd', 'ff', 'ff', 'ff', '1', '2', null);
INSERT INTO `tb_user` VALUES ('25', 'fdfd', 'dffd', 'dff', 'df', '1', '1', null);
