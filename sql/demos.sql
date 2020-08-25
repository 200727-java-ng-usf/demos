-- single line comment

/*
 * multi line
 * comment
 */

/*
 * Departments 
 * 			-id serial (auto incrementing)
 * 			-name varchar val
 * 			-monthly_budget numeric
 * 	
 * 	Employees
 * 			-id serial 
 * 			-first name varchar
 * 			-last name varchar
 * 			-birthdate date
 * 			-monthly_income numeric
 * 			-department_id int
 * 			-hire_date (with a default)
 * 			-job_title varchar
 * 			-email varchar
 * 
 * 	Products
 * 		-id serial
 * 		-name varchar
 * 		-price numeric
 * 		-expiration_date date
 */

drop table if exists departments;
drop table if exists employees;
drop table if exists products;

create table departments(
	--another way to declare constraints
	id				serial constraint departments_pk primary key,
	name 			varchar(25) unique not null,
	-- first # is precision (# of digits); second  # is scale (# of decimal digits)
	monthly_budget	numeric(8, 2)
);

create table employees(
	id				serial,
	first_name		varchar(25) not null,
	last_name		varchar(25) not null,
	birthdate		date not null,
	monthly_income	numeric(7,2),
	department_id	int,
	hire_date		date default current_date,
	job_title		varchar(25) not null,
	email			varchar(256),
	
	constraint employees_pk
	primary key (id),
	
	constraint employee_department_fk
	foreign key (department_id)
	references departments
);

create table products(
	id 					serial,
	name 				varchar(50) not null,
	price 				numeric(7, 2) default 0,
	expiration_date		date not null
);


alter table products 
add constraint products_pk primary key (id);

-- no need to COMMIT the above statements, DDL statements are implicitly committed.

-- Add values into the departments table
insert into departments (name, monthly_budget) 
values 
	('Accounting', 20000),
	('Marketing', 15000),
	('IT', 30000),
	('Human Resources', 25000),
	('Customer Service', 2000),
	('Regulatory Affairs', 5000);

-- add values into the eployees table
insert into employees (first_name , last_name , birthdate , monthly_income , department_id , hire_date , job_title , email )
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

insert into products (name, price, expiration_date) values 
	('Aspirin', 5.00, date '2020-12-31'),
	('Penicillin', 10.00, date '2019-04-30'),
	('Insulin', 25.00, date '2018-05-31'),
	('Acetaminophen', 5.00, date '2019-01-31'),
	('Amoxicillin', 8.00, date '2018-07-31');

-- DML Statements must be explicitly committed.
commit;

select * from employees e ;

--delete from employees;

--rollback;

--truncate employees;

-- +----------------------------------------------------------------------------------------------+

-- get all info from a table 
select *
from products p ;

-- get certain columns from a table
select name, price
from products p ;

-- not too many restrictioons opn the column selector list
select name, price, 'test', name, (price - (price * .7)) as thirty_per_off --column alias
from products;

-- including extra things in the column selector list does not manipulate the table itself
-- only the result set generated from the query
select first_name, last_name, monthly_income as current_income, (monthly_income * 1.2) as pay_raise
from employees e 

select * 
from employees e ;


-- WHERE clause

select id, name, price
from products p 
where price >= 10;

select * 
from products p 
where expiration_date  < '01-APR-2019'; -- date string w/o "date" keyword; format = DD-MM-YYY

select * 
from products p 
where expiration_date < date '2019-04-01'; -- date string w/ "date" keyword; format = YYYY-MM-DD

select *
from products p 
where 
	(
		id < 5 
		or 
		name = 'Amoxicillin'
		and price > 10
	)
	and 
	(
		price <= 10
		or expiration_date = date '2018-04-30'
	);
	
-- DISTINCT keyword

select department_id 
from employees e ;

-- eliminate duplicates from result set using DISTINCT
select distinct department_id
from employees e ;

