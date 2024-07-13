package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.annotation.Id;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
