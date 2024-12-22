package com.bway.springdemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springdemo.model.User;
import com.bway.springdemo.repositiry.UserRepositiry;
import com.bway.springdemo.service.UserService;
@Service
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepositiry userRepo;
	
	
	@Override
	public void userSignup(User user) {
		
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String un, String pass) {
		
		return userRepo.findByUsernameAndPassword(un, pass);
	}

}
