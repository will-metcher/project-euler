package main;

public class Problem012 {

	public static void main(String args[]) {
		System.out.println(new Problem012().run());
	}
	
	public int run() {
		int count = 0;
		for(int i = 0; i < 99999999; i++) {
			count += i;
			if(!Utils.isPrime(count)) {
				if(Utils.getNumFactors(count) > 500) {
					return count;
				}
			}
		}
		return 0;
	}
}
