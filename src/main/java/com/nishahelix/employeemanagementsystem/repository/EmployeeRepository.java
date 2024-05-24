package com.nishahelix.employeemanagementsystem.repository;

import com.nishahelix.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
