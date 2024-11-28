package datatype;

import java.math.BigInteger;

public class BigNumbers {
	/*
	 * ---------------for big values----------------
	 *         a> BigInteger.
	 *         b> BigDecimal.
	 */
	public static void main(String[] args) {
		BigInteger a= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger c=a.add(b);//no a+b
		System.out.println(c);
	}
}
