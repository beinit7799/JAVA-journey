package MethodOverriding;

public class Test {
	public static void main(String[] args) {
		//static or Early Binding.
		PrabhuBank p = new PrabhuBank();
		p.getBankName();
		p.getInrestRate();
		p.getExRate();
		
		NIMB n = new NIMB();
		n.getBankName();
		n.getInrestRate();
		n.getExRate();
		
		//up-casting
		CentralBank b = new NabilBank();
		
	}
	
	//late or dynamic binding of object.
	//run time poly-morphism.
	void PrintBankInfo(CentralBank bank) {
		bank.getBankName();
		bank.getInrestRate();
	}

}
