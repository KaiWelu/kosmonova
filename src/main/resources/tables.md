# Kosmonova DB - Tables
This is the documentation for the tables of the database.

## employees

| data          | type           |
|---------------|----------------|
| employee_id   | int, unique    |
| first_name    | string         |
| last_name     | string         |
| email         | string, unique |
| hire_date     | data           |
| salary        | int            |
| department_id | int, foreign   |




