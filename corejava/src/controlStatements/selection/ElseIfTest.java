package controlStatements.selection;

public class ElseIfTest {
 public static void main(String[] args) {
	int marks=80;
	 if (marks>=80) {
		System.out.println("Distenction");
	}
	 else if (marks>=60) {
		System.out.println("First");
	}
	 else if (marks>=45) {
			System.out.println("Second");
		}
	 else if (marks>=32) {
			System.out.println("Third");
		}
	 else {
		 System.out.println("Fail");
	 }
}
}
