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
public class LoginController {

	@Autowired
	private UserRepositiory userRepo;
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLoigin(@ModelAttribute User u , Model model ) {  //form ko post gareko data aauxa
		
		User usr = userRepo.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		
		if(usr !=null) {
			model.addAttribute("uname",u.getUsername());
			return "Home";
		}
		model.addAttribute("message","user do not exist");
		return "LoginForm";
	}
	
	
}
