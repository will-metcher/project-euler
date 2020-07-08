package main;

public class Utils {
	public static boolean isPalindrome(String n) {
		if (n.equals(new StringBuffer(n).reverse().toString())) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int n) {
		if(n % 2 == 0 && n > 2) {
			return false;
		}
		for(int i = 3; i < Math.sqrt(n) + 1; i += 2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getNumFactors(int n) {
		int i = 1;
		int count = 0;
		while(i*i <= n) {
			if(n % i == 0) {
				count++;
			}
			i++;
		}
		return count * 2;
		
	}
}