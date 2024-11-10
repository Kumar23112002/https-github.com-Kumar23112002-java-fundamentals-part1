package com.assignment_conditional;

public class Wifi_Signal_Strength {

	public static void main(String[] args) {
		int signal = 100;
		if (signal >= 75) {
			System.out.println("signal strength is high");
		} else if (signal < 75 && signal > 25) {
			System.out.println("signal strength is medium");
		} else {
			System.out.println("signal strength is weak");
		}
	}

}
