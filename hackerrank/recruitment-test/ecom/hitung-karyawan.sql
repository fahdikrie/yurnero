
/*
Enter your query below.
Please append a semicolon ";" at the end of the query
*/

SELECT
    CONCAT(p.name, ' ', c.name) as ''
FROM
    People p
JOIN
    Companies c
ON
    p.company_id = c.id
WHERE
    c.location_id = (
        SELECT
            c.location_id
        FROM
            Companies c
        INNER JOIN
            Locations l
        ON
            c.location_id = l.id
        GROUP BY
            c.location_id
        ORDER BY
            COUNT(c.location_id) DESC
        LIMIT 1
    )
;
