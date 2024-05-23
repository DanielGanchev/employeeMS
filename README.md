Employee Management System
This project is divided into two main parts: the backend and the frontend.

Backend
The backend is a Spring Boot application located in the employeeMS/employee-system-backend/ directory. It provides a RESTful API for managing employees. The main classes are:

EmployeeController: This class handles HTTP requests and responses. It uses the EmployeeService to perform operations.

EmployeeService: This is an interface that defines the operations that can be performed on employees.

EmployeeServiceImpl: This class implements the EmployeeService interface.

EmployeeMapper: This class is used to map between Employee and EmployeeDto objects.

The project is built using Maven, as specified in the pom.xml file.

Frontend
The frontend is a React application located in the employeeMS/ems-frontend/ directory. It provides a user interface for managing employees. The main files are:

App.jsx: This is the main component of the application.

EmployeeComponent.jsx: This component is used to display and manage individual employees.

ListEmployeeComponent.jsx: This component is used to display a list of all employees.

EmployeeService.js: This service is used to make HTTP requests to the backend.

The project is built using npm, as specified in the package.json file.

Building and Running the Project
To build and run the backend, navigate to the employeeMS/employee-system-backend/ directory and run the following command:

mvnw spring-boot:run

To build and run the frontend, navigate to the employeeMS/ems-frontend/ directory and run the following commands:

npm install
npm run dev

Please note that you need to have Maven and npm installed on your machine to build and run the project.

Endpoints
This controller provides endpoints for managing employees.

POST /create
This endpoint is used to create a new employee.

Request body: An EmployeeDto object representing the employee to be created.
Response: The created EmployeeDto object.
Status code: 201 CREATED
GET /get/{id}
This endpoint is used to retrieve an employee by their ID.

Path variable: id - The ID of the employee to retrieve.
Response: The EmployeeDto object of the retrieved employee.
Status code: 200 OK
GET /get/all
This endpoint is used to retrieve all employees.

Response: An Iterable<EmployeeDto> object containing all employees.
Status code: 200 OK
PUT /update/{id}
This endpoint is used to update an existing employee.

Path variable: id - The ID of the employee to update.
Request body: An EmployeeDto object representing the updated employee.
Response: The EmployeeDto object of the updated employee.
Status code: 200 OK
DELETE /delete/{id}
This endpoint is used to delete an employee by their ID.

Path variable: id - The ID of the employee to delete.
Status code: 200 OK if the employee was successfully deleted, 404 NOT FOUND if the employee does not exist.
Please note that all endpoints should be prefixed with the base URL of your application.

