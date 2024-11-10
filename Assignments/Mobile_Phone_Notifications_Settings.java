package com.assignment_conditional;

public class Mobile_Phone_Notifications_Settings {

	public static void main(String[] args) {
		String notification1 = "Instagram";
		String notification2 = "Messages";
		String notification3 = "Whatsapp";
		String notification4 = "Call";
		String notification_recieved = notification3;
		if (notification_recieved.equals(notification1)) {
			System.out.println("you are getting an Instagram notification");
		} else if (notification_recieved.equals(notification2)) {
			System.out.println("you are getting a phone message notification");
		} else if (notification_recieved.equals(notification3)) {
			System.out.println("you are getting a whatsapp notification");
		} else {
			System.out.println("you are getting a call notification");
		}

	}

}
