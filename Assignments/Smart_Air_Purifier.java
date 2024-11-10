package com.assignment_conditional;

public class Smart_Air_Purifier {

	public static void main(String[] args) {
		int AQI = 3;
		if (AQI <= 10 && AQI >= 7) {
			System.out.println("high purifing mode");
		} else if (AQI < 7 && AQI > 3) {
			System.out.println("medium purifing mode");
		} else if (AQI <= 3 && AQI > 0) {
			System.out.println("Low purifing mode");
		}

	}

}
