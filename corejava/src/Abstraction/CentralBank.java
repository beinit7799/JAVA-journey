package Abstraction;

public abstract class CentralBank {
	
	 abstract void getBankName();
	
	 abstract void getInrestRate();
	
	void getExRate() {
		System.out.println("$1=132");
		System.out.println("Yen 10 =10");
		System.out.println("100 IC = 160");
	}
}