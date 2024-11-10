package com.assignment_conditional;

public class Mobile_Phone_Connectivity_Status {

	public static void main(String[] args) {
		boolean Wifi = false;
		boolean Cellulardata = true;
		if (Wifi) {
			System.out.println("you are connected to Wifi");
		} else if (Cellulardata) {
			System.out.println("you are connected to Cellulardata");
		}

	}

}
