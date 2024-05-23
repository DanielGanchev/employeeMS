package net.dodo.employeesystembackend.repository;

import net.dodo.employeesystembackend.entity.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
