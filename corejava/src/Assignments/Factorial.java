package Assignments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int num,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial of it:");
		num=sc.nextInt();
		result=factorial(num);
		System.out.println("The factorial of the given number is :"+result);
	}
	
	static int factorial(int x) {
		
		int f=1;
		for(int i=x ; i>=1 ; i--) {
			f*=i;
		}
		return f;
	}
}
