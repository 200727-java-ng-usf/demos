DROP TABLE project_teams;
DROP TABLE projects;
DROP TABLE team_members;
DROP TABLE teams;
DROP TABLE locations;
DROP TABLE employees;

-- Create relations

CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR,
    last_name VARCHAR,
    salary NUMERIC(10,2)
);

CREATE TABLE locations (
    id SERIAL PRIMARY KEY,
    manager_id INTEGER REFERENCES employees(id),
    street VARCHAR,
    city VARCHAR,
    "state" VARCHAR,
    zip INTEGER
);

CREATE TABLE teams (
    id SERIAL PRIMARY KEY,
    location_id INTEGER REFERENCES locations(id),
    team_lead_id INTEGER REFERENCES employees(id)
);

CREATE TABLE team_members (
    team_id INTEGER REFERENCES teams(id),
    team_member_id INTEGER REFERENCES employees(id)
);

CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    project_name VARCHAR,
    project_budget NUMERIC(10,2)
);

CREATE TABLE project_teams (
    project_id INTEGER REFERENCES projects(id),
    team_id INTEGER REFERENCES teams(id)
);

-------------------------------------------------

-- Employees
INSERT INTO employees (first_name, last_name, salary) 
VALUES ('Jackie', 'Schmidt', 100000.00)
, ('Carlos', 'Sanches', 79000.00)
, ('Hans', 'Gruber', 250000.00)
, ('Filipe', 'Cruz', 98000.00)
, ('Crystal', 'Gem', 88000.00)
, ('Lily', 'Anderson', 60000.00)
, ('Gene', 'Wilder', 177000.00)
, ('Robinson', 'Crusoe', 30000.00)
, ('Harriett', 'Tubman', 199000.00)
, ('Willem', 'Dafoe', 101000.00);

-- Locations
INSERT INTO locations (manager_id, street, city, "state", zip)
VALUES (7, '100 Business St', 'Seattle', 'Washington', '98102')
, (9, '660 Conduction Ave', 'New York', 'New York', '66502');

-- Teams
INSERT INTO teams (location_id, team_lead_id)
VALUES (1, 1)
, (1, 2)
, (2, 3);

-- Team Members
INSERT INTO team_members (team_id, team_member_id)
VALUES (1, 1)
, (1, 4)
, (1, 5)
, (2, 2)
, (2, 6)
, (2, 7)
, (3, 3)
, (3, 8)
, (3, 9)
, (3, 10);

-- Projects
INSERT INTO projects (project_name, project_budget)
VALUES ('Operation Big Data', 500000.00)
, ('Data Warehouse', 200000.00)
, ('Make a Product', 1000000.00);

-- Project Teams
INSERT INTO project_teams (project_id, team_id)
VALUES (1, 1)
, (1, 2)
, (2, 2)
, (3, 1)
, (3, 2)
, (3, 3)
