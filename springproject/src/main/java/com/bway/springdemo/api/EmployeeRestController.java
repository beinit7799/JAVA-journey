package com.bway.springdemo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bway.springdemo.model.Employee;
import com.bway.springdemo.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/api/emp/list")
	public  List<Employee> getAll() {
		return empService.getAllEmployees();
	}
	
	@GetMapping("/api/emp/{id}")
	public Employee getOne(@PathVariable("id") long id) {
		
		return empService.getEmployeeById(id);
	}
	@PostMapping("/api/emp/add")
	public String add(@RequestBody Employee emp) {
		
		empService.addEmployee(emp);
		return "success";
	}
	@PutMapping("/api/emp/update")
	public ResponseEntity<Employee> update(@RequestBody Employee emp) {
		empService.updateEmployee(emp);
		return  new ResponseEntity<>(emp,HttpStatus.CREATED);
	}
	@DeleteMapping("/api/emp/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id")long id) {
		empService.deleteEmployee(id);
		return new ResponseEntity<>("delete Sucess",HttpStatus.OK);
	}
	
}
