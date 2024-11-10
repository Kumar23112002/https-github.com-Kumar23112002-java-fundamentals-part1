package com.assignment_conditional;

public class SmartWatch_Notifications {

	public static void main(String[] args) {
		String notification1 = "instagram";
		String notification2 = "message";
		String notification3 = "call";
		String notification_received = "notification1";
		if (notification_received.equals("notification1")) {
			System.out.println("you are getting message from instagram ");
		} else if (notification_received.equals("notification2")) {
			System.out.println("you are getting a phone message");
		} else {
			System.out.println("you are getting a call,please attend the call");
		}
	}

}
