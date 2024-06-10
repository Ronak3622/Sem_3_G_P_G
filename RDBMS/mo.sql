CREATE TABLE product
(
    product_id INT,
    product_name VARCHAR2(30),
    product_price INT
);
INSERT INTO product VALUES(01,'Computer',20000);
INSERT INTO product VALUES(02,'Laptop',40000);
INSERT INTO product VALUES(03,'Mouse',500);
INSERT INTO product VALUES(04,'Keyboard',1000);
INSERT INTO product VALUES(05,'Hard disk',4000);

SELECT * FROM product;

SELECT product_id,product_name,product_price "old price",(product_price + product_price * 0.1)"new price" from product;
