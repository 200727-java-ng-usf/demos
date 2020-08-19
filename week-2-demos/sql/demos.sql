-- single ling comment 

/*
	Multiline Comment
*/


/*

	Departments
	-id (auto incrementing)
	-name varchar
	-monthly_budget numeric
	
	Employees
	-id serial
	-first_name varchar
	-last_name varchar
	-birthdate date
	-monthly_income numeric
	-department_id int
	-hire_date date (with a default)
	-job_title varchar
	-email varchar
	
	Products
	-id serial
	-name varchar
	-price numeric
	-expiration_date date
	
*/

--drop table if exists products;
--drop table if exists employees;
--drop table if exists departments;

create table departments(
 	id 				serial constraint departments_pk primary key, --another way to declare constraint
 	name 			varchar(25) unique not null,
 	monthly_budget	numeric(8,2)
 
);

create table employees(
	id				serial,
	first_name 		varchar(25) not null,
	last_name		varchar(25) not null,
	birthdate		date not null,
	monthly_income	numeric(7,2),
	department_id	int,
	hire_date		date default current_date,
	job_title		varchar(25) not null,
	email			varchar(256)not null,
	
	constraint employees_pk
	primary key (id),
	
	constraint employee_department_fk
	foreign key (department_id)
	references departments 

);

create table products(
	id				serial,
	name			varchar(50) not null,
	price			numeric(7,2) default 0,
	expiration_date date not null
);


alter table products
add constraint products_pk primary key (id);

--no need to commit the above statements, ddl statements are implicitly committed

--add values into the departments table

insert into departments(name,monthly_budget)
values
	('Accounting',20000),
	('Marketing',15000),
	('IT',30000),
	('Human Resources',25000),
	('Customer Service',2000),
	('Regulatory Affairs',5000);
	

insert into employees (first_name, last_name, birthdate, monthly_income, department_id, hire_date, job_title,email)
values
	('JOHN', 'SMITH', date '1995-01-01', 4000.00, 1, date '2015-03-28', 'AC_ACCOUNT', 'JSMITH'), 
	('JAMES', 'BOSH', date '1992-02-15', 3500.00, 2, date '2014-07-01', 'MK_REP', 'JBOSH'),
	('LUISA', 'JACKSON', date '1970-03-08', 4500.00, 3, date '2013-08-29', 'IT_PROG', 'LJACKSON'),
	('STUART', 'GARCIA', date '1965-04-12', 2000.00, 4, date '2010-02-15', 'HR_REP', 'SGARCIA'),
	('JUSTIN', 'BLACK', date '1990-05-16', 2550.00, 1, date '2015-05-02', 'AC_ACCOUNT', 'JBLACK'),
	('ANGIE', 'CROOD', date '1998-06-22', 1500.00, 1, date '2015-07-01', 'AC_ACCOUNT', 'ACROOD'),
	('CHARLES', 'DEAN', date '1973-06-08', 2250.00, 3, date '2002-03-01', 'IT_PROG', 'CDEAN'),
	('EDDIE', 'FARREL', date '1980-07-28', 3000.00, 1, date '2009-04-20', 'AC_ACCOUNT', 'EFARREL'),
	('GEORGE', 'HAYES', date '1982-08-03', 2500.00, 2, date '2012-09-22', 'MK_REP', 'GHAYES'),
	('IGOR', 'OSBOURNE', date '1987-09-11', 6000.00, 3, date '2014-11-14', 'IT_PROG', 'IKEYS'),
	('LUKE', 'MINT', date '1985-10-19', 5000.00, 4, date '2011-01-08', 'HR_REP', 'LMINT'),
	('NIGEL', 'OAKS', date '1997-11-05', 4750.00, 4, date '2014-10-01', 'HR_REP', 'NOAKS'),
	('LUKE', 'GREEN', date '1995-02-05', 4750.00, 4, date '2015-09-01', 'HR_REP', 'LGREEN');
	
insert into products(name,price,expiration_date)
values
	('Aspirin', 5.00, date '2020-12-31'),
	('Penicillin', 10.00, date '2019-04-30'),
	('Insulin', 25.00, date '2018-05-31'),
	('Acetaminophen', 5.00, date '2019-01-31'),
	('Amoxicillin', 8.00, date '2018-07-31');

--DML statements must be explicitly committed
commit;

select * from employees;

select * from departments;

select * from products;


-- + ----------------------------------------------+

-- get all from a table 
select * 
from products;

-- get certain columns from a table
select name, price
from products;

-- not too many restrictions on the column selector list
select name, price, 'test', name, (price - (price * .3) ) as thirty_per_off -- column alias
from products;


-- WHERE clause
select id, name, price
from products 
where price <= 10;


select * 
from products 
where expiration_date <'01-APR-2019';

select * 
from products 
where expiration_date  < date '2019-04-01';

select *
from products
where
	(id < 5
		or 
		name = 'Amoxicillin'
		and price > 10
	)
	and 
	(
		price <= 10
		or expiration_date = date '2018-04-30'
	
	);


-- distinct keyword

		select department_id
		from employees;
		
	--eliminate duplicates with distinct
	
	select distinct department_id
	from employees;
	
	-- a record is considered duplicate if all of the selected values match to another retrieved reocrd

	select distinct first_name, last_name, department_id
	from employees;
	

--ORDER BY 
select * from employees
order by birthdate asc; --asc not required


--  same but in reverse
select * from employees 
order by birthdate desc;


-- ORDER by with string
select * from employees 
order by first_name ;

--apply more than one odering criteria
select * from employees 
order by department_id desc, monthly_income;

-- same as above, but using column positions instead of column names
-- SQL indexes column positions starting at 1 (blah)
-- not recommended to usea this since it decreases script/query readability

select * from employees
order by 6 desc, 5;



/*Scalar functions
 * 
 * single-row/value function, return a value for
 * every row that is processed in a query
 * 
 * Types
 *		- Numeric functions (https://www.postgresql.org/docs/11/functions-math.html)
 * 		- Character functions (https://www.postgresql.org/docs/11/functions-string.html)
 * 		- Date functions (https://www.postgresql.org/docs/11/functions-datetime.html)
 */
 

select substring('test', 1,3);
select abs(-11);
select floor(2.678);
select ceiling(2.00001);
select round(2.4999);
select round(2.5);
select length('shea');
select age (current_timestamp, timestamp ' 1984-09-06');

/*
 * Aggregate functions
 * 
 *  * 		Operations which can be performed on a group of records in order to
 * 		provide a single value/result.
 * 
 */


select min(price) as min_price, max(price), avg(price), sum(price)
from products;

alter table products
add abbr_name varchar(4);



-- update values 

update products
set abbr_name = substring (name, 1, 4)
where id < 4;

select count(abbr_name)
from products;

select*from products;

-- Task for you: determine the purpose and usage of the GROUP BY keyword, and compare it to the ORDER BY keyword
-- Task for you: determine the purpose and usage of the HAVING clause, and compare it to the where clause


/*
 * Logical operators
 * 	- AND, OR, NOT
		- documentation links:
			+ https://www.postgresql.org/docs/9.1/functions-logical.html
			+ https://www.postgresql.org/docs/9.1/functions-comparison.html
 * 
 */

commit;

