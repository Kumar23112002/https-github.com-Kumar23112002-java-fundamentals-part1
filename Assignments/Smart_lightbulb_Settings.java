package com.assignment_conditional;

public class Smart_lightbulb_Settings {

	public static void main(String[] args) {
		double time = 2.00;
		if (time >= 6.00 && time <= 18.00) {
			System.out.println("the light glow is light white colour");
		} else if (time > 18.00 && time <= 22.00) {
			System.out.println("the light glow is bright orange colour");
		} else {
			System.out.println("the light glow is dim blue light");
		}
	}
}
