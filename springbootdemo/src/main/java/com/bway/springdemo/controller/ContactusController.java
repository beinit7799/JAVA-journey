package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContactusController {
	@GetMapping("/contact")
	public String getLogin() {
		
		return "contactus";
	}

}
