package com.assignment_conditional;

public class LaptopPowerMode {

	public static void main(String[] args) {
		int BatteryPower = 100;
		if (BatteryPower > 90) {
			System.out.println("Laptop is in High Performance mode");
		} else if (BatteryPower < 90 && BatteryPower > 20) {
			System.out.println("Laptop is in low performance");
		} else {
			System.out.println("Laptop is in power saving mode");
		}

	}

}
