package com.java.loops;

public class PrimeNumbers {

	public static void main(String[] args) {

		int total = 0;
		for (int i = 1; i <= 100; i++) {

			int countFactors = 0;
			for (int start = 2; start <= i; start++) {
				if (i % start == 0)
					countFactors++;
			}
			if (countFactors == 1) {
				System.out.println(i + " is a prime number");
				total++;
			}
		}
		System.out.println("Total prime number: " + total);
	}
}
