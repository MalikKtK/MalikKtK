CREATE
    DATABASE nasa;

USE
    nasa;

CREATE TABLE roverapi
(
    id         int,
    sol        int(4),
    camera     varchar(50),
    img_src    varchar(200),
    earth_date date,
    rover      varchar(50),
    PRIMARY KEY (id)
);


INSERT INTO roverapi (id, sol, camera, img_src, earth_Date, rover)
VALUES (102693, 1000, 'FHAS',
        'http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG',
        '2015-05-30', 'Curiosity');
INSERT INTO roverapi (id, sol, camera, img_src, earth_Date, rover)
VALUES (102694, 1000, 'FHAS',
        'http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FRB_486265257EDR_F0481570FHAZ00323M_.JPG',
        '2015-05-30', 'Curiosity');
INSERT INTO roverapi (id, sol, camera, img_src, earth_Date, rover)
VALUES (102850, 1000, 'RHAZ',
        'http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/rcam/RLB_486265291EDR_F0481570RHAZ00323M_.JPG',
        '2015-05-30', 'Curiosity');
INSERT INTO roverapi (id, sol, camera, img_src, earth_Date, rover)
VALUES (102851, 1000, 'RHAZ',
        'http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/rcam/RRB_486265291EDR_F0481570RHAZ00323M_.JPG',
        '2015-05-30', 'Curiosity');


-- url´en til billederne taget af kameraet "FHAS"
SELECT img_src
FROM roverapi
WHERE camera = 'FHAS';

-- Alt info om billedet med id 102694
SELECT *
FROM roverapi
WHERE id = 102694;

-- Alt info om alle billeder.
SELECT *
FROM roverapi;

