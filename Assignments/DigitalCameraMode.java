package com.assignment_conditional;

public class DigitalCameraMode {

	public static void main(String[] args) {
		boolean Brightlight = false;
		boolean lowlight = true;
		boolean darklight = false;
		if (Brightlight) {
			System.out.println("Camera is HDR");
		} else if (lowlight) {
			System.out.println("Camera is normal");
		} else if (darklight) {
			System.out.println("Camera is Nightmode");
		}
	}

}
