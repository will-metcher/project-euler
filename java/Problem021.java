package main;

import java.util.List;

public class Problem021 {

	public Problem021() {
		int amicableSum = 0;
		for(int n = 1; n < 10000; n++) {
			List<Integer> factors = Utils.getFactors(n);
			int sum = 0;
			for(int i : factors) {
				sum += i;
			}
			int newSum = 0;
			List<Integer> newFactors = Utils.getFactors(sum);
			for(int j : newFactors) {
				newSum += j;
			}
			
			if(n == newSum && n > sum) {
				amicableSum += n + sum;
			}
		}
		
		
		System.out.println(amicableSum);
	}
	
	public static void main(String[] args) {
		new Problem021();
	}

}
