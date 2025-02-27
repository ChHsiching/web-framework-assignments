# 创建 homework 数据库
CREATE DATABASE IF NOT EXISTS `homework` DEFAULT CHARSET utf8mb4;

USE `homework`;
# 创建 student 学生信息表
CREATE TABLE `student` (
                           `no` CHAR(10) NOT NULL,
                           `name` CHAR(8) NOT NULL,
                           PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
# 添加样本数据
INSERT INTO `homework`.`student` VALUES ('1', '张三');
INSERT INTO `homework`.`student` VALUES ('2', '李四');
INSERT INTO `homework`.`student` VALUES ('3', '王五');