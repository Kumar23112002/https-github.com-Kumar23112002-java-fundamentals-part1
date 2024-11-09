package com.nested.loops;

public class TriangleSpace {

	public static void main(String[] args) {

		int Space = 5, Star = 0;

		for (int row = 1; row <= 5; row++) {

			Space--;
			Star++;

			for (int i = 1; i <= Space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= Star; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
