# Kosmonova DB - Tables
This is the documentation for the tables of the database.

## employees
This tables stores repository for all employees except kosmonauts

| repository          | type           |
|---------------|----------------|
| employee_id   | int, primary   |
| first_name    | string         |
| last_name     | string         |
| email         | string, unique |
| hire_date     | repository           |
| salary        | int            |
| department_id | int, foreign   |
| mission_id    | int_foreign    |

## departments
This table stores everything related to the different departments

| repository          | type         |
|---------------|--------------|
| department_id | int, primary |
| name          | string       |
| city          | string       |
| country       | string       |
| continent     | string       |

## agencies
This tables stores information about worldwide space agencies

| repository      | type         |
|-----------|--------------|
| agency_id | int, primary |
| name      | string       |
| country   | string       |
| continent | string       |


## rockets
This table stores information about different launch vehicles

| repository        | type         |
|-------------|--------------|
| rocket_id   | int, primary |
| name        | string       |
| agency_id   | int, foreign |
| launch_cost | int          |
| payload_leo | int          |


## launch sites
This table stores information about the worldwide launch sites

| repository      | type         |
|-----------|--------------|
| site_id   | int, primary |
| name      | string       |
| agency_id | int, foreign |
| country   | string       |
| continent | string       |
| longitude | float        |
| latitude  | float        |


## missions
This stores repository about ongoing projects and their launches

| repository        | type         |
|-------------|--------------|
| mission_id  | int, primary |
| name        | string       |
| launch_date | date         |
| launch_site | int, foreign |
| agency_id   | int, foreign |
| rocket_id   | int, foreign |


## kosmonauts
This table stores repository about the kosmonauts and their missions

| repository         | type         |
|--------------|--------------|
| kosmonaut_id | int, primary |
| first_name   | string       |
| last_name    | string       |
| agency_id    | int, foreign |
| mission_id   | int, foreign |







