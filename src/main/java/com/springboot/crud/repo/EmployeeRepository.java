package com.springboot.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
