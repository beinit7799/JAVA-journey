package Aggregation;

public class Test {
	
public static void main(String[] args) {
	
	Car c = new Car();
	 c.setModel("BMW400");
	 c.setPrice(500000);
	 c.setCompany("BMW");
	 c.setColor("blue");
	 
	 Employee emp=new Employee();
	 emp.setId(434);
	 emp.setName("Hari");
	 emp.setSalary(5000);
	 emp.setOffice("google");
	 emp.setCar(c);
	 
	 System.out.println("ID="+emp.getId());
	 System.out.println("Name="+emp.getName());
	 System.out.println("Salary="+emp.getSalary());
	 System.out.println("--car----");
	 System.out.println("Color="+emp.getCar().getColor());
	 System.out.println("Model="+emp.getCar().getModel());
	 System.out.println("Company"+emp.getCar().getCompany());
	 System.out.println("Price="+emp.getCar().getPrice());
	 
	 
	}
}
