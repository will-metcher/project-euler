package main;

import java.math.BigInteger;

public class Problem025 {

	public Problem025() {
	
		BigInteger t1 = BigInteger.ONE;
		BigInteger t2 = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		int i = 1;
		while(t1.toString().length() < 1000) {
			sum = t1.add(t2);
			t1 = t2;
			t2 = sum;
			i++;
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new Problem025();
	}

}
