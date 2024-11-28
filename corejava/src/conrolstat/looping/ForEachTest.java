package conrolstat.looping;

public class ForEachTest {
	/*
	 * --------forEach loop--------
	 * used to read data from collection(array,list ,set,map).
	 * for(data_type vat : collection){
	 * //statements
	 * }
	 */
	public static void main(String[] args) {
		
		int[]values = {9,2,23,45,32,55,67,99};
		int s=0;
		for(int x:values ) {
			System.out.println(x);
			s=s+x;
		}
		System.out.println("sum="+s);
 }	
}
