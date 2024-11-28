package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public class CustomerService_impl implements CustomerService {

	List<Customer> clist = new ArrayList<>();

	
	@Override
	public void addInfo(Customer Cus) {
		clist.add(Cus);
		System.out.println("------added sucess-----size ="+clist.size());

	}

	@Override
	public void deleteCustomer(int index) {
		clist.remove(0);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return clist ;
	}
	
	

}
