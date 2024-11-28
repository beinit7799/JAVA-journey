package Inheritance;

public class Programmer extends Employee{
	
	String Plan;
	String project;
	int bonous;
	
	void print() {
		
		super.print();
		System.out.println("Planguage = "+Plan);
		System.out.println("Project = "+project);
		System.out.println("Bonous = "+bonous);
	}

}
