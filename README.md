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

## Process of pushing your calculator application's Docker image to Docker Hub
Login to Docker Hub from terminal:
```
# Login to Docker Hub
docker login
# Enter your Docker Hub username and password when prompted
```
Tag your Docker image:
```
# Format: docker tag local-image:tag username/repository:tag
docker tag calculator-app yourdockerhubusername/calculator-app:latest
```

Push the image to Docker Hub:
```
# Push the image
docker push yourdockerhubusername/calculator-app:latest
```


..............................................................................................................................
**Important Note that**
Sometimes, when we run the docker command in GKE cluster "sudo docker run -p 8080:8080 lishan2023/calculator-app:latest" then result got the error

WARNING: The requested image's platform (linux/arm64/v8) does not match the detected host platform (linux/amd64/v3) and no specific platform was requested
```
exec /usr/local/openjdk-11/bin/java: exec format error
```
means that, 
The error you're encountering indicates a platform mismatch between the Docker image you're trying to run and the architecture of your host system. The image lishan2023/calculator-app:latest appears to be built for linux/arm64, but your host system is running on linux/amd64 (a different CPU architecture). This is why you're seeing the error:

```
exec /usr/local/openjdk-11/bin/java: exec format error
```
This issue typically happens when trying to run an image built for a different CPU architecture than the one your system uses. Here's how you can resolve this:
**Check Your Host's Architecture**
```
uname -m
```
>> If it outputs x86_64, you're using an amd64 (64-bit Intel/AMD) architecture.
>>> If it outputs aarch64 or arm64, you're using an arm64 architecture.
>>> Since your error indicates that your system is running on linux/amd64, but the Docker image is built for linux/arm64, we need to resolve this architecture mismatch.





































