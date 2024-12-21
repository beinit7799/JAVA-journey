package com.bway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.User;
import com.bway.springdemo.repository.UserRepositiory;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepositiory userRepo;
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User u ) {
		
//		model.addAttribute("fname",u.getFname());
//		model.addAttribute("lname", u.getLname());
//		model.addAttribute("uname",u.getUsername());
//		model.addAttribute("password", u.getPassword());
//		
		userRepo.save(u);
		return "Profile";
	}
	
/*
 * How to connect database in spring boot
 * 1.put dependency of spring data JPA
 * 2.put dependency of MySql Driver
 */
	
}
