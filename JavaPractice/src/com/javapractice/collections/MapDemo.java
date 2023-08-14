package com.javapractice.collections;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap data = new HashMap();
		data.put(1, "Tejaswini");
		data.put(2, "Sekhar");
		data.put(3, "Hishal");
		
		System.out.println(data);
		
		HashMap<Integer, Character> ref = new HashMap<Integer, Character>();
		ref.put(10, 'a');
		ref.put(11, 'b');
		ref.put(12, 'c');
		ref.put(12, 'd');
		
		System.out.println(ref);
	}

}
