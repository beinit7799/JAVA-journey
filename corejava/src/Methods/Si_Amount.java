package Methods;

import java.util.Scanner;

public class Si_Amount {
	public static void main(String[] args) {
		
		input();
		
	}
	
	static void input() {
		
		double p,t,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle,time and rate:");
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();
		 
		processing(p,t,r);
		}
	
	static void processing(double x,double y, double z) {
		
		double si,amount;
		si=(x*y*z)/100;
		amount=x+si;
		
		output(si,amount);
	}
	
	static void output(double c , double d) {
		
		System.out.println("The Simple Intrest is="+c);
		System.out.println("The amount is="+d);
	}
}
