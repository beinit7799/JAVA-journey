package com.bway.springdemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springdemo.model.Employee;
import com.bway.springdemo.repositiry.EmployeeRepository;
import com.bway.springdemo.service.EmployeeService;
@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void addEmployee(Employee emp) {
		
		empRepo.save(emp);
	}

	@Override
	public void deleteEmployee(long id) {
		
		empRepo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		empRepo.save(emp);
	}

	@Override
	public Employee getEmployeeById(long id) {
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

}
