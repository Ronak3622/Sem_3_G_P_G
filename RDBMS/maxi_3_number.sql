-- Write a program to display maximum number out of three given numbers.
DECLARE
num1 NUMBER := 20;
num2 NUMBER := 30;
num3 NUMBER := 40;
maximum NUMBER ;
BEGIN
IF num1 >= num2 and num2 >= num3 then
maximum := num1;
ELSIF num2 >= num1 and num1 >= num3 then 
maximum := num2;
Else
maximum := num3;
END if;
DBMS_output.put_line('MAximum NUmber is : ' || maximum);
end;
/

-- OUTPUT :-
-- Statement processed.
-- MAximum NUmber is : 40
