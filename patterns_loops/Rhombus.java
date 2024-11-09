package com.nested.loops;

public class Rhombus {

	public static void main(String[] args) {

		int Space = 3, Star = -1;

		for (int row = 1; row <= 5; row++) {

			Space = (row <= 3) ? Space - 1 : Space + 1;
			Star = (row <= 3) ? Star + 2 : Star - 2;

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
