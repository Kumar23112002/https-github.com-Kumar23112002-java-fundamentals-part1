package com.nested.loops;

public class BasicStarPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("1task done");
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("2task done");
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("3task done");

		System.out.println("=====================");
		System.out.println("=====================");

		for (int row = 1; row <= 3; row++) {
			for (int i = 1; i <= 3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
