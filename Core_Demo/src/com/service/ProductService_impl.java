package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductService_impl implements Product_Service {

	
	//static List<Product> plist = new ArrayList<>();
	
	@Override
	public void addProduct(Product prod) {
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
			String sql = "insert into product(name,company,price,category)values('"+prod.getName()+"','"+prod.getCompany()+"','"+prod.getPrice()+"','"+prod.getCategory()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
		//plist.add(prod);
		//System.out.println("------added sucess-----size ="+plist.size());
	}

	@Override
	public void deleteProduct(int id) {
		//plist.remove(index);
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
				String sql = "delete from product where id='"+id+"'";
				Statement stm = con.createStatement();
				stm.execute(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

	@Override
	public List<Product> getAllProduct() {
		
		List<Product> prodList = new ArrayList<>();
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
				String sql = "select * from product";
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				
				while(rs.next()) {
					/*System.out.println("Name="+rs.getString("name"));
					System.out.println("Price="+rs.getInt("price"));
					System.out.println("Company="+rs.getString("company"));
					System.out.println("Category="+rs.getString("category"));
					*/
					Product p = new Product();
					p.setId(rs.getInt("id"));
					p.setName(rs.getString("name"));
					p.setPrice(rs.getInt("price"));
					p.setCategory(rs.getString("category"));
					p.setCompany(rs.getString("company"));	
					
					prodList.add(p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return prodList;
	}

	@Override
	public void updateProduct(Product prod) {

		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
			String sql = "update product  set name = '"+prod.getName()+"',company = '"+prod.getCompany()+"', price = '"+prod.getPrice()+"', category = '"+prod.getCategory()+"' where id = '"+prod.getId()+"'";
			Statement stm = con.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Product> searchProduct(String data) {
		
		List<Product> prodList = new ArrayList<>();
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
				String sql = "select * from product where name like '%"+data+"%' or company like '%"+data+"%' ";
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				
				while(rs.next()) {
					
					/*System.out.println("Name="+rs.getString("name"));
					System.out.println("Price="+rs.getInt("price"));
					System.out.println("Company="+rs.getString("company"));
					System.out.println("Category="+rs.getString("category"));
					*/
					
					Product p = new Product();
					p.setId(rs.getInt("id"));
					p.setName(rs.getString("name"));
					p.setPrice(rs.getInt("price"));
					p.setCategory(rs.getString("category"));
					p.setCompany(rs.getString("company"));	
					
					prodList.add(p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return prodList;
		
	}
	
	

}
