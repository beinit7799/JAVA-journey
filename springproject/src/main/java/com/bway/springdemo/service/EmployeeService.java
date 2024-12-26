package com.bway.springdemo.service;

import java.util.List;

import com.bway.springdemo.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	void deleteEmployee(long id);
	void updateEmployee(Employee emp);
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();

}
