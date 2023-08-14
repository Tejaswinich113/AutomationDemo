package com.javapractice.collections;

import java.util.ArrayList;

public class Creation {
	
	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("Tejaswini");
		data.add("Sekhar");
		data.add(25);
		data.add(29);
		
		System.out.println(data); //To print the data in array format
		
		for(Object ref:data) {
			System.out.println(ref);
		} //To print data line by line
	}

}
