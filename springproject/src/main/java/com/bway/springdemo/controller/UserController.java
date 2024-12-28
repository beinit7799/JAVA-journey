package com.bway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springdemo.model.User;
import com.bway.springdemo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/","/login"})
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User u, Model model) {
		
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));

		User usr = userService.userLogin(u.getUsername(),u.getPassword());
		if (usr !=null) {
			
			model.addAttribute("uname",usr.getFname());
			return "Home";
		}
		model.addAttribute("message","user not found");
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User u) {
		
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
		userService.userSignup(u);
		return "LoginForm";
	}
	@GetMapping("/logout")
	public String logout() {
		
		return "LoginForm";
		
		
	}
	

}
