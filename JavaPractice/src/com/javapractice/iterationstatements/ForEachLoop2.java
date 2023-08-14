package com.javapractice.iterationstatements;

import java.util.ArrayList;

public class ForEachLoop2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Tejaswini");
		names.add("Sekhar");
		names.add("Hishal");
		names.add("Xya");
		
		System.out.println(names);
		
		/*
		 * for(String name:names) { if(name.equals("xya")) { names.remove("xya"); break;
		 * } } System.out.println(names);
		 */
	}

}
