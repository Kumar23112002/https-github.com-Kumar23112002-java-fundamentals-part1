package com.nested.loops;

public class RightSideTriangle {

	public static void main(String[] args) {

		int Space = 4;
		int Star = 0;

		for (int Row = 1; Row <= 4; Row++) {

			Star++;
			Space--;
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
