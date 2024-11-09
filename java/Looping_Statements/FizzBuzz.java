package com.java.loops;

public class FizzBuzz {

	public static void main(String[] args) {

		int num = 20;

		if (num % 3 == 0 && (num % 4 == 0)) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 4 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("No Fizz No Buzz");
		}
		System.out.println("============");
		System.out.println("============");

		int n = 20;

		if (n % 3 == 0) {
			if (n % 4 == 0)
				System.out.println("FizzBuzz");
			else
				System.out.println("Fizz");
		} else if (n % 4 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.print("No Fizz No Buzz");
		}
	}

}
