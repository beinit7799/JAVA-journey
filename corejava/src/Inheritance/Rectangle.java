package Inheritance;

public class Rectangle {
	
	int length;
	int breadth;
	double area=0;
	int perimeter=0;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area() {
		
		area=length*breadth;
		System.out.println("Area of rectangle="+area);
	}
	
	public void peri() {
		perimeter=2*(length+breadth);
		System.out.println("Rp="+perimeter);
	}

}
