
-- https://www.hackerrank.com/challenges/weather-observation-station-6/problem

SELECT DISTINCT CITY FROM STATION WHERE UPPER(SUBSTR(CITY,1,1 )) in ('a','e','i','o','u');

-- or
-LEFT
SELECT DISTINCT CITY FROM STATION WHERE LEFT(CITY,1)in ('a','e','i','o','u')


-- https://www.hackerrank.com/challenges/weather-observation-station-7/problem?isFullScreen=false


-in
-LENGTH
-SUBSTR
-WHERE
-DISTINCT
SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY,LENGTH(CITY),1)) in ('a','e','i','o','u');
-- or
-RIGHT
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1)in ('a','e','i','o','u')



-NOT IN
SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY,1,1)) not in ('a','e','i','o','u');