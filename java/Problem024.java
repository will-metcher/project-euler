package main;

import java.util.ArrayList;
import java.util.List;

public class Problem024 {
	public static void main(String args[]) {
		System.out.println(new Problem024().run());
	}
	
	public String run() {
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		String permutation = "";
		int remain = 1000000 - 1;
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(Integer n : digits) {
			numbers.add(n);
		}
		
		for(int i = 1; i < digits.length; i++) {
			int lengthFactorial = Utils.factorial(digits.length - i);
			int j = remain / lengthFactorial;
			remain = remain % lengthFactorial;
			permutation = permutation + numbers.get(j);
			numbers.remove(j);
			if(remain == 0) {
				break;
			}
		}
		
		for(Integer n : numbers) {
			permutation = permutation + n;
		}
		return permutation;
	}
}
