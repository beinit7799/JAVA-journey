package com.bway.springdemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springdemo.model.Department;
import com.bway.springdemo.repositiry.DepartmentRepository;
import com.bway.springdemo.service.DepartmentService;
@Service
public class DepartmentServiceimpl implements DepartmentService {

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public void addDept(Department dept) {
		
		deptRepo.save(dept);
		
	}

	@Override
	public void deleteDept(int id) {
		
		deptRepo.deleteById(id);
		
	}

	@Override
	public void updateDept(Department dept) {

		deptRepo.save(dept);
		
	}

	@Override
	public Department getDeptById(int id) {

		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getAllDepts() {
		
		return deptRepo.findAll();
	}

}
