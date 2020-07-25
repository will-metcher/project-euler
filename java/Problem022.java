package main;

import java.util.Arrays;

public class Problem022 {

	public Problem022() {
		String[] names = Utils.loadFile("p022_names").get(0).replace("\"", "").split(",");
		Arrays.sort(names);
		int sum = 0;
		for(int i = 0; i < names.length; i++) {
			sum += (alphabeticalValue(names[i]) * (i + 1));
		}
		System.out.println(sum);
	}
	
	public int alphabeticalValue(String s) {
		int sum = 0;
		char[] chars = s.toCharArray();
		for(char c : chars) {
			sum += ((int) c - 64);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		new Problem022();
	}

}
