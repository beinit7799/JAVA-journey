package OOP;

import java.util.Scanner;

public class Rectangle {
	
	int length;
	int height;
	Scanner sc = new Scanner(System.in);

	
	void rectangleInfo() {
		System.out.println("Enter length and height:");
		length=sc.nextInt();
		height=sc.nextInt();
		System.out.println("Length="+length);
		System.out.println("Height="+height);
	}
	
	void area() {
		int area=length+height;
		System.out.println("Area="+area);
	}
	
	void peri() {
		int peri=2*(length+height);
		System.out.println("Perimeter="+peri);
		
	}

}
