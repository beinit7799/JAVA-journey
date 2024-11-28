package Assignments;

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		
		int choice;
		double total;
		//can take string for choice
		System.out.println("Enter 1 to calculate the salary of MD ");
		System.out.println("Enter 2 to calculate the salary of CEO ");
		System.out.println("Enter 3 to calculate the salary of Manager");
		System.out.println("Enter 4 to calculate the salary of Helper ");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHOICE=>");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			total=230000+(230000*0.2);
			System.out.println("The total salary of MD is Rs "+total);
			break;
			
		case 2:
			total=250000+(250000*0.2579);
			System.out.println("The total salary of CEO is RS "+total);
			break;

			
		case 3:
			total=176000+(176000*0.16);
			System.out.println("The total salary of Manager is RS "+total);
			break;

			
		case 4:
			total=145900+(145900*0.09);
			System.out.println("The total salary of MD is RS "+total);
			break;

		
		default:
			System.out.println("!!Invalid input!!");
			
		 }

		
	}

}
