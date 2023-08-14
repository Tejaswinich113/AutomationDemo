package com.javapractice.stringobject;

public class StringMethods1 {
	
	public static void main(String[] args) {
		
		String str ="Tejaswini";
		String str1="tejaswini";
		
		//equals()
		System.out.println(str.equals(str1));
		
		//equalsIngoneCase()
		System.out.println(str.equalsIgnoreCase(str1));
		
		//indexOf()
		System.out.println(str.indexOf('i'));
		
		//lastIndexOf()
		System.out.println(str.lastIndexOf('i'));
	}

}
