package OOP;

public class Test {
 public static void main(String[] args) {
	
	 Student s = new Student();
	 s.id = 3434;
	 s.fname = "ram";
	 s.lname = "lama";
	 s.college = "NCIT";
	 s.roll = 201610;
	 s.printStudentInfo();
	 
	 Student binit = new Student();
	 binit.fname = "binit";
	 binit.lname = "kc";
	 binit.college = "Ncit";
	 binit.id = 33;
	 binit.roll = 21;
	 binit.printStudentInfo();
	 
	 Rectangle rec= new Rectangle();
	 rec.rectangleInfo();
	 rec.area();
	 rec.peri();
}
}
