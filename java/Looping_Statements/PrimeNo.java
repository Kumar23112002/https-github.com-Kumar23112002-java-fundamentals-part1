package com.java.loops;

public class PrimeNo {

	public static void main(String[] args) {

		int count = 0;
		int givenNum = 3;
		for (int i = 2; i <= givenNum; i++) {
			if (givenNum % i == 0) {
				count++;
			}
		}
		if (count == 1)
			System.out.println(givenNum + " is prime");
	}
}
