package com.assignment_conditional;

public class Smart_Coffee_Maker_Settings {

	public static void main(String[] args) {
		// Determine brew strength for a smart coffee maker.
		String brewstrength = "Regular";
		if (brewstrength.equals("Strong")) {
			System.out.println("Prepairing a strong coffee");
		} else if (brewstrength.equals("Regular")) {
			System.out.println("Prepairing a regular coffee");
		} else {
			System.out.println("Prepairing a decaf coffee");
		}

	}

}
