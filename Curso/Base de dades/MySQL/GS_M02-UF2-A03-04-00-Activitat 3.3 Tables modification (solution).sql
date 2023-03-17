-- Task 1. Database
CREATE DATABASE IF NOT EXISTS business;
USE business;

-- Task 2. Employee table
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

-- Task 3. Employee Modification
ALTER TABLE employee
	MODIFY salary NUMERIC(7, 2) NOT NULL;
ALTER TABLE employee
	ADD CONSTRAINT uk_employee_salary_comission UNIQUE (salary, comission);
ALTER TABLE employee CHANGE work management VARCHAR(30);

-- Task 4. Department Table
CREATE TABLE department (
    id_department INTEGER(2),
    name VARCHAR(9),
    location VARCHAR(10),
    creation DATE,
    PRIMARY KEY (id_department)
);

-- Task 5. Employee Modification II
ALTER TABLE employee CHANGE department department_id INTEGER(2);
ALTER TABLE employee 
	ADD CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES department (id_department);
        
-- Task 6. Department Modification
SHOW CREATE TABLE department;
SHOW CREATE TABLE employee;
ALTER TABLE employee 
	DROP FOREIGN KEY fk_employee_department;
ALTER TABLE department 
	DROP PRIMARY KEY;
ALTER TABLE department 
	MODIFY location VARCHAR(10) NOT NULL DEFAULT 'Terrassa';
ALTER TABLE department
	DROP COLUMN creation;
ALTER TABLE department 
	ADD registration DATETIME DEFAULT CURRENT_TIMESTAMP;