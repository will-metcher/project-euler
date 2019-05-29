
public class Problem007 {

	public static void main(String args[]) {
		System.out.println(new Problem007().run());
	}

	public String run() {
		int target = 10001;

		int count = 0;
		for (int i = 2; i < 999999; i++) {
			if (Utils.isPrime(i)) {
				count++;
				if (count == target) {
					return "Answer: " + i;
				}
			}
		}
		return "";
	}
}
