# University Event Management System

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

    1.1 Student Controller

        - @PostMapping("student") : To add new info of new student in repository

        - @PutMapping("student/{id}/{department}") :To update department of existing student

        - @DeleteMapping("students") : To delete list of present in the repository

        - @GetMapping("students") : To display list of students present in the repository

        - @GetMapping("student/{id}") : To display info of student with given id

    1.2 Event Controller

        - @PostMapping("event") : To a event in the repository

        - @PutMapping("event/{id}/{location}") : To update location of a existing event.

        - @DeleteMapping("event/{id}") : To delete event present in the repository

        - @GetMapping("eventAfterDate/{date}") : To display list of events occuring after given date

2.  Services

    2.1 Student Service

        - getStudent(Integer id) : To display info of student with given id

        - deleteAllStudents() : To delete list of present in the repository

        - updateDepartment(Integer id, Department department) : To update department of existing student

        - addStudents(Student student) : To add new info of student in repository

    2.2 Event Service

        - addEvent(Event event) : To a event in the repository

        - updateEventLocation(Integer id, String location) : To update location of a existing event.

        - deleteEvent(Integer id) : To delete event present in the repository

        - getEventAfterDate(LocalDate date) : To display list of events occuring after given date

3.  Repository

        - StudentRepo

        - EventRepo

4.  Database Design

    4.1 Student Model:

        -StudentId
        -first name
        -last name
        -age
        -department

    4.2 Event Model

        -eventId
        -eventName
        -locationOfEvent
        -date
        -startTime
        -endTime

## Data Structure Used in Project

     CrudRepository has been used as primay datastructure

## Project Summary

    The University Event Management System is a comprehensive software solution designed to facilitate the management and administration of university within system. Its primary objective is to streamline Event and Student-related processes. The system provides a centralized platform that enables University administrators to create, read, edit, and delete student and event accounts.
