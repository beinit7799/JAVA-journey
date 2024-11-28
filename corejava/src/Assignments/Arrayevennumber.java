package Assignments;

public class Arrayevennumber {
	public static void main(String[] args) {
		int []even = new int[100];
		int index=0;
		
		for(int i=1 ; i<=100 ; i++) {
			
			
			if(i%2==0) {
					
				even[index]=i;
			}
			index++;
		}
		
		 for (int i = 0; i < even.length; i++) {
	            System.out.print(even[i] + " ");
	        }
	}

}
