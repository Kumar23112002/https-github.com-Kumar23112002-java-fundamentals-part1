package com.assignment_conditional;

public class Vehicle_Maintenance_Alert {

	public static void main(String[] args) {
		int mileage = 70;
		if (mileage > 60) {
			System.out.println(
					"your vehicle's mileage is " + mileage + " it is perfect condition no maintenance is needed");
		} else if (mileage < 60 && mileage >= 40) {
			System.out.println("your vehicle's mileage is " + mileage
					+ " it is better now but after sometimes it requires maintenance");
		} else {
			System.out.println("your vehicle's mileage is " + mileage + " it requires a maintenance");
		}

	}

}
