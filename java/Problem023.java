package main;

import java.util.ArrayList;
import java.util.List;

public class Problem023 {

	public Problem023() {
		List<Integer> abundants = new ArrayList<Integer>();
		for(int i = 2; i <= 28123; i++) {
			if(isAbundant(i)) {
				abundants.add(i);
			}
		}
		
		List<Integer> sumsOfAbundants = new ArrayList<Integer>();
		
		for(int i = 0; i < abundants.size(); i++) {
			for(int j = i; j < abundants.size(); j++) {
				if(abundants.get(i) + abundants.get(j) <= 28123) {
					sumsOfAbundants.add(abundants.get(i) + abundants.get(j));
				} else {
					break;
				}
			}
		}
		
		int sum = 0;
		for(int i = 1; i <= 28123; i++) {
			if(!sumsOfAbundants.contains(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public boolean isAbundant(int n) {
		List<Integer> factors = Utils.getFactors(n);
		int sum = 0;
		for(int i : factors) {
			sum += i;
		}
		
		return sum > n;
	}
	
	public static void main(String[] args) {
		new Problem023();
	}

}
