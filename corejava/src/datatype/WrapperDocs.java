package datatype;

public class WrapperDocs {
	public static void main(String[] args) {
		/* Wrapper classes
		 * Every  primitive data type have their respective class is known as wrapper classes
		 *  #primitive data types wrapper classes
			 *    byte - Byte
			 *    short=Short
			 *    int-Integer
			 *    long-Long
			 *    float-Float
			 *    double-Double
			 *    chat-Character
			 *    boolean-Boolean
		 */
		int a=500;// primitive type
		Integer k=400;//wrapper type
		
		/*
		 *------------------------#auto-boxing----------------------------------
		 *Conversion of primitive type into wrapper type is known as auto-boxing.
		 */
		int b=430;
		Integer p=b;//auto_boxing
		
		/*
		 *------------------------#auto-unboxing----------------------------------
		 *Conversion of wrapper type into primitive type is known as auto-unboxing.
		 */
		Double r=344.555;
		double m=r;//auto-unboxing
		System.out.println(Integer.toBinaryString(5000));
		System.out.println(Integer.toOctalString(5000));
		System.out.println(Integer.toHexString(5000));
		
		long y= Long.MAX_VALUE +1;

		
	}
	
	
}

