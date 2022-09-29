CREATE
    DATABASE movie;

USE
    movie;

CREATE TABLE movies
(
    id         int,
    Year       int(4),
    Length     int(10),
    Title      varchar(50),
    Subject    varchar(50),
    Popularity int(5),
    Awards     varchar(3),
    PRIMARY KEY (id)
);


INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (1, 1962, 138, '8 1/2', 'Drama', 80, 'Yes');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (2, 1968, 139, '2001: A Space Odyssey', 'Science Fiction', 83, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (3, 1982, 92, '48 Hrs.', 'Action', 67, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (4, 1966, 95, 'A Big Hand for the Little Lady', 'Comedy', 12, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (5, 1992, 60, 'A Certain Sacrifice', 'Music', 24, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (6, 1962, 105, 'A Child Is Waiting', 'Drama', 60, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (7, 1985, 118, 'A Chorus Line, The Movie', 'Music', 71, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (8, 1990, 89, 'A Chorus of Disapproval', 'Comedy', 0, 'No');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (9, 1971, 138, 'A Clockwork Orange', 'Science Fiction', 83, 'Yes');
INSERT INTO movies (id, Year, Length, Title, Subject, Popularity, Awards)
VALUES (10, 1967, 100, 'A Coeur Joie, (Head Over Heels)', 'Action', 54, 'No');

-- Alle film i tabellen
SELECT *
FROM movies;

-- Title fra alle film
SELECT Title
FROM movies;

-- Alle info på film fra 1962
SELECT *
FROM movies
WHERE Year = 1962;

-- Alle info på film med en længde over 100 minutter.
SELECT *
FROM movies
WHERE Length > 100;

-- Tilterne på film fra Science Fiction genren.
SELECT Title
FROM movies
WHERE Subject = 'Science Fiction';

-- Info på alle film fra Drama genren som har modtaget en Award.
SELECT *
FROM movies
WHERE Subject = 'Drama'
  and Awards = 'Yes';

SELECT *
FROM movies
WHERE Popularity = (SELECT MAX(Popularity) FROM movies);

SELECT AVG(Popularity) AS AveragePopularity
FROM movies;
