package controlStatements.selection;

import java.util.Scanner;

public class IfTest {
	/*
	 * -----------If---------------
	 * Used to implement single condition
	 * 
	 * #Syntax: 
	 * 		   if(condition){
	 * 				//statements
	 * 			}
	 */
	public static void main(String[] args) {
		
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		salary=sc.nextInt();
		if(salary<30000) {
			salary=salary+9000;
		}
		
		 System.out.println("Your salary ="+salary);

	}
}
