package com.javapractice.iterationstatements;


public class ForEachLoop {
	
	public static void main(String[] args) {
		String [] names = new String[5];
		names[0]="Tejaswini";
		names[1]="Sekhar";
		names[2]="Hishal";
		names[3]="Xyz";
		names[4]="Abc";
		
		for(String name:names)
			System.out.println(name);
	}

}
