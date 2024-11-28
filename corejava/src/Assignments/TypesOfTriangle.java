package Assignments;

import java.util.Scanner;

public class TypesOfTriangle {
  public static void main(String[] args) {
	  
	   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the sides of triangle:");
	    int a,b,c;
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    
	    triangle(a,b,c);
      }
  
  static void triangle(int x,int y, int z) {
	  
	  if(x==y & x==z) {
		  System.out.println("The given Triagle is Equilateral triangle");
	  }else if(x==y || x==z || y==z ) {
		  System.out.println("The given Triagle is Isosceles triangle");
	  }else {
		  System.out.println("The given Triagle is Scalene triangle");
	  }
  }
}
