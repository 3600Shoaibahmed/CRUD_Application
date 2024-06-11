CRUD Java Application
This is a simple CRUD (Create, Read, Update, Delete) application built using Java Spring Boot, JPA (Java Persistence API), MySQL, and Postman for API testing.


#Features
Create, Read, Update, and Delete operations on a MySQL database
RESTful API endpoints for managing resources
Integration with Spring Data JPA for database operations
Easy API testing with Postman


#Prerequisites
Java 8 or higher
Maven
MySQL
Postman


#Installation
1)Clone the repository:

Copy code
git clone https://github.com/yourusername/crud-java-application.git
cd crud-java-application


2)Install the dependencies:

Copy code:

mvn clean install


#Configuration

Create a MySQL database:
sql
Copy code
CREATE DATABASE crud_db;



#Update the application.properties file located in src/main/resources with your MySQL database credentials:
properties
Copy code:

spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


#Running the Application

1) Start the application:

Copy code
mvn spring-boot:run


The application will start running at http://localhost:8080.

#API Endpoints
The following endpoints are available for managing resources:

Create a resource

POST /api/resources
Request Body: JSON representation of the resource
Retrieve all resources

GET /api/resources
Retrieve a single resource by ID

GET /api/resources/{id}
Update a resource

PUT /api/resources/{id}
Request Body: JSON representation of the updated resource
Delete a resource

DELETE /api/resources/{id}
Testing with Postman
Open Postman and create a new collection for the CRUD API.
Add requests to the collection for each of the endpoints listed above.
Use the request bodies provided in the API documentation to test each endpoint.
Database
The application uses MySQL for data storage. Make sure you have MySQL installed and running. The database schema will be automatically created and updated based on the JPA entities defined in the application.
