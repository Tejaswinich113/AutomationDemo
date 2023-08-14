package com.javapractice.stringobject;

public class StringMethods {
	
	public static void main(String[] args) {
		String name="Tejaswini";
		
		//length()
		System.out.println(name.length());
		
		//charAt()
		System.out.println(name.charAt(5));
		//System.out.println(name.charAt(10)); //if we are trying to print the index values which is not in the range it is going to give "string index out of bound exception".
		
		//toLowerCase()
		System.out.println(name.toLowerCase());
		
		//toUppercase()
		System.out.println(name.toUpperCase());
		
		//compareTo()
		String name2="tejaswini";
		
		System.out.println(name.compareTo(name2));
		
		String s="Tejaswini@123";
		String s1="Sekhar#123";
		System.out.println(s.compareTo(s1));
		
		String s2="Tejaswini@123";
		String s3="Tekhar#123";
		System.out.println(s2.compareTo(s3));
		
		//trim()
		String str="    tejaswini     ";
		System.out.println(str);
		System.out.println(str.trim());
		
		String str1="    Tejaswini Sekhar   ";  //(only one space between the two strings)
		System.out.println(str1);
		System.out.println(str1.trim());  
		System.out.println(str1.trim().length());
		
		String str2="     Tejaswini  Sekhar   ";
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());  //two spaces between the two strings
		
	}

}