-- a record is considered "duplicate" if all the selected values match to another retrieved record
select distinct first_name, last_name, department_id
from employees e ;

-- ORDER BY 
select * 
from employees e 
order by birthdate asc; -- asc is imnplied, not required; ok to uyse, though

-- same result as above
select * 
from employees e 
order by birthdate;

select * 
from employees e 
order by birthdate desc;

-- ORDER BY with strings (varchar)

select * 
from employees e 
order by first_name asc;

select * 
from employees e 
order by first_name desc;

-- apply more than one ordering criteria 

select * 
from employees e 
order by department_id desc, monthly_income asc;

-- same query as above, but using column positions instead of column names
-- SQL indexes column positions starting at 1 (gross)
-- not recommended to use this since it decreases script/query readability
-- BAD BAD BAD BAD BAD BAD 
select * 
from employees e 
order by 6 desc, 5 asc;

/*
 * Scalar functions
 * 
 * 	Scalar function, aka single-row/value function, return a value for
 *  every row that is processed in a query. 
 * 
 *  Types:
 * 		- Numeric functions (https://www.postgresql.org/docs/11/functions-math.html)
 * 		- Character functions (https://www.postgresql.org/docs/11/functions-string.html)
 * 		- Date functions (https://www.postgresql.org/docs/11/functions-datetime.html)
 */

select substring('test', 1, 3); --inclusive range; index-1 based (gross)
select abs(-11); 				--11
select floor(2.678); 			--2
select ceil (2.000001); 		-- 3
select round(2.4999999999); 	--2
select round(2.5); 				--3
select length('wezley'); 		--6
select age(current_timestamp , timestamp '1992-08-25'); -- also works with date types

/*
 *	Aggregate functions
 *
 *		Operations which can be performed on a group of records in order to 
 *		provide a single value/result;
 */

select min(price) as min_price, max(price) as pax_price, avg(price) as average, sum(price)
from products p ;

-- count only counts non-null values
select count(name)
from products p ;

alter table products
add abbr_name varchar(4);

select * 
from products p ;

--update the values within the newly added column to contain the abbreviated name of each product
update products 
set abbr_name = substring(name, 1, 4) -- don't get confused, substring is a scalar function
where id < 4; 

select count(abbr_name)
from products p ; -- count() only counts non-null values

-- Task for you: determine the purpose and usage of the GROUP BY keyword, and compare it to the ORDER BY keyword
/*
 * GROUP BY 
 * 		This clause divides records returned from a SELECT statement into groups. With each group
 * 		we can apply some aggregate function to calcualte some value for that group. 
 */

select department_id, count(department_id)
from employees e 
group by department_id 
order by department_id;

-- Task for you: determine the purpose and usage of the HAVING clause, and compare it to the where clause

/*
 * HAVING clause
 * 	
 * 		Allows developers to pick out particular rows where some aggregate function's returned value
 * 		meets some condition.
 * 		
 * 		syntax breakdown:
 * 		SELECT...
 * 		FROM ...
 * 		WHERE... 
 * 		GROUP BY... 
 * 		HAVING... 
 * 		ORDER BY... 
 */

/*
 * Retrieve only departments whose smallest salary is less than 2000/month or 
 * the highest salary is greater than 4000/month. Display results in descending 
 * order by salary
 */

select department_id, min(monthly_income) as min_income, max(monthly_income) as max_income
from employees e 
group by department_id 
	having( 
		min(monthly_income ) < 2000
		or 
		max(monthly_income ) > 4000
)
order by min_income desc; -- use the column alias as a part of the ORDER BY clause



/*
	Logical Operators:
		- AND, OR, NOT
		- documentation links:
			+ https://www.postgresql.org/docs/9.1/functions-logical.html
			+ https://www.postgresql.org/docs/9.1/functions-comparison.html
*/
-- +-----------------------------------+

