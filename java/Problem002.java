public class Problem002 {

	public static void main(String args[]) {
		System.out.println(new Problem002().run());
	}

	public String run() {
		int sum = 0;
		int max = 4000000;
		int t1 = 1;
		int t2 = 2;

		while (t1 <= max) {
			if (t1 % 2 == 0) {
				sum += t1;
			}

			int increase = t1 + t2;
			t1 = t2;
			t2 = increase;
		}

		return "Total = " + sum;
	}
}
