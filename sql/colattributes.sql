SELECT *
FROM CITY;

-- id 

Query all columns for a city in CITY with the ID 1661.

SELECT *
FROM CITY WHERE ID = 1661;

Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.

SELECT *
FROM CITY WHERE COUNTRYCODE = 'JPN';


Query a list of CITY and STATE from the STATION table.
/*
Enter your query here.
*/
SELECT CITY ,STATE
FROM STATION ;

Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.

SELECT DISTINCT(CITY) FROM STATION WHERE (ID%2)=0 ;
