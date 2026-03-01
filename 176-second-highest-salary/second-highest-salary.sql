/* Write your PL/SQL query statement below */
SELECT max(salary) as SecondHighestSalary
FROM Employee
where salary <(select max(salary)
from Employee);