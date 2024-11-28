package Assignments;

import java.util.Scanner;

public class BookInfo {
	public static void main(String[] args) {
		
		int price[] = new int[100];
		String[] title=new String[100];
		String author[]=new String[100];
		String publisher[]=new String[100];
		int isbn[]=new int[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ; i<=3 ; i++) {
			
				title[i]=sc.next();
				if(title[i].equals("end")) {
					title[i]=" ";
					System.out.println("End of task");
					break;
				}else{
					for(int x=1 ; x<=3 ; x++) {
						System.out.println(title[x]);
					}
				}
			
		}
		
		
		

	}

}
