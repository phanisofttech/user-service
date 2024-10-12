USE `RDCRMS`;

CREATE TABLE `user` (
  `aadhaar_number` bigint NOT NULL,
  `user_first_name` varchar(50) DEFAULT NULL,
  `user_last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `mobile_number` bigint DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `address_line1` varchar(40) DEFAULT NULL,
  `village` varchar(15) DEFAULT NULL,
  `mandal` varchar(15) DEFAULT NULL,
  `district` varchar(15) DEFAULT NULL,
  `pin` int DEFAULT NULL,
  `state` varchar(15) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  `otp` int DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `photo` blob,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_by` varchar(30) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  PRIMARY KEY (`aadhaar_number`)
) ;

INSERT INTO `user` VALUES (111122223333,'test user1','testing','male','2000-01-01',9988776655,'testuser1@gmail.com','testing street','test village','nellore','nellore',524344,'Andrapradesh','India',0,NULL,NULL,'phanindra kumar','phanindra kumar','2024-09-14','2024-09-14');
