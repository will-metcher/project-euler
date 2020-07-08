package main;

import java.math.BigInteger;

public class Problem016 {

	public static void main(String[] args) {
		System.out.println(new Problem016().run());
	}
	
	public int run() {
		int x = 1000;
		String[] digits = new BigInteger("2").pow(x).toString().split("");
		int sum = 0;
		for(String d : digits) {
			sum += Integer.parseInt(d);
		}
		return sum;
	}
}
