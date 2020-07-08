package main;

public class Problem017 {

	public static void main(String[] args) {
		System.out.println(new Problem017().run());
	}

	String[] numerals = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	String[] teens = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	String[] tens = { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public int run() {
		int total = 0;
		for (int i = 1; i < 1001; i++) {
			total += calcLength(String.valueOf(i));
		}
		return total;
	}

	public int calcLength(String n) {
		String ns = n;
		int length = 0;

		// Thousands
		if (n.length() == 4) {
			length += numerals[Character.getNumericValue(n.charAt(0)) - 1].length();
			length += "thousand".length();
			n = Utils.LStrip(n.substring(1), '0');
		}

		// Hundreds
		if (n.length() == 3) {
			length += numerals[Character.getNumericValue(n.charAt(0)) - 1].length();
			length += "hundred".length();
			if (Integer.parseInt(n) % 100 != 0) {
				length += "and".length();
			}
			n = Utils.LStrip(n.substring(1), '0');
		}

		// Tens
		if (n.length() == 2) {
			if (Integer.parseInt(n) > 19 || Integer.parseInt(n) == 10) {
				length += tens[Character.getNumericValue(n.charAt(0)) - 1].length();
				n = Utils.LStrip(n.substring(1), '0');
			} else {
				length += teens[Character.getNumericValue(n.charAt(1) - 1)].length();
				n = "0";
			}
		}

		// Ones
		if (n.length() == 1 && Integer.parseInt(n) != 0) {
			length += numerals[Character.getNumericValue(n.charAt(0)) - 1].length();
		}

		return length;
	}
}
