USE
movies;
CREATE TABLE mov
(
    Id         int AUTO_INCREMENT,
    Year       int NOT NULL,
    Length     int NOT NULL,
    Title      VARCHAR(100),
    Subject    VARCHAR(100),
    Popularity VARCHAR(100),
    Awards     VARCHAR(4),
    primary key (Id)

);