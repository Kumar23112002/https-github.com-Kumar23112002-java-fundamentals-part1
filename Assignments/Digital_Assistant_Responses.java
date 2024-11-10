package com.assignment_conditional;

public class Digital_Assistant_Responses {

	public static void main(String[] args) {
		// Respond based on weather conditions
		String weathercondition = "Sunny";
		if (weathercondition.equals("raining")) {
			System.out.println("Don't forget your umbrella");
		} else if (weathercondition.equals("Sunny")) {
			System.out.println("Enjoy the sunshine");
		} else {
			System.out.println("Have a great day!");
		}
	}
}
