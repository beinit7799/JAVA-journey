package Assignments;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range you want to calculate the sum of natural numbers:");
		n=sc.nextInt();
		
		sum=Nsum(n);
		System.out.println("The sum is="+sum);
	}
	
	static int Nsum(int x) {
		
		int s=0;
		for(int i=1 ; i<=x ; i++) {
			 s+=i;
		}
		return s;
	}

}
