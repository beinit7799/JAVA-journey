package controlStatements.selection;

import java.util.Scanner;

public class PerimeterRectangle {
	public static void main(String[] args) {
		int peri,l,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		l=sc.nextInt();
		System.out.println("Enter breadth of rectangle:");
		b=sc.nextInt();
		
		if(l==0 || b==0) {
			System.out.println("Lenght and Breadth of rectangle should not be zero");	
		}
		else {
			peri=2*(l+b);
			System.out.println("The perimenter of retangle is:"+peri);
		}	
	}

}
