package com.nested.loops;

public class PascalTriangle {

	public static void main(String[] args) {

		int space = 7, values = 0;

		for (int row = 1; row <= 7; row++) {

			space--;
			values++;

			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int i = 1; i <= values; i++) {
				System.out.print(num + " ");
				num = num * (row - i) / i;
			}

			System.out.println();
		}
	}
}
