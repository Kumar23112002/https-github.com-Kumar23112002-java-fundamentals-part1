package com.java.loops;

public class For_Loop_Ex2 {

	public static void main(String[] args) {
		char c1 = 'Z';
		char c2 = 'A';
		for (int n = 1; n < 5; n++) {
			System.out.println("" + n + c1 + c2);
			c1--;
			c2++;
		}

	}

}
