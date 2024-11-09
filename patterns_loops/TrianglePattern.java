package com.nested.loops;

public class TrianglePattern {

	public static void main(String[] args) {
		for (int R = 1; R <= 3; R++) {
			for (int C = 1; C <= R; C++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
