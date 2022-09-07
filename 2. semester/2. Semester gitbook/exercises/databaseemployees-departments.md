# Exercise: Employees & Departments

##### These exercises will cover the most foundational topics of database basics:

- Generel selection
- Joins



#### Create database employees-departments

```sql
CREATE DATABASE employees-departments;
```

Run following script

```SQL
DROP TABLE if exists employees;
DROP TABLE if exists departments;

CREATE TABLE departments (	
	department_number INTEGER AUTO_INCREMENT, 
	department_name VARCHAR(30), 
	location VARCHAR(30), 
	PRIMARY KEY (department_number)
); 

CREATE TABLE employees(	
	id INTEGER AUTO_INCREMENT, 
	employee_name VARCHAR(30), 
	job VARCHAR(30), 
	manager INTEGER, 
	hiredate DATE, 
	salary INTEGER, 
	commission INTEGER, 
	department_number INTEGER, 
	PRIMARY KEY (id),
	FOREIGN KEY (department_number) REFERENCES departments(department_number)
);
 
Insert into departments (department_number,department_name,location) values (10,'ACCOUNTING','NEW YORK');
Insert into departments (department_number,department_name,location) values (20,'RESEARCH','DALLAS');
Insert into departments (department_number,department_name,location) values (30,'SALES','CHICAGO');
Insert into departments (department_number,department_name,location) values (40,'OPERATIONS','BOSTON');

insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7521,'WARD','SALESMAN',7698,'1981-02-22', 1250,500,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,null,10);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,null,20);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7839,'KING','PRESIDENT',null,'1981-11-17',5000,null,10);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7876,'ADAMS','CLERK',7788,'1987-05-23',1100,null,20);
Insert into employees (id,employee_name,JOB,manager,HIREDATE,salary,commission,department_number) values (7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30);
insert into employees (id,employee_name,job,manager,hiredate,salary,commission,department_number) values (7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20);
Insert into employees (id,employee_name,JOB,manager,HIREDATE,salary,commission,department_number) values (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);
```



## Exercises

- Find all employees
- Find the employee with the highest salary
- Find all employees with a name longer than 4 characters
- Find the sum of all commission salary
- Find all employees that works in Chicago