/*
 * Set Operations
 * 
 * 	Operations which can be used to manipulate result sets
 * 		- UNION
 * 		- UNION ALL
 * 		- EXCEPT (Oracle calls this minus, MySQL calls this DIFFERENCE)
 * 		- INTERSECT
 */

/*
 * UNION
 * 
 * 		Used to combine result sets of two or more queries. It will also remove any 
 * 		duplicate records found in those queries, if you want to preserve duplicates,
 * 		use the UNION ALL operator.
 * 		Makes a longer result set where a JOIN makes a wider result set.
 * 		
 * 		Rules for using UNION and UNION ALL
 * 		
 * 			+ All query result sets must have the SAME NUMBER OF COLUMNS
 * 			+ The datatypes of each column must be compatible with their counterparts
 */


-- Does not work (# of columns for each reesult set are different)
select * 
from departments d 
union 
select department_id 
from employees e ;

-- works, but note that duplicates were removed
select id 
from departments d 
union
select department_id 
from employees e ;

-- preserve duplicate records with UNION ALL
select id 
from departments d 
union all
select department_id 
from employees e ;

-- Does not work, int and date are not compatible with one another.
select id from departments d 
union
select hire_date from employees e ;


/*
 * EXCEPT
 * 
 * 		Works by returning the results that are found in RS#1 that are NOT also 
 * 		found in RS#2.
 * 
 */

-- 2
select department_id
from employees e 
where monthly_income between 2000 and 2500
except 
select id 
from departments d 
where monthly_budget > 15000;

-- 1
select id 
from departments d 
where monthly_budget > 15000
except 
select department_id
from employees e 
where monthly_income between 2000 and 2500;

/*
 * INTERSECT
 * 
 * 		Returns only the records which are included in the result sets of
 * 		both queries Also, duplicates are removed.
 * 
 */

select id 
from departments d 
where monthly_budget > 15000
intersect
select department_id
from employees e 
where monthly_income between 2000 and 2500;

-- +-----------------------------+

/*
 * JOIN operations
 * 
 * 	Types:
 * 		- INNER JOIN
 * 		- OUTER JOIN
 * 		- LEFT JOIN
 * 		- RIGHT JOIN
 * 		- self JOIN
 */

select * from employees e2 ;

-- inner join
select e.id, e.first_name, d.name
from employees e 
join departments d
on e.department_id = d.id ;

select e.id, e.first_name, d.name
from employees e 
inner join departments d
on e.department_id = d.id ;

select e.id, e.first_name, d.name
from employees e 
join departments d
on e.department_id = d.id ;

--changing employee.department_id to employee.dept_id
alter table employees 
rename column department_id
to dept_id;

--changing departments.id to departments.dept_id
alter table departments 
rename column id
to dept_id;

select * from employees e ;
select * from departments d ;

-- this still works, but can be shortened with the USING keyword

select e.id, e.first_name, d.name
from employees e
inner join departments d
on e.dept_id = d.dept_id;

--natural join can use the USING keyword; only works hen the two tables
-- being joined have a column name that is shared.
select e.id, e.first_name, d.name
from employees e
inner join departments d
using(dept_id);

select id, first_name, dept_id
from employees e 
join departments d 
using (dept_id);

-- We can achieve the same result as the above query without the JOIN keyword
-- though synta=ctically allowed, this is not usually recommended (readability)

select id, first_name, d.dept_id
from employees e , departments d 
where e.dept_id = d.dept_id ;

-- add a manager id column to the employees table
alter table employees 
add column manager_id int;

insert into employees (first_name , last_name , birthdate , monthly_income , dept_id , job_title , email, manager_id)
values ('AL', 'GREEN', date '1960-02-05', 10000, 4, 'CEO', 'AGREEN', 14);

select * from employees e order by dept_id ;
select * from departments d ;


update employees 
set manager_id = 1
where dept_id = 1 and not id = 1;

update employees 
set manager_id = 2
where dept_id = 2 and not id = 2;

update employees 
set manager_id = 10
where dept_id = 3 and not id = 10;

update employees 
set manager_id = 11
where dept_id = 4 
	and not (id = 11 or id = 14);

update employees 
set manager_id = 14
where ( id = 27 or id = 23 or id = 24 or id = 15);

select e.id, e.first_name, e.last_name, d.name, e.manager_id,
	em.first_name || ' ' || em.last_name as manager_name
from employees e
join employees em 
on e.manager_id = em.id
join departments d
on e.dept_id = d.dept_id 
order by d.name;

-- +------------------------+

create table colors(
	id serial,
	color varchar(10) not null,
	
	constraint colors_pk
	primary key (id)

);

create table sizes(
	id serial,
	size varchar(10) not null,
	
	constraint sizes_pk
	primary key (id)
	
);

insert into colors (color) values ('RED'), ('BLUE'), ('GREEN');
insert into sizes (size) values ('SMALL'), ('MEDIUM'), ('LARGE');

select * from colors;
select * from sizes;

/*
 * CROSS JOIN
 * 
 * returns a "cartiesian product", where all records from table 1 are paired with
 * every record from table 2. Sometimes CROSS JOIN is referred to as a JOIN without
 * conditions
 * 
 * The number of records in the result set will be equal to the poroduct of the 
 * # of records in the result of query 1 and query 2.
 * 
 */
select c.color, s.size
from colors c
cross join sizes s;

select c.color, s.size
from colors c
cross join sizes s
where c.color = 'BLUE';


-- do the same thing without saying "CROSS JOIN" (not recommended)
select c.color, s.size
from colors c, sizes s;

-- +----------------------+

/*
 * Subqueries
 * 
 * A subquery is a SELECT statement that is nested within another DML statement
 * and are always enclosed within parentheses. 
 * 
 */

select *
from employees e 
where monthly_income = -- = only works if the subwuuery returns a single value
	(
		select max(monthly_income )
		from employees e2
	);

update employees 
set monthly_income = 10000
where id = 14;

-- subqueryception
select *
from employees e 
where dept_id in -- works if the subquery returns multiple results.
	(
		select dept_id
		from departments d2 
		where monthly_budget >=
			(
				select avg(monthly_budget )
				from departments d3
			)
	);

/*
 * Transaction (TXs)
 * 
 * - database transaction represents a "unit of work" performed within a DBMS
 * - transactions are treated in a coherent and reliable way, separate from other transactions
 * 
 * Properties of TXs:
 * - Acronym: ACID
 * 	- A Atomicity (all statements execute fine or NONE do.)
 * 			If one of the statements fail, do you want the rest to operate?
 * 	- C Consistency (the result of the transaction does not violate referential integrity; no orphaned records)
 * 			Did you delete something that another record is referring to?
 *  - I Isolation (the degree to which txs on different threads are separated)
 *  - D Durability (If the system fails, or crashes, the database will still persist all comitted data)
 * 
 * Isolation Levels 
 * 		- READ_UNCOMMITTED	(least protective, handles no read phenomena)
 * 		- READ_COMMITTED	(most vendors make this the default level)
 * 		- REPEATABLE_READ	(some venders default to here)
 * 		- SERIALIZABLE		(highest level, biggest impact on performance and efficiency)
 * 
 * 
 * Read phenomena:
 * - dirty read (INSERTS)
 * 		+ a situation where a tx reads uncommited data
 * 		+ handled by levels: READ_COMMITTED, REPEATABLE_READ, and SERIALIZABLE
 * 
 * - non-repeatable read (UPDATES) 
 * 		+ ocurs when a tx reads the same record twice, and gets a different value each time.
 * 		+ handled by levels REPEATABLE_READ and SERIALIZABLE
 * 
 * - phantom read (DELETES)
 * 		+ occur when 2 identical queries are executed, but the number of records retrieved 
 * 		  by each are different
 * 		+ handled by level: SERIALIZABLE
 * 
 */


















