package com.javapractice.javademo;

public class VariablesLocationDemo {
	int a=10;//Instance Variables
	static int b=20;//static variables
	
	public static void main(String[] args) {
		int c=30;//Local variables
		
		VariablesLocationDemo ref=new VariablesLocationDemo();
		System.out.println(ref.a);
		System.out.println(b);
		System.out.println(c);
	}
}
