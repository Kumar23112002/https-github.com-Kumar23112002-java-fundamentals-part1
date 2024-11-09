package com.nested.loops;

public class SpecialTriangle {

	public static void main(String[] args) {

		int space = 4;
		int values = -1;

		for (int row = 1; row <= 4; row++) {

			space--;
			values += 2;
			int k = row;
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= values; i++) {

				if (i <= (values / 2))
					System.out.print(k--);
				else
					System.out.print(k++);
			}
			System.out.println();
		}

	}

}
