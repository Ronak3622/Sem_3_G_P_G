-- Write a program for addition of two number.
DECLARE
num1 NUMBER := 10;
num2 NUMBER := 30;
total NUMBER;
BEGIN
total := num1 + num2;
DBMS_OUTPUT.PUT_LINE('The sum of ' || num1 || ' and ' || num2 || ' is: ' || total);
END;
/

-- Output :- 
-- Statement processed.
-- The sum of 10 and 30 is: 40
