package com.java.loops;

public class GradeSchool {

	public static void main(String[] args) {

		int percentage = 56;

		if (percentage >= 35 && percentage <= 100) {

			if (percentage > 90)
				System.out.println("A+ for " + percentage);

			else if (percentage > 75 && percentage <= 90)
				System.out.println("A for " + percentage);

			else if (percentage > 65 && percentage <= 75)
				System.out.println("B for " + percentage);

			else if (percentage > 50 && percentage <= 65)
				System.out.println("c for " + percentage);

			else
				System.out.println("PASS for " + percentage);

		} else if (percentage > 35) {
			System.out.println("FAIL");
		} else {
			System.out.println("Given percentage is INVALID and above 100 percentage given " + percentage);
		}

	}

}
