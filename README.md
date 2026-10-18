Employee Management System (Hibernate ORM)

A Java-based Employee Management application using Hibernate ORM and HQL (Hibernate Query Language) for database operations. This project demonstrates CRUD (Create, Read, Update, Delete) operations and custom search queries on employee records.

📌 Features

Create & Save Records: Add single or multiple employee details to the database.

Read & Search Operations:

Find an employee by ID.

Search employees by Name or Designation.

Filter employees by exact Salary or within a specific Salary Range.

Authentication/Verification: Verify employee identity using Email and Password using HQL parameters.

Update Records: Update existing employee details using Hibernate's saveOrUpdate functionality.

Delete Records: Remove employee records by ID.

🛠️ Tech Stack & Prerequisites

Language: Java (JDK 8 or higher)

Framework: Hibernate ORM

Query Language: HQL (Hibernate Query Language) / JPA Criteria

Database: Any SQL Database supported by Hibernate (e.g., MySQL, PostgreSQL, Oracle)

Build Tool: Maven / Gradle (or raw JAR dependencies for Hibernate)

📂 Project Structure

src/
└── org/jsp/emp/
    ├── Employee.java                         # Entity / POJO Model Class
    ├── addEmployee.java                      # Class to insert initial records
    ├── UpdateEmployee.java                   # Class to update employee data
    ├── DeleteEmployee.java                   # Class to delete an employee by ID
    ├── FindEmployeeById.java                 # Search employee by ID
    ├── FindEmployeeByName.java               # Search employee by Name (HQL)
    ├── FindEmployeeByDesignation.java         # Search employee by Designation (HQL)
    ├── FindEmployeeBySalary.java             # Search employee by exact Salary (HQL)
    ├── FindEmployeeBetweenSalaryRange.java   # Filter employees within salary limits (HQL)
    └── VerifyEmployeeWithEmailAndPassword.java # Authenticate employee by email & password


⚙️ Configuration Setup

Ensure you have a hibernate.cfg.xml file configured in your src/main/resources or src folder with database connection parameters.

Example hibernate.cfg.xml:

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- Database Connection Settings -->
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/your_database_name</property>
        <property name="connection.username">your_username</property>
        <property name="connection.password">your_password</property>

        <!-- JDBC dialect -->
        <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>

        <!-- Echo SQL queries to console -->
        <property name="show_sql">true</property>
        <property name="hbm2ddl.auto">update</property>

        <!-- Mapping Entity Class -->
        <mapping class="org.jsp.emp.Employee"/>
    </session-factory>
</hibernate-configuration>


🚀 How to Run

Clone or Download the project to your local machine.

Ensure your database server (e.g., MySQL) is running and update hibernate.cfg.xml with your credentials.

Open the project in your IDE (Eclipse, IntelliJ IDEA, VS Code).

Run any of the main classes depending on the operation you wish to perform:

addEmployee.java – Populate initial sample data.

FindEmployeeById.java – Fetch specific employee details interactively via console.

VerifyEmployeeWithEmailAndPassword.java – Perform simple authentication checks.

📋 Entity Model Attributes

The Employee POJO consists of the following attributes:

id (int)

name (String)

phone (long)

email (String)

designation (String)

salary (double)

password (String)
