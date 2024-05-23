package net.dodo.employeesystembackend.mapper;

import net.dodo.employeesystembackend.entity.dto.EmployeeDto;
import net.dodo.employeesystembackend.entity.models.Employee;

public class EmployeeMapper {


  public static EmployeeDto mapToEmployeeDto(Employee employee) {
    return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
        employee.getEmail());
  }

  public static Employee mapToEmployee(EmployeeDto employeeDto) {
    return new Employee(
        employeeDto.getId(),
        employeeDto.getFirstName(),
        employeeDto.getLastName(),
        employeeDto.getEmail());
  }
}
