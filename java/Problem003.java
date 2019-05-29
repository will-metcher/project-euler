
public class Problem003 {

	public static void main(String args[]) {
		System.out.println(new Problem003().run());
	}

	public String run() {
		long num = 600851475143L;
		int i = 2;

		while (i * i < num) {
			while (num % i == 0) {
				num /= i;
			}
			i++;
		}

		return "The largest prime factor of 600851475143 is " + num;

	}
}
