package com.assignment_conditional;

public class Mobile_Phone_Security_Check {

	public static void main(String[] args) {
		boolean password = true;
		boolean fingerprint = false;
		if (password) {
			System.out.println("your mobile is secured with a password");
		} else if (fingerprint) {
			System.out.println("your mobile is secured with a fingerprint");
		} else {
			System.out.println("your mobile is not secured,please secure it");
		}

	}

}
