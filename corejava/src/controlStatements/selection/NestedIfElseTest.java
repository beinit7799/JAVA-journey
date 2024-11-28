package controlStatements.selection;

import java.util.Scanner;

public class NestedIfElseTest {
	/*
	 * -------------Nested If-Else--------------
	 */
public static void main(String[] args) {
	String citizen;
	int age;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your nationality:");
	citizen=sc.next();
	
	
	
	if (citizen.equals("nepali")) {
			
		System.out.println("Enter your age:");
			age=sc.nextInt();
			if (age>=18) {
				System.out.println("you can vote");
			} else {
				System.out.println("You cannot vote");
			}
		
	} else {
		System.out.println("You cannot vote");
	}
}
}
