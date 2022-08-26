CREATE TABLE `preferences` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` int(11) DEFAULT NULL,
    `locale` varchar(255) DEFAULT NULL,
    `diet` varchar(255) DEFAULT NULL,
    `notify_off` boolean DEFAULT false,
    PRIMARY KEY (`id`)
)