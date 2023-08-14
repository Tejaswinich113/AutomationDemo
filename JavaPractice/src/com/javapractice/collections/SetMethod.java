package com.javapractice.collections;

import java.util.ArrayList;

public class SetMethod {
	
	public static void main(String[] args) {
		
		ArrayList data = new ArrayList();
		data.add("Tejaswini");
		data.add("Chanduluri");
		data.add("Sekhar");
		data.add("Yeruva");
		data.add("Hishal");
		data.add("Yeruva");
		
		System.out.println(data);
		
		data.set(1, "Yeruva");
		System.out.println(data);
		
	}

}
