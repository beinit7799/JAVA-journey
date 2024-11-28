package Methods;

import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args) {
		
		
		//int a=area(l,b);
		//System.out.println("The area ="+a);
		
		area();

	}
	
	static void area() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length breadth and height :");
		int l,b,h;
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		  
		int area=l*b;
		  
		volume(area,h);
	  }
	
	static void volume(int a,int h) {
		
		int volume=a*h;
		System.out.println("The area is :"+a);
		System.out.println("The volume is ="+volume);
	}

}
