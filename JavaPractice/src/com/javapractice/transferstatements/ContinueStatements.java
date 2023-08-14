package com.javapractice.transferstatements;

public class ContinueStatements {
	
	public static void main(String[] args) {
		
		String [] days= {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
		
		for(String day:days) {
			if(day.equalsIgnoreCase("wed")) {
				continue;
			}
			System.out.println(day);
		}
		
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May"};
		
		for(String mon:months) {
			if(mon.equalsIgnoreCase("mar"))
				break;
			System.out.println(mon);
		}
	}

}
