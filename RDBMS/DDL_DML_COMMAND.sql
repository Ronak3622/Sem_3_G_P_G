--- TO CREATE TABLE 
CREATE TABLE test_table 
(
    student_id INT,
    student_name VARCHAR2(30),
    student_add VARCHAR2(20)
);

--- TO ADD COLUMN
ALTER TABLE test_table ADD
(
    student_rolll INT,
    student_father VARCHAR2(20)
);

--- TO MODIFY COLUMN
ALTER TABLE test_table MODIFY
(
    student_father VARCHAR2(50)
);

--- TO DROP COLUMN
ALTER TABLE test_table 
DROP COLUMN student_father;

--- TO DELETE TABLE
DROP TABLE test_table;

--- TO INSERT VALUES
INSERT INTO test_table
     VALUES (01,'Ronak','DAHOD',111,'MANUBHAI');

--- TO PRINT COLUMN
SELECT * FROM test_table;

--- TO UPDATE COLUMN 
UPDATE test_table 
    SET student_name ='Ronakkumar', student_add = 'Godhara'
    WHERE student_id = 01;

--- TO DELETE COLUMN
DELETE FROM test_table
WHERE student_id = 01;

--- TO DELETE TABLE
DELETE FROM test_table;
