
public class User {
	
	String username;
	String password;
	
	User(){
		username="admin";
		password="1234";
	}
	
	
	User(String username , String password){
		
		//this();-->calling default constructor.
		//this(1,2);-->calling parameterized constructor.
		this.username=username;
		this.password=password;
		/*
		 * # 'this' keyword represents current object.
		 * # We can call following using this keyword:
		 * 	1.instance variable.
		 * 	2.instance  methods.
		 * 	3.constructor.
		 */
		
	}
	
	void printUser() {
		
		System.out.println("UserName = "+username);
		System.out.println("Password = "+password);
	}

	public static void main(String[] args) {
		User u = new User("binit","12345");
		u.printUser();
		
	}
}
