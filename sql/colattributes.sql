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


-- print id's which are not in the order table means the customer who never did a single order

# Write your MySQL query statement below

        SELECT NAME AS 'CUSTOMERS' FROM CUSTOMERS
        WHERE ID NOT (SELECT CUSTOMERID FROM ORDERS);



-- https://leetcode.com/problems/calculate-special-bonus/
-- - odd number and Not like used

# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT employee_id,if(employee_id % 2 != 0 and name NOT LIKE'M%', salary,0) as 'bonus' FROM Employees ;
   %m = starting with "m"
   m% = ending with "m"
-- The following SQL statement selects all customers with a CustomerName that have "r" in the second position:
SELECT * FROM Customers
WHERE CustomerName LIKE '_r%';

-- https://leetcode.com/problems/patients-with-a-condition/submissions/
NO CHARACTERS AT LEFT "% AMISHA";
SELECT patient_id, patient_name,conditions from Patients where conditions  LIKE '% DIAB1%' or conditions LIKE 'DIAB1%';
   # SADIAB100
   




-- how to swap data in a same column

CASE
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    WHEN conditionN THEN resultN
    ELSE result
END;
-- SWAP

# Write your MySQL query statement below
UPDATE Salary SET sex  =
    CASE
    when sex = "m" THEN "f"
    when sex = "f" THEN "m"
    End
