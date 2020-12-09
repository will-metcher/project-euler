package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
	
	public static boolean isPalindrome(String n) {
		return n.equals(new StringBuffer(n).reverse().toString());
	}

	public static boolean isPrime(int n) {
		if(n % 2 == 0 && n > 2) {
			return false;
		}
		for(int i = 3; i < Math.sqrt(n) + 1; i += 2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getNumFactors(int n) {
		int i = 1;
		int count = 0;
		while(i*i <= n) {
			if(n % i == 0) {
				count++;
			}
			i++;
		}
		return count * 2;
	}
	
	public static List<Integer> getFactors(int n) {
		List<Integer> factors = new ArrayList<Integer>();
		int i = 1;
		while(i < n) {
			if(n % i == 0) {
				factors.add(i);
			}
			i++;
		}
		return factors;
	}
	
	/**
	 * Removes leading characters from string
	 * 
	 * @param string string to perform on
	 * @param character the character to remove
	 * @return new string with leading characters removed
	 */
	public static String LStrip(String string, char character) {
		char[] chars = string.toCharArray();
		String newString = "";
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == character) {
				newString += "";
			} else {
				return newString + string.substring(i);
			}
		}
		return newString;
	}
	
	public static String getProjectPath() {
		return new File("").getAbsolutePath();
	}
	
	public static List<String> loadFile(String fileName) {
		try {
			File file = new File(getProjectPath()+"\\txt\\"+fileName+".txt");
			Scanner scanner = new Scanner(file);
			List<String> lines = new ArrayList<String>();
			while(scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
			scanner.close();
			return lines;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static int factorial(int n) {
		if(n < 0) {
			return 0;
		}
		int total = 1;
		for(int i = 1; i <= n; i++) {
			total *= i;
		}
		return total;
	}
}
