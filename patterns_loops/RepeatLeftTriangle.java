package com.nested.loops;

public class RepeatLeftTriangle {

	public static void main(String[] args) {

		int A = 0;
		for (int R = 1; R <= 5; R++) {

			if (R <= 3) {
				A++;
			} else {
				A--;
			}
			for (int i = 1; i <= A; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
