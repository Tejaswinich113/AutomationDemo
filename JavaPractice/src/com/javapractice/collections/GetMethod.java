package com.javapractice.collections;

import java.util.ArrayList;

public class GetMethod {
	
	public static void main(String[] args) {
		String [] str = new String[4];
		str[0]="1";
		str[1]="2";
		str[2]="3";
		str[3]="4";
		
		System.out.println(str[2]);
		
		ArrayList data = new ArrayList();
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		
		System.out.println(data.get(2));
	}

}
