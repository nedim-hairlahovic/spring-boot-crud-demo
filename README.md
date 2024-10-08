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

### 3. Running with Docker

You can also run the Spring Boot CRUD Module Demo using Docker. Follow these steps:

- **Build the Docker Image**
  
Make sure you have Docker installed on your system. First, build the Docker image for the application:
```bash
docker build -t crud-demo-app .
```

- **Run the Application with Docker**
  
Once the image is built, you can run the application using Docker:
```bash
docker run -d --name crud-demo-app -p 8080:8080 crud-demo-app
```

This will start the application in a Docker container, and you can access it at http://localhost:8080.

### 4. Access the H2 Database Console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`


### 5. Available Endpoints
The application exposes RESTful endpoints to manage `Post` entities:

- **GET** /posts - Retrieve all posts.
- **GET** /posts/{id} - Retrieve a post by ID.
- **POST** /posts - Create a new post.
- **PUT** /posts/{id} - Update an existing post.
- **DELETE** /posts/{id} - Delete a post by ID.


