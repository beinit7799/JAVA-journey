package Assignments;

public class ArrayoddNumbers {

	public static void main(String[] args) {
		
		int odd[] = new int[100];
		
		for(int i=0; i<odd.length ; i++) {
			
			odd[i]=i;
			
			if(odd[i]%2!=0) {
				System.out.println(odd[i]);
			}
		}
	}
}
