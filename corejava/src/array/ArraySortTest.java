package array;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int data[]= {1,22,3,333,42,5,67,8,3,111};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		//reverse
		int j=0;
		int rev[]= new int [data.length];
		for(int i=9;i>=0;i--) {
			rev[j]=data[i];
			j++;
		}
		System.out.println(Arrays.toString(rev));
		
	}

}
