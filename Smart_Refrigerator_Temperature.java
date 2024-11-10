package com.assignment_conditional;

public class Smart_Refrigerator_Temperature {

	public static void main(String[] args) {
		int Temperature = 20;
		if (Temperature >= 30) {
			System.out.println("Temperature is hot");
		} else if (Temperature < 30 && Temperature > 10) {
			System.out.println("Temperature is medium");
		} else {
			System.out.println("Temperature is cool");
		}

	}

}
