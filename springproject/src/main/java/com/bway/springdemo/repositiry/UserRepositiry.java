package com.bway.springdemo.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.model.User;

public interface  UserRepositiry extends JpaRepository<User,Integer>{
	
	User findByUsernameAndPassword(String un,String pass);
}
