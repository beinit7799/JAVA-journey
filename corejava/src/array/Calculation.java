package array;

public class Calculation {
	public static void main(String[] args) {
		int mat1[][]={{44,77},{88,99}};
		int mat2[][]= {{4,5},{1,4}};
		int mat3[][]=new int[2][2];
		
		//sum
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				System.out.println(mat3[i][j]+" ");
			}
			System.out.println();
		}
	
}
}
