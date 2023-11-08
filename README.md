# springboot_todo
 Title:ToDo CRUD Application

 TABLE OF CONTENTS:
 ------------------
     Introduction
     Technologies Used
     Features
     API Endpoints
     Database Schema
     Challenges Faced
     Steps used to build this application
     
 Introduction:
 -------------
    This is a simple ToDo application that allows users to create, read, update, and delete tasks. 
    The application is built using Spring for the backend and Angular for the frontend.
 Technologies Used:
 ------------------
    Spring Boot
    Angular
    MySQL Database
    
 Features:
 ---------
    Create new details with respective contents.
    View a list of all details.
    Update the values of details.
    Delete detailss.

 API Endpoints:
 --------------
    The backend API endpoints are accessible at http://localhost:8080/api/todos.
    You can use tools like Postman to interact with the API.

 Database Schema:
 ----------------
    This application uses a MySQL database with a single table named todo. The schema for the table is as follows:
    CREATE DATABASE jdbc_todo;
    CREATE TABLE todo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(50)
    );
    
 Challenges Faced:
 -----------------
    During the development of this project, I encountered several challenges that are worth mentioning:
    1. Database Configuration: 
         Setting up and configuring the MySQL database with Spring Boot can be tricky, especially if you are new to these technologies.
         We had to ensure the database connection was established correctly and that the data models matched the database schema.
    2.Version Compatibility: 
         Ensuring that different Spring modules and libraries are compatible with each other.
         Mismatched versions can lead to unexpected issues.
         
 Steps used to build this application:
 -------------------------------------
    👉 Added the required maven dependencies (SQL, Servlet, JSTL, Spring).
    👉 Connected Database for storing and accessing data.
    👉 Used MVC (Model, View, Controller) Architecture.
    👉 Used annotations like @Controller, @RequestMapping, @Autowired.
    👉 Used Data Access Object (dao) for accessing Database using queries.
