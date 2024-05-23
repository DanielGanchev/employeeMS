package net.dodo.employeesystembackend.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import net.dodo.employeesystembackend.entity.dto.EmployeeDto;
import net.dodo.employeesystembackend.entity.models.Employee;
import net.dodo.employeesystembackend.exception.ResourceNotFoundException;
import net.dodo.employeesystembackend.mapper.EmployeeMapper;
import net.dodo.employeesystembackend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;


  @Override
  public EmployeeDto createEmployee(EmployeeDto employeeDto) {
    Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
    Employee savedEmployee = employeeRepository.save(employee);
    return EmployeeMapper.mapToEmployeeDto(savedEmployee);
  }

  @Override
  public EmployeeDto getEmployeeById(Long id) {
    Employee employee = employeeRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
    return EmployeeMapper.mapToEmployeeDto(employee);
  }

  @Override
  public List<EmployeeDto> getAllEmployees() {
    List<Employee> employees = employeeRepository.findAll();

    return employees.stream()
        .map(EmployeeMapper::mapToEmployeeDto)
        .collect(Collectors.toList());

  }

  @Override
  public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto) {
    Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));

    employee.setFirstName(employeeDto.getFirstName());
    employee.setLastName(employeeDto.getLastName());
    employee.setEmail(employeeDto.getEmail());

    Employee updatedEmployee = employeeRepository.save(employee);
    return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
  }

  @Override
  public void deleteEmployee(Long employeeId) {
    Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
    employeeRepository.deleteById(employeeId);

  }
}