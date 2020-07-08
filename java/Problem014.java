package main;

public class Problem014 {
	public static void main(String args[]) {
		System.out.println(new Problem014().run());
	}

	public long run() {
		long longestChain = 0;
		int size = 0;
		for (long i = 1; i < 1000000; i++) {
			int c = collatz(i);
			if (c > size) {
				longestChain = i;
				size = c;
			}
		}
		return longestChain;
	}

	public int collatz(long n) {
		int length = 1;
		long start = n;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			length++;
		}
		return length;
	}
}
