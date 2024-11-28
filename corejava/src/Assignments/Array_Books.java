package Assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Array_Books {
	public static void main(String[] args) {
		
		int []price = new int [10];
		 int total=0,avg;

		Scanner sc =new Scanner(System.in);
		
		 for(int i=0;i<price.length;i++) {
			 System.out.println("Enter the price of book:");
			 price[i]=sc.nextInt();
		 }
		 
		 for (int i=0;i<price.length;i++) {
			 
			 
			 total+=price[i]; 
		}
		 
		 System.out.println("The total price of all book is:"+total);
		 avg=total/10;
		 System.out.println("The Average price of all book is:"+avg);

		 
	}
}
