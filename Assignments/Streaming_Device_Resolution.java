package com.assignment_conditional;

public class Streaming_Device_Resolution {

	public static void main(String[] args) {
		int internetspeed = 1000;
		if (internetspeed < 200) {
			System.out.println("your internetspeed is " + internetspeed + ",so the resolution of video is 360p ");
		} else if (internetspeed >= 200 && internetspeed <= 500) {
			System.out.println("your internetspeed is " + internetspeed + ",so the resolution of video is 480p ");
		} else if (internetspeed > 500 && internetspeed <= 800) {
			System.out.println("your internetspeed is " + internetspeed + ",so the resolution of video is 720p ");
		} else {
			System.out.println("your internetspeed is " + internetspeed + ",so the resolution of video is 1080p ");
		}

	}

}
