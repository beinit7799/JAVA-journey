package com.bway.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //used to processing http Request
public class IndexController {
	
	@GetMapping("/")//root url
	public String getIndex() {
		return "index";
	}

}
