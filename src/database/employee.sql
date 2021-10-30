USE employee;

CREATE TABLE `employee`
(
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL,
    country VARCHAR(100),
    PRIMARY KEY (id)
);

INSERT INTO `employee`.employee(name, email, country)
VALUES ('tuan', 'tuanpa.tpa@gmail.com','VietNam');

INSERT INTO `employee`.employee(name, email, country)
VALUES ('dung', 'tuantpa2@gmail.com','VietNam');

INSERT INTO `employee`.employee(name, email, country)
VALUES ('tuanmeo', 'helloptit@gmail.com','VietNam');
