package com.bway.springdemo.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
