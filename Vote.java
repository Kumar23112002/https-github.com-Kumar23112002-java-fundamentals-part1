package com.assignment_conditional;

public class Vote {

	public static void main(String[] args) {
		int age = 23;
		String citizenship = "INDIA";
		if (age >= 18) {
			System.out.println("you are eligible for vote");
			if (citizenship.equals("INDIA")) {
				System.out.println("You are eligible to vote in India");
				if (age >= 21) {
					System.out.println("you are eligible to take alchol");
				} else {
					System.out.println("you are not eligible to take alchol");
				}
			} else {
				System.out.println("You are not eligible to vote in India");
			}
		} else {
			System.out.println("you are not eligible to vote");
		}

	}

}
