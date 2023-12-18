-- Write a program to display numbers from 1 to 10 and their square values using for loop

DECLARE
BEGIN
FOR i IN 1..10 LOOP
DBMS_OUTPUT.PUT_LINE('NUMBER :' || i || ', Square:' || i * i);
END LOOP;
END;
/

-- OUTPUT :- 
-- Statement processed.
-- NUMBER :1, Square:1
-- NUMBER :2, Square:4
-- NUMBER :3, Square:9
-- NUMBER :4, Square:16
-- NUMBER :5, Square:25
-- NUMBER :6, Square:36
-- NUMBER :7, Square:49
-- NUMBER :8, Square:64
-- NUMBER :9, Square:81
-- NUMBER :10, Square:100
