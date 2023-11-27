# Intuit Shop Claims Manager

## Overview
Intuit Shop Claims Manager is a RESTful service designed to handle customer complaints for an online shop. It provides APIs for creating and retrieving user complaints with a focus on fault tolerance and effective error handling.

## Features
- **Create Complaint**: API endpoint for submitting a new user complaint.
- **Retrieve Complaint**: API endpoint for fetching the details of a specific complaint.

## Getting Started

### Prerequisites
- Java 17
- Maven
- Docker (optional for containerization)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/LiorRocks/intuit-shop-claims-manager.git

2. Navigate to the project directory:
```cd intuit-shop-claims-manager```

3. Build the project using Maven:
```mvn clean install```

# Running the Application
Execute the following command to run the application:
```java -jar target/intuit-shop-claims-manager-0.0.1-SNAPSHOT.jar ```

# Docker image
Alternatively, if you want to use Docker, build the image using the provided Dockerfile:
```docker build -t intuit-shop-claims-manager .```

And then run the container:
```docker run -p 8080:8080 intuit-shop-claims-manager ```

## Usage
The service provides the following endpoints:

### POST /complaints: Create a new complaint.
### GET /complaints/{id}: Retrieve complaint details by ID.
You can use tools like curl or Postman to interact with the API.

# Example curl request to create a complaint:
```curl -X POST http://localhost:8080/complaints \```
```-H "Content-Type: application/json" \```
```-d '{"userId": "user-id", "subject": "subject", "complaint": "complaint text", "purchaseId": "purchase-id"}'```



# Configuration
Configuration settings can be found and modified in the application.properties file.

License
This project is licensed under the MIT License.

# Contact
Gershon Avital - GitHub Profile

Project Link: https://github.com/LiorRocks/intuit-shop-claims-manager
