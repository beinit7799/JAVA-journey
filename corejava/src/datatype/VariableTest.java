package datatype;

import java.util.Scanner;

public class VariableTest {
	
	/*
	 * ---------------Variable---------------
	 * #Used to  store data/value
	 * #Data stored for data processing
	 * #Syntax: Data_type variable_name;
	 */
	 
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		
		int s=a+b;
		System.out.println("sum="+s);
	}
}
