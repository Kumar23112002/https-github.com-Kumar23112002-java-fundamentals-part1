package com.nested.loops;

public class PyramidPattern {

	public static void main(String[] args) {

		int Space = 3;
		int Star = -1;

		for (int row = 1; row <= 3; row++) {

			Space--;
			Star += 2;
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
