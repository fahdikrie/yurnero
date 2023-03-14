-- 1. The PADS
SELECT
    CONCAT(name, '(', LEFT(occupation, 1), ')') as Person
FROM
    occupations

UNION ALL

SELECT
    CONCAT(
        'There are a total of ',
        COUNT(occupation), ' ',
        LOWER(occupation), 's.'
    )
FROM
    occupations
GROUP BY
    occupation
ORDER BY
    Person;
