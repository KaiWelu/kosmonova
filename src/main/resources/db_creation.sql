-- create the database
CREATE DATABASE kosmonova_db
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- create the department table
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    continent VARCHAR(100) NOT NULL
);

-- create agency table
CREATE TABLE agencies (
    agency_id INT PRIMARY KEY NOT NULL,
    name VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    continent VARCHAR(100) NOT NULL
);

-- create sites table
CREATE TABLE sites (
    site_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    agency_id INT NOT NULL,
    country VARCHAR(100) NOT NULL,
    continent VARCHAR(100) NOT NULL,
    longitude FLOAT NOT NULL,
    latitude FLOAT NOT NULL,
    FOREIGN KEY (agency_id) REFERENCES agencies(agency_id)
);

-- create rockets table

CREATE TABLE rockets (
    rocket_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    agency_id INT NOT NULL,
    launch_cost INT NOT NULL,
    payload_leo INT NOT NULL,
    FOREIGN KEY (agency_id) REFERENCES agencies(agency_id)
);

-- create missions table
CREATE TABLE missions (
    mission_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    launch_date DATE NOT NULL,
    launch_site INT NOT NULL,
    agency_id INT NOT NULL,
    rocket_id INT NOT NULL,
    FOREIGN KEY (launch_site) REFERENCES sites(site_id),
    FOREIGN KEY (agency_id) REFERENCES agencies(agency_id),
    FOREIGN KEY (rocket_id) REFERENCES rockets(rocket_id)
);
-- create kosmonauts table
CREATE TABLE kosmonauts (
    kosmonaut_id INT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    agency_id INT NOT NULL,
    mission_id INT,
    FOREIGN KEY (agency_id) REFERENCES agencies(agency_id),
    FOREIGN KEY (mission_id) REFERENCES missions(mission_id)
);

-- create employees table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    hire_date DATE NOT NULL,
    salary INT NOT NULL,
    department_id INT NOT NULL,
    mission_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (mission_id) REFERENCES missions(mission_id)
);