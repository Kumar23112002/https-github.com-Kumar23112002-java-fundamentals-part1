
package com.assignment_conditional;

public class SmartThermostat {

	public static void main(String[] args) {
		int CurrentTemperature = 10;
		if (CurrentTemperature >= 75) {
			System.out.println("thermostat is in high level");
		} else if (CurrentTemperature < 75 && CurrentTemperature > 25) {
			System.out.println("thermostat is in mid level");
		} else if (CurrentTemperature <= 25) {
			System.out.println("thermostat is in low level");
		}

	}

}
