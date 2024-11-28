package Inheritance;

public class Square extends Rectangle {

	int length ;
	int perimeter=0;
	double area=0;
	
	
	public Square(int length , int rLength , int rBreadth) {
		super(rLength,rBreadth);
		this.length=length;
	}
	
	public void area() {
		super.area();
		area=length*length;
		System.out.println("Area="+area);
	}
	
	public void peri() {
		super.peri();
		perimeter=2*length;
		System.out.println("Perimeter="+perimeter);
		
	}
}
