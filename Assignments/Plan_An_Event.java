package com.assignment_conditional;

public class Plan_An_Event {

	public static void main(String[] args) {
		int amount = 2326;
		if (amount > 0 && amount <= 500) {
			System.out.println("Save the money");
		} else if (amount > 500 && amount <= 2000) {
			System.out.println("Plan an event of movie&lunch in a restarunt");
		} else if (amount >2000 && amount <= 5000) {
			System.out.println("Plan an event to wondrella & park");
		} else if (amount > 5000) {
			System.out.println("Plan a kerala trip");
		} else {
			System.out.println("no money no honey");
		}

	}

}
