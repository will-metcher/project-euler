
public class Problem004 {

	public static void main(String args[]) {
		System.out.println(new Problem004().run());
	}

	public String run() {
		int largest = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (Utils.isPalindrome(Integer.toString(i * j))) {
					if (i * j > largest) {
						largest = i * j;
					}
				}
			}
		}
		return "The largest palindrome made from the product of two 3-digit numbers is: " + largest;
	}
}
