package com.nested.loops;

public class HollowRhombus {

	public static void main(String[] args) {

		int lines = 7;
		int Space = (lines/2)+1, Star = -1;

		for (int row = 1; row <= lines; row++) {

			Space = (row <= 4) ? Space - 1 : Space + 1;
			Star = (row <= 4) ? Star + 2 : Star - 2;

			for (int i = 1; i <= Space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= Star; i++) {
				if (row > 1 && row < lines) {
					if (i == 1 || i == Star) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
