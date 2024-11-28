package Abstraction;

public class UserService_impl implements UserService ,CommonService{

	@Override
	public void addUser() {
		System.out.println("added sucess");
	}

	@Override
	public void deleteUser() {
		System.out.println("delete sucess");
	}

	@Override
	public void updateUser() {
		System.out.println("Updated sucess");
	}

	@Override
	public void print() {
		System.out.println("--Printing");
	}

}
