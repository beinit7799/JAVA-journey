package Abstraction;

public class NabilBank extends CentralBank {

	void getBankName() {
		System.out.println("Nabil Bank");
	}
	

	@Override
	void getInrestRate() {
		System.out.println("10%");
		
	}
}
