package Assignments;

public class Constructor_TriangleParameter {
	
	int a,b,c;
	double area;
	int peri;
	
	Constructor_TriangleParameter(int a , int b , int c) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		area=1/2*(b*c);
		peri=a+b+c;
		
	}
	
	void print() {
		
		System.out.println("area="+area);
		System.out.println("peri="+peri);
	}
	public static void main(String[] args) {
		Constructor_AreaTriangle triangle = new Constructor_AreaTriangle(2,3,4);
	}
}
