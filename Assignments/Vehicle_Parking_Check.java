package com.assignment_conditional;

// check if parking is allowed based on time and day.
public class Vehicle_Parking_Check {

	public static void main(String[] args) {
		String day = "saturday";
		double arrived = 8.00;
		double start_time = 7.00;
		double end_time = 22.00;
		if (!day.equalsIgnoreCase("Sunday") && (arrived >= start_time && arrived <= end_time)) {
			System.out.println("The parking area is open");
		} else {
			System.out.println("The parking area is closed");
		}
	}

}
