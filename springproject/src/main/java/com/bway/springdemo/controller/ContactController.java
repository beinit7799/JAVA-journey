package com.bway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springdemo.utils.MailUtils;

@Controller
public class ContactController {
    
	@Autowired
	private MailUtils mailUtils;
	
	@GetMapping("/contact")
	public String getContactForm() {
		return"ContactForm";
	}
	@PostMapping("/contact")
	public String postContact(@RequestParam("toEmail") String toEmail, @RequestParam("subject") String subject, @RequestParam("message") String message,Model model) {
		mailUtils.sendEmail(toEmail, subject, message);
		model.addAttribute("message","Email send sucessfully");
		
		return"ContactForm";
	}
}
