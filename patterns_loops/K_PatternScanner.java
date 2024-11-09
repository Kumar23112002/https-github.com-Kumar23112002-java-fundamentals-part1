package com.nested.loops;

import java.util.Scanner;

public class K_PatternScanner {

	public static void main(String[] args) {

		Scanner Sc;
		Sc = new Scanner(System.in);

		System.out.print("Enter the StarsCount=");
		int starsCount = Sc.nextInt();

		System.out.print("Enter rows =");
		int rows = Sc.nextInt();

		for (int row = 1; row <= rows; row++) {

			if (row <= rows/2+1) {
				starsCount--;
			} else {
				starsCount++;
			}

			for (int i = 1; i <= starsCount; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
