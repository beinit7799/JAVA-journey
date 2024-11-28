package Assignments;

import java.util.Scanner;

public class Multiple_Table {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want the table of it:");
		a=sc.nextInt();
		table(a);
	}
	
	static void table(int x) {
		
		for(int i=1 ;i<=10 ; i++) {
			
			System.out.println(x+"x"+i+"="+(x*i));
		}
	}
}
