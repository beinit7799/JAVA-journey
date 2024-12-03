package com.service;

import java.util.List;

import com.model.Product;

public interface Product_Service {

	void addProduct(Product prod);
	void deleteProduct(int index);
	
	List<Product> getAllProduct();
	void updateProduct(Product prod);
	List<Product> searchProduct(String data);


	
}
