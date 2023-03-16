# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE
    p1
FROM
    person p1, person p2
WHERE
    p1.email = p2.email AND
    -- Only delete if the id is greater than the other
    -- Meaning that the occurence is later in the table
    p1.id > p2.id
;
