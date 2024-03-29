CREATE database homework_29_280323;

DROP table if EXISTS persons;

CREATE TABLE public.persons
(
    personId         bigint primary key generated by default as identity,
    firstName        varchar(255),
    lastName         varchar(255),
    dateOfBirth      date,
    salary           decimal,
    registrationDate timestamp with time zone
);

INSERT INTO persons(firstName, lastName, dateOfBirth, salary, registrationDate)
values ('Lina', 'Kostenko', '1930-02-03', 20000, '2004-10-19 10:23:54 GMT'),
       ('Lesya', 'Ukrainka', '1971-03-25', 19000.15, '2000-11-21 10:23:54 GMT'),
       ('Susana', 'Jamala', '1983-04-16', 15300, '2022-10-19 10:23:54 GMT'),
       ('Yana', 'Shemaeva', '1995-05-20', 18000.50, '2008-10-19 10:23:54 GMT');

CREATE TABLE public.students
(
    studentId  bigint PRIMARY KEY generated by default as identity,
    faculty    varchar(255),
    course     int,
    personId   bigint,
    university varchar(255),
    foreign key (personId) references persons (personId)
);
ALTER TABLE students
    ADD column budget boolean;

INSERT INTO students(faculty, course, personId, university, budget)
values ('economy', 4, 1, 'NUKMA', true),
       ('management', 2, 3, 'DUEP', false),
       ('IT technologies', 3, 2, 'DNU', true),
       ('design', 1, 4, 'TSNU', false);