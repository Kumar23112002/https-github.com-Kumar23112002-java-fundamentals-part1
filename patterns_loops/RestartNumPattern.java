package com.nested.loops;

public class RestartNumPattern {

	public static void main(String[] args) {

		int value = 0;

		for (int row = 1; row <= 4; row++) {

			value++;
			int k = row;
			for (int i = 1; i <= value; i++) {
				System.out.print(k++);
			}
			System.out.println();
		}

	}

}
