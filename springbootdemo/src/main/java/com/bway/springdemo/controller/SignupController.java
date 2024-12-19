package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.User;

@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User u , Model model ) {
		
		model.addAttribute("fname",u.getFname());
		model.addAttribute("lname", u.getLname());
		model.addAttribute("uname",u.getUsername());
		model.addAttribute("password", u.getPassword());
		
		
		return "Profile";
	}

}
