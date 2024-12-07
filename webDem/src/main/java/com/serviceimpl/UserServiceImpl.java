package com.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.Db;
import com.model.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void signup(User u) {
		String sql = "insert into user (fname,lname,username,password)value('"+u.getFname()+"','"+u.getLname()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
		try {
			Statement stm = Db.getConnection().createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean login(String un, String pass) {
		String sql = "select * from user where username = '"+un+"' && password = '"+pass+"'";
		try {
			Statement stm = Db.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				return true;	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
