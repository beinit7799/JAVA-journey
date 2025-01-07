package com.bway.springdemo.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
