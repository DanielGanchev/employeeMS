import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/employees";

export const listEmployees = () => axios.get(EMPLOYEE_API_BASE_URL + '/get/all');

export const addEmployee = (employee) => axios.post(EMPLOYEE_API_BASE_URL + '/create', employee);



export const updateEmployee = (employeeId, employee) => axios.put(EMPLOYEE_API_BASE_URL + '/update/' + employeeId, employee);

export const getEmployeeById = (employeeId) => axios.get(EMPLOYEE_API_BASE_URL + '/get/' + employeeId);

export const deleteEmployee = (employeeId) => axios.delete(EMPLOYEE_API_BASE_URL + '/delete/' + employeeId);