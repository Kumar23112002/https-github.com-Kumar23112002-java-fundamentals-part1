package com.nested.loops;

public class LeftUpTriangle {

	public static void main(String[] args) {

		int Space = 4;

		for (int Row = 1; Row <= 3; Row++) {

			Space--;
			for (int i = 1; i <= Space; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
