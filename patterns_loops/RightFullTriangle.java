package com.nested.loops;

public class RightFullTriangle {

	public static void main(String[] args) {

		int Space = 3;
		int Star = 0;

		for (int row = 1; row <= 5; row++) {

			if (row <= 3) {
				Space--;
				Star++;
			} else {
				Space++;
				Star--;
			}
			for (int i = 1; i <= Space; i++) {
				System.out.print("  ");

			}
			for (int i = 1; i <= Star; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
