-- Write a program to display numbers from 1 to 10 and their square values using while loop
DECLARE
i number := 1;
BEGIN
WHILE i <= 10
LOOP
DBMS_OUTPUT.PUT_LINE('Number: ' || 1 || ', Square: ' || i * i );
i := i + 1 ;
End Loop;
end;
/

-- OUTPUT :- 
-- Statement processed.
-- Number: 1, Square: 1
-- Number: 1, Square: 4
-- Number: 1, Square: 9
-- Number: 1, Square: 16
-- Number: 1, Square: 25
-- Number: 1, Square: 36
-- Number: 1, Square: 49
-- Number: 1, Square: 64
-- Number: 1, Square: 81
-- Number: 1, Square: 100
