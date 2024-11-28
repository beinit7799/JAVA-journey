package Assignments;

import java.util.Scanner;

public class ArthemeticSwitch {
	
	public static void main(String[] args) {
		
		int a,b,result;
		char choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers for Operations:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Enter the operation to conduct '+,-,*,/' ");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		 
		case '+':
			result=a+b;
			System.out.println("The addition of two given number is:"+result);
			break;
		
		case '-':
			result=a-b;
			System.out.println("The Substraction of two given number is:"+result);
			break;
			 
		case '*':
			result=a*b;
			System.out.println("The multiplication of two given number is:"+result);
			break;
 
		case '/':
			result=a/b;
			System.out.println("The division of two given number is:"+result);
			break;
	
		default:
			System.out.println("!!Invalid input!!");
 
		}
 
		 
	}

}
