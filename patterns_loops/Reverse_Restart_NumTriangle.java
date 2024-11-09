package com.nested.loops;

public class Reverse_Restart_NumTriangle {

	public static void main(String[] args) {

		int value = 5;
		int space = -1;

		for (int row = 1; row <= 4; row++) {

			value--;
			space++;
			int k=row;
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= value; i++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}

	}

}
