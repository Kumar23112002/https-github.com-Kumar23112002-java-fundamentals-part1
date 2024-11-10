package com.assignment_conditional;

public class Mobile_Phone_Call_Status {

	public static void main(String[] args) {
		String Signal1 = "5G";
		String Signal2 = "4G";
		String Signal3 = "3G";
		String Signal4 = "2G";
		String Signal_Recieved = Signal1;
		int battery = 26;
		if (Signal_Recieved.equals(Signal1)) {
			System.out.print(" your call performance is very good.");
			if (battery > 20) {
				System.out.println("your battery is Sufficient to take calls");
			} else {
				System.out.println("Your battery is not Sufficient to take calls");
			}
		}
		if (Signal_Recieved.equals(Signal2)) {
			System.out.print(" your call performance is good.");
			if (battery > 20) {
				System.out.println("your battery is Sufficient to take calls");
			} else {
				System.out.println("Your battery is not Sufficient to take calls");
			}
		}
		if (Signal_Recieved.equals(Signal3)) {
			System.out.print("your call performance is better.");
			if (battery > 20) {
				System.out.println("your battery is Sufficient to take calls");
			} else {
				System.out.println("Your battery is not Sufficient to take calls");
			}
		}
		if (Signal_Recieved.equals(Signal4)) {
			System.out.print("your call performance is bad.");
			if (battery > 20) {
				System.out.println("your battery is Sufficient to take calls");
			} else {
				System.out.println("Your battery is not Sufficient to take calls");
			}
		}
	}
}
