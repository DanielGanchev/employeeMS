package net.dodo.employeesystembackend.service;

import java.util.List;
import net.dodo.employeesystembackend.entity.dto.EmployeeDto;

public interface EmployeeService {
        EmployeeDto createEmployee(EmployeeDto employeeDto);
        EmployeeDto getEmployeeById(Long id);
        List<EmployeeDto> getAllEmployees();
        EmployeeDto updateEmployee(Long employeeId,EmployeeDto employeeDto);
        void deleteEmployee(Long employeeId);
}
