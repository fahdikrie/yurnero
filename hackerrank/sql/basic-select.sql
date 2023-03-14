-- 1. Revising the Select Query I
SELECT * FROM city WHERE POPULATION > 100000 AND countrycode = 'USA';

-- 2 Revising the Select Query II
SELECT name FROM city WHERE population > 120000 AND countrycode = 'USA';

-- 3. Select All SQL
SELECT * FROM city;

-- 4. Select All by ID
SELECT * FROM city WHERE id = 1661;

-- 5. Japanese Cities' Attributes
SELECT * FROM city WHERE countrycode = 'JPN';

-- 6. Japanese Cities' Names
SELECT name FROM city WHERE countrycode = 'JPN';

-- 7. Weather Observation Station 1
SELECT city, state FROM station;