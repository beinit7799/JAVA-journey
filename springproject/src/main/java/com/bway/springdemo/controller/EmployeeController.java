package com.bway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springdemo.model.Employee;
import com.bway.springdemo.service.DepartmentService;
import com.bway.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/add")
	public String getEmployeeForm(Model model) {
		
		model.addAttribute("dList",deptService.getAllDepts());
		return "EmployeeForm";
		
	}
	@PostMapping("/add")
	public String postEmployee(@ModelAttribute Employee emp) {
		
		empService.addEmployee(emp);
		return "redirect:add";
		
	}
	@GetMapping("/list")
	public String getEmps(Model model) {
		
		model.addAttribute("eList",empService.getAllEmployees());
		
		return "EmployeeList";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		
		empService.deleteEmployee(id);
		
		return"redirect:list";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam("id") int id , Model model) {
		
		model.addAttribute("eModel",empService.getEmployeeById(id));
		
		return"EmployeeEditForm";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee emp) {
		
		empService.updateEmployee(emp);
		return "redirect:list";
	}
	
}
