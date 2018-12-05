/*
 Navicat Premium Data Transfer

 Source Server         : greenland
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : greenland

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 05/12/2018 17:20:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_basic
-- ----------------------------
DROP TABLE IF EXISTS `user_basic`;
CREATE TABLE `user_basic` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `email` varchar(255) DEFAULT NULL COMMENT '邮件地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `public_addr` varchar(255) DEFAULT NULL COMMENT '住址',
  `is_delete` tinyint(4) NOT NULL COMMENT '0 : 未删除 1:删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_sso
-- ----------------------------
DROP TABLE IF EXISTS `user_sso`;
CREATE TABLE `user_sso` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
