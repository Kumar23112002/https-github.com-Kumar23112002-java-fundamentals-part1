package com.nested.loops;

public class Cross_Star_Pattern {

	public static void main(String[] args) {

		for (int Row = 1; Row <= 5; Row++) {

			for (int C = 1; C <= 5; C++) {
				if (Row == C || (Row + C) == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
