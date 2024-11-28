The Spring Boot Calculator Application is a robust web-based calculator that provides both a RESTful API and an intuitive user interface for performing arithmetic operations. Built with modern Java technologies and following best practices, this application serves as both a practical tool and a demonstration of Spring Boot application development.

**Core Features**
```
Basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
RESTful API endpoints
Web-based user interface
Docker support
Error handling for invalid operations
Real-time calculation
```
**Technologies Used**
```
Java 11
Spring Boot 2.7.0
Maven
Docker
HTML/CSS/JavaScript
RESTful API
```
**Prerequisites**
```
Java JDK 11 or higher
Maven 3.6 or higher
Docker 
```
**Getting Started**
Local Setup and Clone the repository
```
git clone https://github.com/yourusername/Spring-Boot-calculator-app.git
cd Spring-Boot-calculator-app
```
**Build the project**
```
mvn clean package
```
Run the application
```
java -jar target/calculator-0.0.1-SNAPSHOT.jar
```
The application will be available at http://localhost:8080

or if you get the error occurs during the mvn clean package, we need to create the Maven wrapper files first. Let's fix this by creating the necessary Maven files by following ways:

**Create Maven Wrapper files:**
```
# Navigate to your project directory
cd calculator

# Initialize Maven Wrapper
mvn -N io.takari:maven:wrapper
```

















































