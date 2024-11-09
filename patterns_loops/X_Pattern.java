package com.nested.loops;

public class X_Pattern {

	public static void main(String[] args) {

		int lines = 5;
		int Space = -1, Star = 7;

		for (int row = 1; row <= lines; row++) {

			Space = (row <= 3) ? Space + 1 : Space - 1;
			Star = (row <= 3) ? Star - 2 : Star + 2;

			for (int i = 1; i <= Space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= Star; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
