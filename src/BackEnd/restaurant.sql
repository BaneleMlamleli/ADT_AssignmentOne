-- MySQL Script generated by MySQL Workbench
-- Mon Mar 25 22:18:57 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema restaurant
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `restaurant`;

-- -----------------------------------------------------
-- Schema restaurant
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `restaurant` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `restaurant`;

-- -----------------------------------------------------
-- Table `restaurant`.`order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant`.`order`;

CREATE TABLE IF NOT EXISTS `restaurant`.`order` (
  `order_id` INT(11) NOT NULL AUTO_INCREMENT,
  `comment` VARCHAR(256) NULL DEFAULT NULL,
  `order_name` VARCHAR(45) NULL DEFAULT NULL COMMENT 'This refers to the actual name of the order that is in the menu. E.g. Steak and Chips or Grilled chicken salad',
  `waiter_name` VARCHAR(45) NULL DEFAULT NULL,
  `order_status` VARCHAR(45) NULL DEFAULT NULL,
  `order_bill` DOUBLE NOT NULL,
  `order_date` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant`.`stock`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant`.`stock`;

CREATE TABLE IF NOT EXISTS `restaurant`.`stock` (
  `stock_id` INT(11) NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(45) NULL DEFAULT NULL COMMENT 'This is the name of the item. E.g. Steak, chease, shrimps',
  `usage` INT(11) NOT NULL COMMENT 'This is an incremental value that reflects that use of an item. E.g. If a slice of cheese has been used it will increment by one to simulate that it has been used.',
  PRIMARY KEY (`stock_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant`.`table`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant`.`table`;

CREATE TABLE IF NOT EXISTS `restaurant`.`table` (
  `table_id` INT(11) NOT NULL AUTO_INCREMENT,
  `table_status` VARCHAR(45) NULL DEFAULT NULL,
  `table_number` INT(11) NULL DEFAULT NULL COMMENT 'I\\\\\'\'ve changed it to table_number instead of table_name',
  `waiter_name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`table_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `restaurant`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `restaurant`.`user`;

CREATE TABLE IF NOT EXISTS `restaurant`.`user` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `title` VARCHAR(45) NULL DEFAULT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;