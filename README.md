# Employee Management System

This project is divided into two main parts: the backend and the frontend.

## Backend

The backend is a Spring Boot application located in the `employeeMS/employee-system-backend/` directory. It provides a RESTful API for managing employees.

### Main Classes
- **EmployeeController**: Handles HTTP requests and responses using the EmployeeService.
- **EmployeeService**: Interface defining operations on employees.
- **EmployeeServiceImpl**: Implementation of the EmployeeService interface.
- **EmployeeMapper**: Maps between Employee and EmployeeDto objects.

The project uses Maven, as specified in the `pom.xml` file.

## Frontend

The frontend is a React application located in the `employeeMS/ems-frontend/` directory. It provides a user interface for managing employees.

### Main Files
- **App.jsx**: Main component of the application.
- **EmployeeComponent.jsx**: Manages individual employees.
- **ListEmployeeComponent.jsx**: Displays a list of all employees.
- **EmployeeService.js**: Makes HTTP requests to the backend.

The project uses npm, as specified in the `package.json` file.

## Building and Running the Project

### Backend
Navigate to the `employeeMS/employee-system-backend/` directory and run:
```sh
mvnw spring-boot:run
```

## Employee Management API

This API facilitates the management of employees through a set of CRUD (Create, Read, Update, Delete) operations. Below is a detailed guide on each endpoint provided by the API.

### Endpoints

#### Create a New Employee

- **Method:** POST
- **Endpoint:** `/create`
- **Description:** Creates a new employee.
- **Request Body:** `EmployeeDto` object.
- **Response:** Created `EmployeeDto` object.
- **Status Codes:**
  - `201 CREATED` - Successfully created.

#### Retrieve an Employee by ID

- **Method:** GET
- **Endpoint:** `/get/{id}`
- **Description:** Retrieves an employee by their unique ID.
- **Path Variable:** `id` - The ID of the employee.
- **Response:** `EmployeeDto` object.
- **Status Codes:**
  - `200 OK` - Successfully retrieved.

#### Retrieve All Employees

- **Method:** GET
- **Endpoint:** `/get/all`
- **Description:** Retrieves all employees.
- **Response:** Iterable of `EmployeeDto` objects.
- **Status Codes:**
  - `200 OK` - Successfully retrieved.

#### Update an Existing Employee

- **Method:** PUT
- **Endpoint:** `/update/{id}`
- **Description:** Updates an existing employee.
- **Path Variable:** `id` - The ID of the employee.
- **Request Body:** `EmployeeDto` object.
- **Response:** Updated `EmployeeDto` object.
- **Status Codes:**
  - `200 OK` - Successfully updated.

#### Delete an Employee by ID

- **Method:** DELETE
- **Endpoint:** `/delete/{id}`
- **Description:** Deletes an employee by their ID.
- **Path Variable:** `id` - The ID of the employee.
- **Status Codes:**
  - `200 OK` - Successfully deleted.
  - `404 NOT FOUND` - Employee not found.
