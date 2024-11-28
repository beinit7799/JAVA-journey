package array;

public class MultiDArray {
	/*
	 * --------------multi D Array---------------
	 * #Used to manage data in row and column format.
	 * #Syntax
	 * 		
	 * 			data_type array_name[][] = new data_type[rows][cols];
	 */
	public static void main(String[] args) {
		
		int matrix[][] = new int [2][2];
		//write
		for(int i=0 ;i<2;i++) {
			for(int j =0 ; j<2 ;j++) {
				matrix[i][j]=300;
			}
		}
		//read
		for(int i=0 ;i<2;i++) {
			for(int j =0 ; j<2 ;j++) {
				System.out.println(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
