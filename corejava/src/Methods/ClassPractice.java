package Methods;

import java.util.Scanner;

public class ClassPractice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		sum();
		
		int tab;
		System.out.println("Enter the value:");
		tab=sc.nextInt();
		printTable(tab);
		
		int s=getSumOf1To100();
		System.out.println("sum of 1to100 ="+s);
		
		int sv = getSmallestValue(100,200);
		System.out.println("Smallest value="+sv);
		
	}
	
	//1. No return type with no arguments.
	static void sum() {
		int a = 0;
		int b=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value for a and b:");
		a=scn.nextInt();
		b=scn.nextInt();
		int c=a+b;

		System.out.println("Total="+c);
	}
	
	//2. no return type with arguments
	static void printTable(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
	
	//3. return type with no arguments
	static int getSumOf1To100() {
		
		int s=0;
		for(int i=1;i<=100;i++) {
			s=s+i;
		}
		return s;
	}
	
	 //return type with arguments
	static int getSmallestValue(int  x, int y) {
		
		if(x<y) {
			return x;
		}else {
			return y;
		}
		
	}
}
