-- 1. Population Census
SELECT
    SUM(k.population)
FROM
    city k
INNER JOIN
    country n
ON
    k.countrycode = n.code
WHERE
    n.continent = 'Asia';

-- 2 African Cities
SELECT
    k.name
FROM
    city k
INNER JOIN
    country n
ON
    k.countrycode = n.code
WHERE
    n.continent = 'Africa';

-- 3. Average Population of Each Continent
SELECT
    n.continent,
    FLOOR(AVG(k.population))
FROM
    city k
INNER JOIN
    country n
ON
    k.countrycode = n.code
GROUP BY
    n.continent;

-- 4. The Report
SELECT
    IF (g.grade <= 7, null, s.name),
    g.grade,
    s.marks
FROM
    students s
INNER JOIN
    grades g
WHERE
    s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY
    g.grade DESC,
    s.name ASC;
