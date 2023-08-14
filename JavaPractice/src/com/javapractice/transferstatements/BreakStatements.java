package com.javapractice.transferstatements;

public class BreakStatements {
	
	public static void main(String[] args) {
		String [] data = new String[3];
		data[0]="Tejaswini";
		data[1]="Sekhar";
		data[2]="Hishal";
		
		for(String d:data) {
			if(d.equalsIgnoreCase("Tejaswini")){
				System.out.println(d);
				System.out.println("Required data is available");
				break;
			}
		}
		
		int i=0;
		while(i<=10) {
			if(i==3) {
				System.out.println(i);
				System.out.println("Required number is available");
				break;
			}
			i++;
		}
	}

}
