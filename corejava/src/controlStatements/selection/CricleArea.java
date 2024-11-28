package controlStatements.selection;

import java.util.Scanner;

public class CricleArea {
	public static void main(String[] args) {
		double area,r;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		r=sc.nextInt();
		
		if(r==0) {
			System.out.println("Radius should not be zero!!!!!!");
		}
		else {
			area = 3.14*r*r;
			 System.out.println("The are of circle="+area);

		}
	}

}
