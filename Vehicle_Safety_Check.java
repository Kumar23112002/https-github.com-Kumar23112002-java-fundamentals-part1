package com.assignment_conditional;

public class Vehicle_Safety_Check {

	public static void main(String[] args) {
		boolean Seatbelt = true;
		boolean Brakes = true;
		if (Seatbelt) {
			System.out.println("your was weared a seat belt");
			if (Brakes) {
				System.out.println("your brakes is perfect condition");
			} else {
				System.out.println("your check your brakes and repair it quickly");
			}
		} else {
			System.out.println("you must wear seat belt & check your brakes otherwise fine is to pay");
		}

	}

}
