package conrolstat.looping;

public class JumpTest {
	/*
	 * ----------jumping statements------------
	 * 1>break; exit from loop
	 * 2>continue; skip values
	 * 3>return; exit from method
	 */
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i==5) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		
		System.out.println("End for loop");
	}
}
