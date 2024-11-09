
package com.nested.loops;

public class LeftSideTriangle {

	public static void main(String[] args) {

		int ash = 0;

		// Line1
		ash++;
		for (int i = 1; i <= ash; i++)
			System.out.print("#");
		System.out.println();

		// Line2
		ash++;
		for (int i = 1; i <= ash; i++)
			System.out.print("#");
		System.out.println();

		// Line3
		ash--;
		for (int i = 1; i <= ash; i++)
			System.out.print("#");
		System.out.println();

		System.out.println("==========");

		int star = 0;

		for (int row = 1; row <= 5; row++) {

			star++;
			for (int i = 1; i <= star; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("===========");

		int A = 0;

		for (int row = 1; row <= 5; row++) {

			if (row <= 3) {
				A++;
			} else {
				A--;
			}
			for (int i = 1; i <= A; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
