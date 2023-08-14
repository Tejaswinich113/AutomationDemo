package com.javapractice.collections;

import java.util.HashSet;

public class CollectionPart2 {
	
	public static void main(String[] args) {
		HashSet<String> ref= new HashSet<String>();
		
		ref.add("Ram");
		ref.add("Rahim");
		ref.add("sham");
		ref.add("Ram");
		
		System.out.println(ref);
		
		
		HashSet<String> data= new HashSet<String>();
		data.add("Ram");
		data.add("Bhem");
		data.add("Chiru");
		data.add("Pawan");
		data.add("Ram");
		
		System.out.println(data);
		//data.clear(); // Here we are clearing all data
		
		System.out.println(data); // empty
	
		 System.out.println(data.remove("Bhem"));// nothing is there to remove return false
		
		 System.out.println(data);
	}

}