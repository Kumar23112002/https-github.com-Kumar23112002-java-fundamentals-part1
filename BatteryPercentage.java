
package com.assignment_conditional;

public class BatteryPercentage {

	public static void main(String[] args) {
		int BatteryPercentage = 25;
		int temperature = 40;
		if (temperature >= 35) {
			if (BatteryPercentage >= 30) {
				System.out.println(" Battery temperature and Battery is sufficient");
			} else {
				System.out.println("The battery is below 30% please charge");
			}

		} else if (BatteryPercentage >= 20) {
			System.out.println("the battery is  sufficient");
		}else {
			System.out.println("the battery is not sufficient");
		}

	}
}
