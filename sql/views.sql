/*
	Views
	
		Whenever we execute a query, the DBMS generates a result set for us
		that contains information based upon our query.
		
		Sometimes, we may want to use that result set as a base for executing
		other queries. Views are effectively just a schema object that contains
		a saved result set, and can be used as a sort of virtual "table".
		
		Manipulations (INSERT, UPDATE, DELETE) to a view can actually effect the
		original table from which the view was constructed.

*/

select e."EmployeeId", e."FirstName", e."LastName", (em."FirstName" || ' ' || em."LastName") as manager
from "Employee" e
join "Employee" em
on e."ReportsTo" = em."EmployeeId";

create view employee_and_managers as
select e."EmployeeId", e."FirstName", e."LastName", (em."FirstName" || ' ' || em."LastName") as manager
from "Employee" e
join "Employee" em
on e."ReportsTo" = em."EmployeeId";

select * from employee_and_managers
where "EmployeeId" > 5;

-- Views that do not select from a single table or view are not automatically updatable.
insert into employee_and_managers 
values (9, 'Alice', 'Anderson', 'Andrew Adams');

select * from "Employee";

insert into "Employee"
values 
(9, 'Anderson', 'Alice', 'Newbie', 1, date '1989-10-13', current_date, '123 Main Street', 'Somewhere', 'AB', 'Canada', 'T5K 2N2', '+1 (555) 555-5555', '+1 (555) 555-5556', 'aanderson@finallydone.com');

-- inserting new records into the single table associated with a view causes the view to 
-- include the new records.
select * from employee_and_managers;

select * from "Artist" order by "ArtistId" desc;

create view all_artists as
select * from "Artist";

select * from all_artists order by "ArtistId" desc;

-- manipulating a view that selects from a single table will result in the 
-- original table being changed as well
insert into all_artists values (276, 'Whitechapel');


-- manipulating the table associate with a view, will cause that view to be updated
insert into "Artist" values (277, 'Counting Crows');
