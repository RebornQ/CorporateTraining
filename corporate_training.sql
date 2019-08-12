/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : corporate_training

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 12/08/2019 11:22:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `checked` int(11) DEFAULT NULL COMMENT '是否选择，1-已选，2未勾选',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='购物车';

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别ID',
  `parent_id` int(11) DEFAULT NULL COMMENT '父类别ID',
  `name` varchar(50) DEFAULT NULL COMMENT '类名',
  `status` tinyint(1) DEFAULT '1' COMMENT '类别状态 1-正常 2-废弃',
  `sort_order` int(4) DEFAULT NULL COMMENT '排序编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` bigint(20) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `shiping_id` int(11) DEFAULT NULL COMMENT '地址',
  `payment` decimal(20,2) DEFAULT NULL,
  `payment_type` int(4) DEFAULT NULL COMMENT '支付类型',
  `postage` int(11) DEFAULT NULL COMMENT '运费',
  `payment_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `close_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_index` (`order_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `order_no` bigint(20) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `product_name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `product_image` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `current_unit_price` decimal(20,2) DEFAULT NULL COMMENT '生成订单时的商品单价',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for pay_info
-- ----------------------------
DROP TABLE IF EXISTS `pay_info`;
CREATE TABLE `pay_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `order_no` bigint(20) DEFAULT NULL COMMENT '订单号',
  `pay_platform` int(10) DEFAULT NULL COMMENT '支付平台：1-支付宝，2-微信',
  `platform_number` varchar(200) DEFAULT NULL COMMENT '流水号',
  `platform_status` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL COMMENT '商品名称',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `main_image` varchar(500) DEFAULT NULL,
  `detail` text,
  `price` decimal(20,2) NOT NULL,
  `stock` int(11) NOT NULL COMMENT '库存',
  `status` int(11) DEFAULT '1' COMMENT '1-在售 2-下架 3-删除',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shiping
-- ----------------------------
DROP TABLE IF EXISTS `shiping`;
CREATE TABLE `shiping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `receiver_name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `receiver_phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `receiver_province` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `receiver_city` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `receiver_district` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '区县',
  `receiver_address` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='收货地址';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `question` varchar(100) DEFAULT NULL COMMENT '找回问题',
  `answer` varchar(100) DEFAULT NULL COMMENT '找回答案',
  `role` int(4) NOT NULL COMMENT '0-管理员，1-普通用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_unique` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (22, 'test1', 'e10adc3949ba59abbe56e057f20f883e', '', NULL, NULL, NULL, 1, '2019-06-20 05:49:15', '2019-06-24 03:44:30');
INSERT INTO `user` VALUES (23, 'test2', 'e10adc3949ba59abbe56e057f20f883e', 'string', 'string', 'string', 'string', 0, '2019-06-21 03:33:56', '2019-06-21 03:33:56');
INSERT INTO `user` VALUES (24, 'test3', 'e10adc3949ba59abbe56e057f20f883e', 'string', 'string', 'string', 'string', 0, '2019-06-21 04:42:32', '2019-06-21 04:42:32');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
