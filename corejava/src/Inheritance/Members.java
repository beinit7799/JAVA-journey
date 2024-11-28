package Inheritance;

public class Members {
	
	 String name; 
	 int age; 
	 String phone; 
	 String address; 
	 int salary; 
	 
	 public Members (String name , int age , String phone , String address , int salary ) {
		 this.name=name;
		 this.age=age;
		 this.phone=phone;
		 this.address=address;
		 this.salary=salary;
	 }
	 
	 void printDetails() {
	     	System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phone);
	        System.out.println("Address: " + address);	 }
	 
	 void printSalary() {
		 System.out.println("Salary = "+salary);
	 }
	
}
