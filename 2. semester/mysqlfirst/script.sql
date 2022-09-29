CREATE DATABASE school;

USE school;

CREATE TABLE student
(
    id   int,
    name varchar(50),
    cpr  varchar(11),
    PRIMARY KEY (id)
);

DROP TABLE student;

DROP DATABASE school;

TRUNCATE TABLE student;

-- DML
-- Inserte data i tabellen

INSERT INTO student (id, name, cpr)
VALUES (1, 'Claus', '121212-1212');
INSERT INTO student (id, name, cpr)
VALUES (2, 'Anna', '123456-9999');
INSERT INTO student (id, name, cpr)
VALUES (3, 'Tom', '121212-1212');
INSERT INTO student (id, name, cpr)
VALUES (4, 'Bithe', '121212-1212');

-- SELECT data fra tabel

SELECT *
FROM student;
SELECT name
FROM student;
SELECT name, cpr
FROM student;

SELECT *
FROM student
WHERE id = 1;
DELETE
FROM student
WHERE id = 1;