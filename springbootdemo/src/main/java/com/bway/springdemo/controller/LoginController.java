package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLoigin(@ModelAttribute User u , Model model ) {  //form ko post gareko data aauxa
		
		if(u.getUsername().equals("hari") && u.getPassword().equals("123")) {
			model.addAttribute("uname",u.getUsername());
			return "Home";
		}
		model.addAttribute("message","user do not exist");
		return "LoginForm";
	}
	
	
}
