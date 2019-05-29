
public class Problem001 {

	public static void main(String args[]) {
		System.out.println(new Problem001().run());
	}

	public String run() {
		int sum = 0;
		int max = 1000;

		for (int i = 1; i < max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return "The sum of all multiples of 3 or 5 below " + max + " is " + sum + ".";
	}
}
