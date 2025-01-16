package com.bway.springdemo.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springdemo.repositiry.ProductRepository;


@Controller
public class GalleryController {
	
	@Autowired
	private ProductRepository prodRepo;
	
	@GetMapping("/gallery")
	public String getGallery(Model model, HttpSession session) {
		
		if (session.getAttribute("activeuser")==null) {
			
			return "LoginForm";
			
		}
		
		String[] imgName = new File("src/main/resources/static/images").list();
		model.addAttribute("imgList",imgName);
		
		return "GalleryForm";
	}
	
	@GetMapping("/productgallery")
	public String getProductGallery(Model model) {
		
		model.addAttribute("plist",prodRepo.findAll());
		return "ProductGalleryForm";
	}
}
