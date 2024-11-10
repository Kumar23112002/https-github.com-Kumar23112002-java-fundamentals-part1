package com.assignment_conditional;

public class E_Reader_Battery_Check {

	public static void main(String[] args) {
		int battery = 23;
		if (battery >= 75) {
			System.out.println("battery has high performace");
		} else if (battery < 75 && battery > 25) {
			System.out.println("battery has medium performance");
		} else {
			System.out.println("battery has low performance");
		}

	}

}
