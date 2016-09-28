
-- 创建预约信息表
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `erp_code` varchar(50) NOT NULL COMMENT '员工erp账号',
  `erp_name` varchar(50) NOT NULL COMMENT '员工姓名',
  `visit_name` varchar(50) DEFAULT NULL COMMENT '访客姓名',
  `cellphone` varchar(50) DEFAULT NULL COMMENT '访客手机号',
  `book_time` date DEFAULT NULL COMMENT '预约日期',
  `comment` varchar(500) DEFAULT NULL COMMENT '预约说明',
  `yn` tinyint(2) NOT NULL COMMENT '是否有效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `book_info` VALUES ('2', 'zhangsan', '张三', '李四', '13500971023', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 17:00:55', '2015-10-12 17:00:55');
INSERT INTO `book_info` VALUES ('3', 'zhangsan', '张三', '王五', '1392323489', '2015-10-13', '谈论三星返利的事前', '1', '2015-10-12 17:02:11', '2015-10-12 17:02:32');
INSERT INTO `book_info` VALUES ('5', 'zhangsan', '张三', '李四3', '13500971003', '2015-10-13', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('6', 'zhangsan', '张三', '李四4', '13500971004', '2015-10-14', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('7', 'zhangsan', '张三', '李四5', '13500971005', '2015-10-15', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('8', 'zhangsan', '张三', '李四6', '13500971006', '2015-10-16', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('9', 'zhangsan', '张三', '李四7', '13500971007', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('10', 'zhangsan', '张三', '李四8', '13500971008', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:02', '2015-10-12 18:31:02');
INSERT INTO `book_info` VALUES ('11', 'zhangsan', '张三', '李四9', '13500971009', '2015-10-12', '谈论三星采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:43');
INSERT INTO `book_info` VALUES ('12', 'zhangsan', '张三', '李四10', '13500971110', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('13', 'zhangsan', '张三', '李四11', '13500971111', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('14', 'zhangsan', '张三', '李四12', '13500971113', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('15', 'zhangsan', '张三', '李四13', '13500971113', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('16', 'zhangsan1', '张三1', '李四14', '13500971014', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('17', 'zhangsan1', '张三1', '李四15', '13500971015', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('18', 'zhangsan1', '张三1', '李四16', '13500971016', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('19', 'zhangsan1', '张三1', '李四17', '13500971017', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('20', 'zhangsan1', '张三1', '李四18', '13500971018', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('21', 'zhangsan1', '张三1', '李四19', '13500971019', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('22', 'zhangsan1', '张三1', '李四20', '13500971020', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('23', 'zhangsan1', '张三1', '李四21', '13500971021', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('24', 'zhangsan1', '张三1', '李四22', '13500971022', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('25', 'zhangsan2', '张三2', '李四23', '13500971023', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('26', 'zhangsan2', '张三2', '李四24', '13500971024', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('27', 'zhangsan2', '张三2', '李四25', '13500971025', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('28', 'zhangsan2', '张三2', '李四26', '13500971026', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');
INSERT INTO `book_info` VALUES ('29', 'zhangsan2', '张三2', '李四27', '13500971027', '2015-10-12', '谈论iphone采购价格的事前', '1', '2015-10-12 18:31:03', '2015-10-12 18:31:03');


-- 创建员工信息表
DROP TABLE IF EXISTS `staff_info`;
CREATE TABLE `staff_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `erp_code` varchar(50) NOT NULL COMMENT '员工erp账号',
  `erp_name` varchar(50) NOT NULL COMMENT '员工姓名',
  `dept` varchar(100) DEFAULT NULL COMMENT '员工部门',
  `cellphone` varchar(50) DEFAULT NULL COMMENT '访客手机号',
  `yn` tinyint(2) NOT NULL COMMENT '是否有效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `staff_info` VALUES ('1', 'zhangsan', '张三', '采销部门', '1377095656', '1', '2015-10-12 18:17:21', '2015-10-12 18:17:25');
INSERT INTO `staff_info` VALUES ('2', 'zhangsan2', '张三2', '采销部门', '1377095652', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('3', 'zhangsan3', '张三3', '采销部门', '1377095653', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('4', 'zhangsan4', '张三4', '采销部门', '1377095654', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('5', 'zhangsan5', '张三5', '采销部门', '1377095655', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('6', 'zhangsan6', '张三6', '采销部门', '1377095656', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('7', 'zhangsan7', '张三7', '采销部门', '1377095657', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');
INSERT INTO `staff_info` VALUES ('8', 'zhangsan8', '张三8', '采销部门', '1377095658', '1', '2015-10-12 18:17:16', '2015-10-12 18:17:16');



-- 创建访问信息表
DROP TABLE IF EXISTS `visit_info`;
CREATE TABLE `visit_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `visit_name` varchar(50) NOT NULL COMMENT '访客姓名',
  `identity_card` varchar(50) DEFAULT NULL COMMENT '访客身份证号',
  `cellphone` varchar(50) DEFAULT NULL COMMENT '访客手机号',
	`address` varchar(200) DEFAULT NULL COMMENT '访客住址',
	`note` varchar(200) DEFAULT NULL COMMENT '访问原由',
  `yn` tinyint(2) NOT NULL COMMENT '是否有效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `visit_info` VALUES ('1', '王五', '421165198705365346', '1392323489', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('2', '王五2', '421165198705365352', '1392323482', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('3', '王五3', '421165198705365353', '1392323483', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('4', '王五4', '421165198705365354', '1392323484', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('5', '王五5', '421165198705365355', '1392323485', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('6', '王五6', '421165198705365356', '1392323486', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('7', '王五7', '421165198705365357', '1392323487', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('8', '王五8', '421165198705365358', '1392323488', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('9', '王五9', '421165198705365359', '1392323489', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('10', '王五10', '421165198705365360', '1392323490', '北京市丰台区', '谈论三星返利的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');
INSERT INTO `visit_info` VALUES ('11', '李四', '421165198705365386', '13500971023', '北京市丰台区', '谈论iphone采购价格的事前', '1', '2015-10-13 12:46:15', '2015-10-13 12:46:18');



