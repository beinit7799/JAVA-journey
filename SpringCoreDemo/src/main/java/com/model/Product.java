package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value ="prod")//used to  create bean

public class Product {
	
	@Value("201610")
	private int id;
	
	@Value("MOBILE")
	private String name;
	
	@Value("50000")
	private int price;
	
	@Autowired
	private Category ct;
	
	void printProduct() {
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		
		ct.printCategory();
	}
	

}
