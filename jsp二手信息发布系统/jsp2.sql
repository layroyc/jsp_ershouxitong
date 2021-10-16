/*
 Navicat Premium Data Transfer

 Source Server         : wy
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : jsp2

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 10/01/2021 09:59:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '123', '1234567890');

-- ----------------------------
-- Table structure for ershou
-- ----------------------------
DROP TABLE IF EXISTS `ershou`;
CREATE TABLE `ershou`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `kind` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `faburen` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` datetime(6) NOT NULL,
  `qingkuang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ershou
-- ----------------------------
INSERT INTO `ershou` VALUES (1, 'l轮滑鞋', '娱乐', '200', 'admin', '13845893211', '2020-08-27 08:56:44.000000', '未出售');
INSERT INTO `ershou` VALUES (2, '考研书籍', '学习', '50', 'admin', '13845893211', '2020-09-12 08:58:40.000000', '已出售');
INSERT INTO `ershou` VALUES (3, '鞋架', '生活', '20', 'admin', '13845893211', '2020-09-20 09:57:21.000000', '未出售');
INSERT INTO `ershou` VALUES (4, '水桶', '生活', '10', 'admin', '13845893211', '2020-09-22 09:58:27.000000', '未出售');

SET FOREIGN_KEY_CHECKS = 1;
