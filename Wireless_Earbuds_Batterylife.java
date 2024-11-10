package com.assignment_conditional;

public class Wireless_Earbuds_Batterylife {

	public static void main(String[] args) {
		int Battery = 23;
		if (Battery >= 75) {
			System.out.println("best performance life");
		} else if (Battery < 75 && Battery >= 50) {
			System.out.println("better performance life");
		} else if (Battery < 50 && Battery > 25) {
			System.out.println("Better battery life");
		} else {
			System.out.println("Best battery life");
		}

	}

}
