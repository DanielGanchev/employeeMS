import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/employees";

export const listEmployees = () => axios.get(EMPLOYEE_API_BASE_URL + '/get/all');

export const addEmployee = (employee) => axios.post(EMPLOYEE_API_BASE_URL + '/create', employee);
