package com.service;

import java.util.List;

import com.model.User;

public interface UserService {

	void signup(User u);
	boolean login(String un, String pass);
	List<User> getAllUsers();
	
}
