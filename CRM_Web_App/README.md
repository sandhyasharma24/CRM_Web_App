# CRM Web Application

A Customer Relationship Management (CRM) web application developed using **Spring Boot**, **JSP**, and **MySQL**.  
The application implements complete **CRUD functionality** following the **Spring MVC architecture**.

---

## Features

- Create new customers
- View customer list
- Update existing customer details
- Delete customers
- Auto-generated customer IDs
- Server-side rendering using JSP

---

## Tech Stack

- Java 17  
- Spring Boot  
- Spring MVC  
- Spring Data JPA (Hibernate)  
- JSP & JSTL  
- MySQL  
- Maven  
- Embedded Apache Tomcat  

---

CRM_Web_App
├── src/main/java
│ └── com.sandhya.CRM_Web_App
│ ├── model
│ ├── repo
│ ├── service
│ └── web
├── src/main/webapp
│ └── WEB-INF/views
│ ├── customerInfo.jsp
│ ├── detailForm.jsp
│ └── updateInfo.jsp
├── src/main/resources
│ └── application.properties
├── pom.xml
└── README.md

----


---

## Setup & Run Instructions

### 1. Clone the repository
```bash
git clone https://github.com/sandhyasharma24/CRM_Web_App.git

---
sql
Copy code
CREATE DATABASE customer;
Update database credentials in application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/customer
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
3. Run the Application
Import the project into Eclipse

Right-click the project → Run As → Spring Boot App

4. Access the Application
bash
Copy code
http://localhost:8484/sandhya/CustomerInfo
Key Concepts Implemented
Spring MVC request flow (Controller → Service → Repository)

Two-way data binding using @ModelAttribute

CRUD operations using Spring Data JPA

JSP form handling with JSTL and Spring Form tags

MySQL integration with Hibernate

Git & GitHub version control

Future Enhancements
Input validation and error handling

Pagination and sorting

REST API implementation

UI improvement using Bootstrap

Authentication and authorization

Author
Sandhya Sharma
GitHub: https://github.com/sandhyasharma24

## Project Structure

