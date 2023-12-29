# Write your MySQL query statement below
SELECT
    name,
    bonus
FROM employee AS e
LEFT JOIN bonus AS b ON e.empId = b.empId

WHERE bonus < 1000
OR bonus IS NULL