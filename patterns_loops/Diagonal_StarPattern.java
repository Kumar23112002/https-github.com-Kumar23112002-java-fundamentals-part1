package com.nested.loops;

public class Diagonal_StarPattern {

	public static void main(String[] args) {

		for (int R = 1; R <= 5; R++) {

			for (int C = 1; C <= 5; C++) {
				if (R == C) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
