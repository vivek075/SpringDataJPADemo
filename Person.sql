CREATE TABLE IF NOT EXISTS person (
    id SERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    age INTEGER,
    club VARCHAR(30) NOT NULL,
    nationality VARCHAR(30) NOT NULL
);

INSERT INTO person(name, age, club, nationality) VALUES ('Vivek Singh', 31, 'Delhi', 'India');
INSERT INTO person(name, age, club, nationality) VALUES ('Manoj', 24, 'Mumbai', 'US');
INSERT INTO person(name, age, club, nationality) VALUES ('Jacky', 23, 'Pune', 'UK');
INSERT INTO person(name, age, club, nationality) VALUES ('Mahesh', 34, 'Punjab', 'India');

