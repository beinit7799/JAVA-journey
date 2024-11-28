package Inheritance;

public class Test_class {
	public static void main(String[] args) {
	
		Employ e = new Employ("Binit", 22, "9823779722", "Ktm", 2000, "java" , "Software");
		Manager m = new Manager("hari", 33, "9834657328", "bkt", 5660, "c++", "HR");
		System.out.println("This is Employee Details:");
		e.displayEmpDetails();
		System.out.println("This is Manager detail");
		m.displayMemDetails();

		Square s =new Square(2, 3, 4);
		s.area();
		s.peri();
	
	}
}
