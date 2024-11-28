package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService_impl;
import com.service.Product_Service;

public class Test_Product {
	public static void main(String[] args) {
		add();
		getAll();
		delete();
		getAll();
		
	}
	
	static void add() {
		
		Product_Service ps = new ProductService_impl();
		char flag = 'y';
		Scanner sc = new Scanner(System.in);
		do {
			Product p = new Product();
			
			System.out.println("Enter Id");
			p.setId(sc.nextInt());
			System.out.println("Enter name");
			p.setName(sc.next());
			System.out.println("Enter Price");
		    p.setPrice(sc.nextInt());
		    System.out.println("Enter category");
		    p.setCategory(sc.next());
		    
		    ps.addProduct(p);
		    
		    System.out.println("Do you want to continue[y/n]");
		    flag = sc.next().charAt(0);
		}while(flag=='y');
		
	}
	
	//get all products
	static void getAll() {
		Product_Service ps =new ProductService_impl();
		List<Product> plist = ps.getAllProduct();
		System.out.println(plist);
	}
	
	//delete product
	static void delete() {
		int id = 0;
		Scanner sc = new Scanner(System.in);
		Product_Service ps = new ProductService_impl();
		System.out.println("Enter id to be deleted:");
		id=sc.nextInt();
		ps.deleteProduct(id);//index 0
		
	}
}
