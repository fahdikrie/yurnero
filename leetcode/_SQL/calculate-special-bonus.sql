-- # Write your MySQL query statement below

-- # Write an SQL query to calculate the bonus of each employee. The bonus of an employee is 100% of their salary if the ID of the employee is an odd number and the employee name does not start with the character 'M'. The bonus of an employee is 0 otherwise.

SELECT
    e.employee_id,
    CASE
        WHEN
            e.employee_id % 2 != 0 AND name NOT LIKE 'M%'
        THEN
            e.salary
        ELSE
            0
    END as bonus
FROM
    employees e
ORDER BY
    e.employee_id;
