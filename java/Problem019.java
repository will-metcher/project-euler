package main;

import java.util.HashMap;

public class Problem019 {

	int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Problem019() {
		int sundays = 0;
		int day = 0;
		for(int year = 1901; year <= 2000; year++) {
			
			for(int m = 0; m < months.length; m++) {
				if(day % 7 == 5) {
					sundays++;
				}
				day += months[m];
				if(isLeapYear(year) && m == 1) {
					day++;
				}
			}
		}
		System.out.println(sundays);
	}
	
	public boolean isLeapYear(int year) {
		return (year % 4 == 0 ^ (year % 100 == 0 && year % 400 != 0));
	}
	
	public static void main(String[] args) {
		new Problem019();

	}

}
