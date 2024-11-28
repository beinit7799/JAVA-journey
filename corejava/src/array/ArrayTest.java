package array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//store and print age of 5 students
		
		int []age = new int [5];
		Scanner scn = new Scanner(System.in);
		
		for(int i=0 ;i<age.length;i++) {
			
			age[i] = scn.nextInt();
		}
		
		for(int x : age) {
			
		System.out.println(x);
		}
		
		
	}
}
