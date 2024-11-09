package com.nested.loops;

public class ButterflyPattern {

	public static void main(String[] args) {

		int Star = 0;
		int Space = 5;

		for (int row = 1; row <= 5; row++) {

			if (row <= 3) {
				Star++;
				Space -= 2;
			} else {
				Star--;
				Space += 2;
			}
			for (int i = 1; i <= Star; i++) {
				System.out.print("*");
			}
			for (int i = 1; i <= Space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= Star; i++) {
				if (row == 3 && i == 3)
					System.out.print(" ");
				else 
					System.out.print("*");
			}
			System.out.println();

		}

	}
}
