package main;

import java.math.BigInteger;

public class Problem020 {

	public Problem020() {
		String[] num = factorial(new BigInteger("100")).toString().split("");
		int sum = 0;
		for(String c : num) {
			sum += Integer.parseInt(c);
		}
		System.out.println(sum);
	}
	
	public BigInteger factorial(BigInteger n) {
		if(n == BigInteger.ZERO) {
			return BigInteger.ONE;
		}
		return (n.multiply(factorial(n.subtract(BigInteger.ONE))));
	}
	
	public static void main(String[] args) {
		new Problem020();
	}

}
