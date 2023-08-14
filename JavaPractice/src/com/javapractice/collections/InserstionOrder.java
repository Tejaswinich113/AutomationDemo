package com.javapractice.collections;

import java.util.ArrayList;

public class InserstionOrder {
	
	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("Tejaswini");
		data.add("Sekhar");
		data.add("Hishal");
		data.add(25);
		data.add("Tejaswini");   //Duplicate values are allowed and inserstion order is same
		
		System.out.println(data);
	}

}
