CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `articles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO users VALUES (1,'test');
INSERT INTO articles VALUES (1,'sample');