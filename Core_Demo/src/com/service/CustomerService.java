package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	void addInfo(Customer Cus);
	void deleteCustomer(int index);
	
	List<Customer> getAllCustomers();
}
