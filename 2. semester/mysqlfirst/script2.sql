CREATE DATABASE kea;
USE kea;

CREATE TABLE student
(
    id     int AUTO_INCREMENT,
    name   VARCHAR(50) NOT NULL,
    email  VARCHAR(50) UNIQUE,
    GENDER binary,
    PRIMARY KEY (id)
);

INSERT INTO student(name, email, gender)
VALUES ('Claus', 'clbo@kea.dk', 1);
INSERT INTO student(name, email, gender)
VALUES ('Anna', 'anna@kea.dk', 0);
INSERT INTO student(name, email, gender)
VALUES ('Pia', 'pia@kea.dk', 0);
INSERT INTO student(name, email, gender)
VALUES ('', 'xxx@kea.dk', 0);
INSERT INTO student(name, email, gender)
VALUES (NULL, 'yyy@kea.dk', 0);
INSERT INTO student(name, email, gender)
VALUES ('Søren', 'åååå@kea.dk', 0);

SELECT *
FROM student;

-- Update
UPDATE student
SET name='Henning',
    email='henn@kea.dk'
WHERE id = 1;

-- Delete
DELETE
FROM student
WHERE id = 1;

-- AND OR NOT
SELECT *
FROM student
WHERE GENDER = 0
  AND name = 'PIA';
SELECT *
FROM student
WHERE GENDER = 0
   OR name = 'CLAUS';
SELECT *
FROM student
WHERE NOT GENDER = 0;

-- LIKE
SELECT *
FROM student
WHERE name LIKE '%a%';

-- ORDER BY
SELECT *
FROM student
ORDER BY email asc;

SELECT COUNT(*) as NumberOfStudetAtKea FROM student;
SELECT AVG(gender) as GenderAVG FROM student;

-- IN

SELECT * FROM student WHERE Gender IN (0, 2, 5, 6);
SELECT * FROM student WHERE name IN ('Claus', 'Anna');
SELECT * FROM student WHERE name IN (SELECT name FROM student WHERE name LIKE '%a');
                                    -- ('Pia', 'Anna')