package com.bway.springdemo.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {
	
	@GetMapping("/gallery")
	public String getGallery(Model model) {
		
		String[] imgName = new File("src/main/resources/static/images").list();
		model.addAttribute("imgList",imgName);
		
		return "GalleryForm";
	}
}
