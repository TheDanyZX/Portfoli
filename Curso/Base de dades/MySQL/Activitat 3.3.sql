CREATE DATABASE IF NOT EXISTS business;
USE buisness;

CREATE TABLE employee (
id_employee INTEGER(4),
name VARCHAR(15),
surname VARCHAR(30),
work VARCHAR(10),
position INTEGER(4),
contract DATE,
salary INTEGER(7),
comission INTEGER(7),
department INTEGER(2),
PRIMARY KEY (id_employee)
);
