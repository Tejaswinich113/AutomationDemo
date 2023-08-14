package com.javapractice.collections;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();

		data.add("Tejaswini");
		data.add("Sekhar");
		data.add("Hishal");

		for (String ref:data) { 
			if(ref.equals("Hishal")) {
				System.out.println("Son of Sekhar and Tejaswini"); 
				} 
			}
	}

}
