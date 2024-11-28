package Assignments;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		
		int day;
		String Nday="";
		System.out.println("Enter the number from (1...7):");
		Scanner sc = new Scanner(System.in);
		day=sc.nextInt();
		Nday=week(day);
		System.out.println("The day of the week is:"+Nday);
		
	}
	
	static String week(int x) {
		
		switch(x) {
		
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		}
		return null;
		
	}

}
