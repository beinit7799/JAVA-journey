package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Customer;
import com.model.Product;
import com.service.CustomerService;
import com.service.CustomerService_impl;
import com.service.ProductService_impl;
import com.service.Product_Service;

public class Test_Customer {
	
	public static void main(String[] args) {
		add();
		//getAll();
		//delete();
		//getAll();
	}
	
	static void add() {
		
		CustomerService cs = new CustomerService_impl();
		
		char flag = 'y';
		Scanner sc = new Scanner(System.in);
		do {
			Customer c = new Customer();
			
			System.out.println("Enter cstomer name:");
			c.setCname(sc.next());
			System.out.println("Enter Address:");
			c.setAddress(sc.next());
			System.out.println("Enter Contact number:");
			c.setContact(sc.next());
			System.out.println("Enter Menbership Number:");
			c.setMembership_no(sc.nextInt());
			
		    cs.addInfo(c);
		    System.out.println("Do you want to continue[y/n]");
		    flag = sc.next().charAt(0);

		}while(flag=='y');
		
		
	}
	
	//get all products
		static void getAll() {
			CustomerService cs =new CustomerService_impl();
			List<Customer> clist = cs.getAllCustomers();
			System.out.println(clist);
		}
		
		//delete product
		static void delete() {
			CustomerService cs =new CustomerService_impl();
			cs.deleteCustomer(0);//index 0
			
		}

}
