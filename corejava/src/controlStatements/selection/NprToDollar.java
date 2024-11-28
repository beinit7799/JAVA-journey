package controlStatements.selection;

import java.util.Scanner;

public class NprToDollar {
	public static void main(String[] args) {
		double npr,dollar;
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter amount in NPR:");
		 npr=sc.nextDouble();
		  if (npr==0) {
			  System.out.println("Error");
			
		} else {
			dollar=npr*131;
			System.out.println("The dollor conversion of Npr is:"+dollar);
		}
	}

}
