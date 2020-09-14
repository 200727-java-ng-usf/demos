-- PG-PL/SQL = PostGreSQL Procedural Language extension of SQL
-- PL/pgSQL = Procedural Language extension of PostGreSQL 
-- PL/SQL = Procedural Language extension of SQL

-- NOT A SUBLANGUAGE OF SQL; IT IS AN EXTENSION

-- Stored Functions


-- Syntax breakdown:

-- CREATE [OR REPLACE] FUNCTION [name] ([params])
-- RETURNS [type]
-- AS '
--		BEGIN
--			[logic]
--		END
-- '
-- LANGUAGE PLPGSQL;

-- creates, but does not execute, a multiplication function
CREATE OR REPLACE FUNCTION multiply(x NUMERIC, y NUMERIC) 
RETURNS NUMERIC
AS '

	BEGIN
		return x * y;
	END

' LANGUAGE PLPGSQL;

-- executing our stored function
select multiply(5, 4);

-- casing is not important in SQL or PL/SQL
create or replace function multiply(x numeric, y numeric, z numeric)
returns numeric 
as '
	begin
		return $1 * $2 * $3; -- another way to access params within a function
	end
' language plpgsql;

select multiply(3, 3, 3);



-- use dollar quotes ($$) to wrap up logic for plpgsql functions/procedures
create or replace function get_last_track() 
returns text 
as $$

	declare 
		last_id integer;
		track_name text;
		retrieved_result text;
		
	begin 
		
		select max("TrackId")
		into last_id
		from "Track";
	
		select "Name"
		into track_name
		from "Track"
		where "TrackId" = last_id;
	
		-- assignment = walrus operator    :=
		retrieved_result := last_id || ' - ' || track_name;
	
		return retrieved_result;
		
	end

$$ language plpgsql;

select get_last_track();

select *
from "Track" t
order by "TrackId" desc;

/*
 * There are 3 different kinds of parameters that can be passed to stored
 * functions and procedures.
 * 
 * 	- IN param: input value; read, but it is not changed or returned by the function/procedure
 *  - OUT param: output value; not taken in or read within the function, but will be changed and returned
 *  - INOUT param: both input and output value; the value is taken in and read, changed, and returned
 */

create table temp_table (
	track_id int,
	track_name text
);

select * from temp_table;

-- anonymous PL/SQL statement (not stored in DBMS memory)
-- always return void
do $$

	declare 
		last_id integer;
		track_name text;
		retrieved_result text;
		
	begin 
		
		select max("TrackId")
		into last_id
		from "Track";
	
		select "Name"
		into track_name
		from "Track"
		where "TrackId" = last_id;
	
		-- assignment = walrus operator    :=
		retrieved_result := last_id || ' - ' || track_name;
	
		insert into temp_table values (last_id, track_name);
		
	end

$$ language plpgsql;

-- Stored Procedures (do not have a declared return type, effectively void; to invoke use the CALL keyword)
create or replace procedure insert_track_into_temp_table(id integer, name text) 
as $$

	begin 
		insert into temp_table values (id, name);
	end

$$ language plpgsql;

call insert_track_into_temp_table(78923, 'Never Gonna Give You Up');

select * from temp_table;

-- use JDBC's CallableStatement interface to invoke stored procedures and functions
-- since it extends PreparedStatement, it also support parameterized queries.

/*
 * Triggers
 * 
 * 		Procedural code that is automatically executed in response to certain events
 * 		on an associated table or view in a DB.
 * 
 * Syntax breakdown:
 * 
 * 	create trigger [name]
 *  [before|after|instead of] [insert|update|delete] on [table]
 *  for each [row|statement]
 *  execute function [function-name|procedure-name]
 */

create table colors(
	id integer primary key,
	color text
);

insert into colors 
values
	(1, 'red'),
	(2, 'orange'),
	(3, 'yellow'),
	(4, 'green'),
	(5, 'blue'),
	(6, 'violet');

select * from colors;

-- tg_op = trigger operations, holds info about the trigger being executed
-- new = keyword that contains information about the new statement being executed
create or replace function no_more_blues() 
returns trigger
as $$

	begin 
		
		if (new.color = 'blue') then
			return null; -- cancels the execution of the original statement
		end if;
	
		return new; -- return to the trigger without halting the original statement
		
	end

$$ language plpgsql;

-- to drop a trigger you must specify its associated table
drop trigger no_blues on colors;

-- create a trigger that will execute the previous declared function
-- BEFORE an insert or update statement is executed on the colors table
create trigger no_blues
before insert or update on colors
for each row 
execute function no_more_blues();

select * from colors;
delete from colors where id >= 7;

insert into colors values (7, 'fuschia');
update colors set color = 'blue' where id = 7;

insert into colors values (8, 'blue');

