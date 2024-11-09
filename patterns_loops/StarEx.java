package com.nested.loops;

public class StarEx {

	public static void main(String[] args) {

		for (int row = 1; row <= 3; row++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		System.out.println("==========");

		for (int row = 1; row <= 2; row++) {
			for (int i = 1; i <= 3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
