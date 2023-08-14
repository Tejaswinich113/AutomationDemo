package com.javapractice.collections;

import java.util.ArrayList;

public class Methods {
	
	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("Tejaswini");
		data.add("Sekhar");
		data.add("Hishal");
		
		System.out.println(data);
		
		data.remove(2);
		System.out.println(data);
		
		data.clear();
		System.out.println(data);
	}

}
