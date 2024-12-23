package com.bway.springdemo.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	

}
