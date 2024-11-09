package com.nested.loops;

public class Restart_AplhabetPattern {

	public static void main(String[] args) {

		int chars = 0;
		char givench = 'D';

		for (int row = 1; row <= 4; row++) {

			chars++;
			char k = givench--;
			for (int i = 1; i <= chars; i++) {
				System.out.print(k++);
			}
			System.out.println();
		}
	}

}
