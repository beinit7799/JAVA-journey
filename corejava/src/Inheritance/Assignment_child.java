	package Inheritance;

public class Assignment_child extends Assignment_parent {
	
	void C_print() {
		
		System.out.println("This is child class");
		P_print();
	}
	
	public static void main(String[] args) {
		
		Assignment_child c = new  Assignment_child();
		Assignment_parent p = new Assignment_parent();
		
		
		c.C_print();
	
	}
}
