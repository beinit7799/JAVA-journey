package Abstraction;

public class Test {
	 
	public static void main(String[] args) {
		
		CentralBank b = new NabilBank();
		
		b.getBankName();
		b.getInrestRate();
		b.getExRate();
		
		UserService us = new UserService_impl();
		
		us.addUser();
		us.deleteUser();
		us.updateUser();
		
		us.print();
	}
}
