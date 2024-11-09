package com.nested.loops;

public class Hour_Glass_NumPattern {

	public static void main(String[] args) {

		int num = 0;
		int values = 5, space = -1;

		for (int row = 1; row <= 7; row++) {

			space = (row <= 4) ? space + 1 : space - 1;
			values = (row <= 4) ? values - 1 : values + 1;
			num = (row <= 4) ? num + 1 : num - 1;

			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			int k = num;
			for (int i = 1; i <= values; i++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

}
