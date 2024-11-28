package conrolstat.looping;

public class oddEvenForLoop {
	public static void main(String[] args) {
		
		int i,Esum=0,Osum=0;
		
		System.out.println("The even numbers are:");
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				Esum=Esum+i;
				System.out.print(i+",");
			}
		}
		System.out.println("The sum of even numbers+"+Esum);
		
		System.out.println(" ");
		System.out.println("The odd numbers are:");
		for(i=1;i<=100;i++) {
			Osum=Osum+1;
			if(i%2!=0) {
				System.out.print(i+",");
			}
		}
		System.out.println("The sum of odd numbers+"+Osum);

		
	}

}
