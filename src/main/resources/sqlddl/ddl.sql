CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(128) NOT NULL,
  `user_text` varchar(255) NOT NULL,
  `added_at_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `user_city` varchar(45) DEFAULT NULL,
  `geo_latitude` decimal(10,6) DEFAULT NULL,
  `geo_longitude` decimal(10,6) DEFAULT NULL,
  `temperature_celsius` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idxid` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
;