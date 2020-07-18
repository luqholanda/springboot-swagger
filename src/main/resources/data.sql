DROP TABLE IF EXISTS example;
 
CREATE TABLE example (
  id INT AUTO_INCREMENT PRIMARY KEY,
  content VARCHAR(250) NOT NULL,
  insert_date date NOT NULL
);
 
INSERT INTO example (content, insert_date) VALUES ('Example 01', CURRENT_DATE);
INSERT INTO example (content, insert_date) VALUES ('Example 02', CURRENT_DATE);
INSERT INTO example (content, insert_date) VALUES ('Example 03', CURRENT_DATE);