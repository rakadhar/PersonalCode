CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `dim_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `dim_employee`
--

INSERT INTO `dim_employee` VALUES 
	(1,'Terry','McGin','Terry@test.com'),
	(2,'Emma','Baumgarten','emma@test.com'),
	(3,'Avani','Gupta','avani@test.com'),
	(4,'Yuri','Petrov','yuri@test.com'),
	(5,'Juan','Vega','juan@test.com');
    
    
  --
-- Table to keep all our different regulations and policies  `dim_regulations`
--  
    CREATE TABLE `employee_directory`.`dim_regulations` (
  `Regulations_id` int(11) NOT NULL AUTO_INCREMENT,
  `Regualtion_Name` VARCHAR(45) NULL,
  `Regualtion_Desc` VARCHAR(500) NULL,
  PRIMARY KEY (`Regulations_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- 
-- dimension data for policy/regulations
--
INSERT INTO `employee_directory`.`dim_regulations` (`Regualtion_Name`, `Regualtion_Desc`) VALUES ('Fire Safety rule', 'Wear boots and helmet');
INSERT INTO `employee_directory`.`dim_regulations` (`Regualtion_Name`, `Regualtion_Desc`) VALUES ('Leave policy', 'Mandatory 14 days in a year ');

-- 
-- Final fact table 


CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `regulations_id` int(11),
  `regulation_name` varchar(45) DEFAULT NULL,
  `add_comments` varchar(500) NULL ,  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- data from employee and regulation 
--

INSERT INTO `employee` VALUES 
	(1,'Terry','McGin','Terry@test.com',1,'Fire Safety rule',''),
	(2,'Emma','Baumgarten','emma@test.com',1,'Fire Safety rule',''),
	(3,'Avani','Gupta','avani@test.com',1,'Fire Safety rule',''),
	(4,'Yuri','Petrov','yuri@test.com',1,'Fire Safety rule',''),
	(5,'Juan','Vega','juan@test.com',1,'Fire Safety rule','');
    

  --
-- Table structure for table `users` to apply Role based security model 
--
  
    CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- inserting data for table `users`
--
-- NOTE: data for users and the passwords are encrypted using BCrypt
--
-- A generation tool is avail at: https://www.browserling.com/tools/bcrypt
--
-- Default passwords here are: admin12; encrypted using BCrypt $2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS
--

INSERT INTO `users` 
VALUES 
('Terry','{bcrypt}$2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS',1),
('Avani','{bcrypt}$2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS',1),
('Emma','{bcrypt}$2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS',1),
('Yuri','{bcrypt}$2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS',1),
('Juan','{bcrypt}$2a$10$1gtXNSB4Tr5yT209R3cwAO8VC2Pf/9ltrUR0VA4edv49YOHmXiGpS',1);

-- select * from users
--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` 
VALUES 
('Emma','ROLE_EMPLOYEE'),
('Yuri','ROLE_EMPLOYEE'),
('Juan','ROLE_EMPLOYEE'),
('Emma','ROLE_USER'),
('Yuri','ROLE_USER'),
('Juan','ROLE_USER'),
('Terry','ROLE_EMPLOYEE'),
('Terry','ROLE_MANAGER'),
('Avani','ROLE_EMPLOYEE'),
('Avani','ROLE_ADMIN');






