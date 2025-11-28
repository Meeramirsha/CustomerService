Customer Service — Spring Boot

Simple Customer Service microservice built with Spring Boot, JPA and MySQL.
This project provides basic customer registration and retrieval APIs.

Project structure (important paths)
CUSTOMER_SERVICE/
  customer-service/            <- Spring Boot module
    src/main/java/...          <- Java source (controller, service, entity, repository)
    src/main/resources/        <- config (application.properties)
    pom.xml

Tech stack

Java (JDK 17+ recommended)
Spring Boot (Maven)
Spring Data JPA (Hibernate)
MySQL (database)
Maven (build tool)

Prerequisites

Java 17+ installed and JAVA_HOME set
Maven 3.6+
MySQL server running (or update datasource to your DB)
An IDE (IntelliJ IDEA / VS Code) or command line
Configuration

Edit src/main/resources/application.properties (defaults in project):

spring.application.name=customer service application
spring.datasource.url=jdbc:mysql://localhost:3306/bank_management_system
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8081


Create the database before running:

CREATE DATABASE bank_management_system;


If you prefer H2 for quick testing, replace datasource properties with H2 config, or set up Docker/MySQL and update credentials.

Build & Run

From the customer-service module root (where pom.xml is located):

# build
mvn clean package

# run (option A)
mvn spring-boot:run

# or run the jar (option B)
java -jar target/customer-service-0.0.1-SNAPSHOT.jar


The application starts on port 8081 by default.

Available APIs

Base path: http://localhost:8081/api/customer

Register customer

Endpoint: POST /register

Request Body (JSON):

{
  "name": "Alice",
  "email": "alice@example.com",
  "address": "123 Main St",
  "password": "secret"
}

Response (CustomerResponse)

{
  "customerId": 1,
  "name": "Alice",
  "email": "alice@example.com",
  "address": "123 Main St",
  "password": "secret"
}


Get customer by id

Endpoint: GET /getbyid/{id}
Example: GET /getbyid/1

Response: CustomerResponse object for the given id.

Data model (Customer entity fields)

customerId (Long) — Auto-generated
name (String)
email (String)
address (String)
password (String)



How to push to GitHub (quick steps)
# from repository root (where README.md will live)
git init
git add .
git commit -m "Initial commit - Customer Service Spring Boot"
# create remote repo via GitHub UI, then:
git remote add origin git@github.com:<your-username>/<repo-name>.git
git branch -M main
git push -u origin main