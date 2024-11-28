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

**Make the Maven wrapper executable:**
```
chmod +x mvnw
```
## Our project structure:
```
calculator/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── Dockerfile
```

<img width="476" alt="image" src="https://github.com/user-attachments/assets/8fd6b4e8-657f-4e2b-b228-ad5b9c2ff808">

**Build the Docker image:**
```
docker build -t <Image-Name:tag> .
```
**Run the container:**
```
docker run -p 8080:8080 <Image-Name:tag>
```
After running the calculator application container, you can check it in several ways:
## Through your web browser:
```
#Open your browser and visit:
http://localhost:8080
```
<img width="1626" alt="image" src="https://github.com/user-attachments/assets/6986f729-bbfe-408d-9e4c-5578f2a0b962">


## Using curl command in terminal:
```
# Test the basic endpoint
curl http://localhost:8080

# Test the calculator API
curl -X POST http://localhost:8080/api/calculator/calculate \
-H "Content-Type: application/json" \
-d '{"num1": 10, "num2": 5, "operation": "add"}'
```
## Check if the application is running:
```
# Check running processes on port 8080
lsof -i :8080

# Check Java processes
ps aux | grep java
```












































