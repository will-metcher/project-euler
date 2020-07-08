package main;

import java.math.BigInteger;

public class Problem015 {

	public static void main(String[] args) {
		System.out.println(new Problem015().run());
	}

	public String run() {
		BigInteger gridSize = new BigInteger("20");
		BigInteger quotient = factorial(gridSize).multiply(factorial(gridSize));
		BigInteger routes = factorial(new BigInteger("40")).divide(quotient);
		return routes.toString();
	}

	public BigInteger factorial(BigInteger n) {
		if (n == BigInteger.ZERO) {
			return BigInteger.ONE;
		} else {
			return (n.multiply(factorial(n.subtract(BigInteger.ONE))));
		}
	}

}
