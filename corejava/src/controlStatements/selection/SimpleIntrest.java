package controlStatements.selection;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		double si,p,t,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle:");
		p=sc.nextDouble();
		System.out.println("Enter Time:");
		t=sc.nextDouble();
		System.out.println("Enter Rate:");
		r=sc.nextDouble();
		
		if (p==0 || t==0 || r==0) {
			System.out.println("The entered values should not be zero!!!");
			
		} else {
			si=p*t*r/100;
			System.out.println("The simple intrest is:"+si);

		}
		
	}
	
}
