package Assignments;

import java.util.Scanner;

public class AethemeticOperationSwitxhUsing_Methods {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		char c;
		System.out.println("Enter two integer values:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operation to be conduct [+,-,*,/]:");
		c=sc.next().charAt(0);
		 operations(a,b,c);
			
	}
	 
	static void operations(int x , int y , char z) {
		int result = 0;
		switch(z) {
		case '+':
			result=x+y;
			break;
		
		case '-':
			result=x-y;
			break;
			
		case '*':
			result=x*y;
			break;
		
		case '/':
			result=x/y;
			break;
			
		default:
			System.out.println("invlalid syntax");
		}
		
		System.out.println("The output of given operation is:"+result);
	}
}
