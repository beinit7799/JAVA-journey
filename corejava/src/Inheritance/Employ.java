package Inheritance;

public class Employ extends Members {

	String specialization;
    String department;
	
	public Employ(String name, int age, String phone, String address, int salary, String specialization , String department) {
		super(name, age, phone, address, salary);
		this.specialization=specialization;
		this.department=department;
	}
	
	public void displayEmpDetails() {
		printDetails();
		System.out.println("Specialization = "+specialization);
		System.out.println("Department = "+department);
		printSalary();	
	}  

}
