package corejava;

public class Table {
	public static void main(String[] args) {
		int a=10,b=2;
		int c=a+b; 
		System.out.println("-------------------------------------");
		System.out.println("| S.N |  Name    |  Age |    City   |");
		System.out.println("-------------------------------------");
		System.out.println("|  1  | Binit KC |  22  | Kathmandu |");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Result="+c);
		
		if (a>b){
			 c=++a;
			 System.out.println(c);
		}
		else {
			c=--a;
			 System.out.println(c);
		}
	}

}
