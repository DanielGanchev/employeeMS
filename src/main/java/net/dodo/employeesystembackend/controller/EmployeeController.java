package net.dodo.employeesystembackend.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.dodo.employeesystembackend.entity.dto.EmployeeDto;
import net.dodo.employeesystembackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

  private EmployeeService employeeService;

  @PostMapping ("/create")
  public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
    return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long id) {
    return  ResponseEntity.ok(employeeService.getEmployeeById(id));
  }

  @GetMapping("/get/all")
  public ResponseEntity<Iterable<EmployeeDto>> getAllEmployees() {
    return ResponseEntity.ok(employeeService.getAllEmployees());
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto employeeDto) {
    return ResponseEntity.ok(employeeService.updateEmployee(employeeId, employeeDto));
  }








}
