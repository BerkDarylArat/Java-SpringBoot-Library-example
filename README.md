# Java-SpringBoot-Library-example

# Project: Library application created with Java Spring Boot and PostgreSQL as database.

This Library project is created with Java Spring Boot that provides a simple and efficient way to manage books, librarians, clients and orders using a PostgreSQL database.
<hr />

## Table of Contents

- [Usage](#usage)
- [Configuration](#configuration)
- [Features](#features)
- [License](#license)

<hr />

<h2>Usage</h2>

Once the application is running, you can access the library management system through your web browser at http://localhost:9090. Use the provided APIs to perform CRUD operations.

<h2>Configuration</h2>

The application uses a PostgreSQL database for data storage. To configure the database connection, edit the application.properties file and provide your PostgreSQL database details.

<h2>Properties</h2>

<code>spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabasename
spring.datasource.username = yourusername
spring.datasource.password = yourpassword
server.port = 9090</code>

 <h2>Features</h2>
<ul>
  <li>
    Add, retrieve, update, and delete books,librarians,clients and orders details in the library.
  </li>
  <li>
    RESTful API endpoints for integrating with other applications.
  </li>
</ul>

<h2>License</h2>

This project is licensed under the MIT License - see the LICENSE file for details.
    
