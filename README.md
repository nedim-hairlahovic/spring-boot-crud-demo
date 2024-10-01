# Spring Boot CRUD Module Demo

This demo application demonstrates how to integrate and use the [`spring-boot-crud-module`](https://github.com/nedim-hairlahovic/spring-boot-crud-module) for generic CRUD operations in a Spring Boot project.

## Features

- CRUD functionality for managing `Post` entities.
- Pagination and filtering support.
- Example implementation of the reusable CRUD module.

## Requirements

- Java 17+
- Maven 3+
- Spring Boot 3.x

## Getting Started

### 1. Clone the Repository and Initialize the Submodule

```bash
git clone https://github.com/nedim-hairlahovic/spring-boot-crud-demo.git
cd spring-boot-crud-demo
git submodule update --init
```

### 2. Build and Run the Application
```bash
mvn spring-boot:run
```

### 3. Access the H2 Database Console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`


### 4. Available Endpoints
The application exposes RESTful endpoints to manage `Post` entities:

- **GET** /posts - Retrieve all posts.
- **GET** /posts/{id} - Retrieve a post by ID.
- **POST** /posts - Create a new post.
- **PUT** /posts/{id} - Update an existing post.
- **DELETE** /posts/{id} - Delete a post by ID.
