DROP TABLE IF EXISTS DEPARTMENT;

CREATE TABLE DEPARTMENT (
  department_id INT AUTO_INCREMENT  PRIMARY KEY,
  department_name VARCHAR(250) NOT NULL,
  department_address VARCHAR(250) NOT NULL,
  department_code VARCHAR(250) DEFAULT NULL
);