package com.bway.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.model.User;

public interface UserRepositiory extends JpaRepository<User, Integer> {
	
  User findByUsernameAndPassword(String un, String pass);	

}
