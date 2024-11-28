package Assignments;

import java.util.Scanner;

public class Array_Citiesname {
	public static void main(String[] args) {
		
		String[]cities =new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<cities.length ; i++) {
			 
			System.out.println("Enter the name of city:");
			
			cities[i]=sc.next();
			
		}
		for (String string : cities) {
			
			System.out.println(string);
		}
	}
}
