package com.assignment_conditional;

public class Smart_Vaccum_Cleaner_Schedule {

	public static void main(String[] args) {
		int currentHour = 9;//time 24-format
		if (currentHour >= 8 && currentHour <= 10) {
			System.out.println("Scheduled for cleaning");
		} else {
			System.out.println("Not Scheduled to clean");
		}

	}

}
