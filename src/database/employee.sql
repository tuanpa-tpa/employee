USE employee;

CREATE TABLE `employee`
(
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL,
    country VARCHAR(100),
    PRIMARY KEY (id)
);
