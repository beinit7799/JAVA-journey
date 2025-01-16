package com.bway.springdemo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springdemo.model.User;
import com.bway.springdemo.repositiry.ProductRepository;
import com.bway.springdemo.service.UserService;
import com.bway.springdemo.utils.VerifyRecaptcha;

import jakarta.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ProductRepository prodRepo;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		
		model.addAttribute("plist",prodRepo.findAll());
		
		return"CustomerHome";
	}
	
	
	@GetMapping("/login")
	public String getLogin() {
		
		log.info("----inside login form----");
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User u, Model model, HttpSession session, @RequestParam("g-recaptcha-response") String grCode) throws IOException {
		
		if (VerifyRecaptcha.verify(grCode)) {
			
			
		
		
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
		User usr = userService.userLogin(u.getUsername(),u.getPassword());
		if (usr !=null) {
			log.info("---login sucess----");
			session.setAttribute("activeuser", usr);
			session.setMaxInactiveInterval(400);//session expire after 400s
			if(usr.getRole().equalsIgnoreCase("CUSTOMER")) {
				model.addAttribute("plist",prodRepo.findAll());
				return"CustomerHome";
			}
			
			return "Home";
		 }else {
			 log.info("------login failed-----");
			 model.addAttribute("message","user not found");
			 return "LoginForm";
		 }
		}
		
		model.addAttribute("message","You are robot!!");
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
	public String logout(HttpSession session) {
		session.invalidate();
		return "LoginForm";	
	}
	
	@GetMapping("/profile")
	public String getProfile() {
		
		return"Profile";
	}
	

}
