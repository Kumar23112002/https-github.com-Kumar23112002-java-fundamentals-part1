package com.assignment_conditional;

public class Mobile_Phone_Backup_Status {

	public static void main(String[] args) {
		boolean Backup = true;
		double DataUsed = 0.4;// in GB
		double leftData = 2.6;// in GB
		double TotalData = (DataUsed) + (leftData);
		System.out.println("TotalData is: " + TotalData);
		System.out.println("leftData is : " + leftData);
		if ((Backup) && (leftData > 2.5 && leftData <= 2.90)) {
			System.out.println("Backup is needed ,the last Backup is 1month ago");
		} else {
			System.out.println("There is no backup is nedded");
		}
	}

}
