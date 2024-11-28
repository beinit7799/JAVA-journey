package array;

import java.util.Arrays;

public class arrayMethod {
	public static void main(String[] args) {
		 int array[]= {1,2,3,4,5};
		 add(array);
		 int[] oodn=getOddNumsfrom1To100();
		 System.out.println(Arrays.toString(oodn));
		 int div[]= {3,4,5,65,78,98,76,3,45,67,89,45};
		 int[] num=divFive(div);
		 System.out.println(Arrays.toString(num));
	}
	
	static void add(int values[]) {
		
		int s=0;
		for(int x:values ) {
			s=s+x;
		}
		System.out.println("Total="+s);
	}
	
	
	static int[] getOddNumsfrom1To100() {
		
		int oddNum[] = new int [50];
		int j=0;
		
		for(int i = 1; i<=100 ; i++) {
			
			if(i%2!=0) {
				oddNum[j]=i;
				j++;
			}
		}
		return oddNum;
	}
	
	static int[] divFive(int x[]) {
		
		int five[]=new int [50];
		int j=0;
		
		for(int y:x) {
			
			if(y%5==0) {
				
				five[j]=y;
			}
		}
		return five;
		
	}

}
