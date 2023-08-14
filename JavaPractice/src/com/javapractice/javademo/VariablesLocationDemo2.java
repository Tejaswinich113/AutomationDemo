package com.javapractice.javademo;

public class VariablesLocationDemo2 {
	char ch='a';
	static char ch1='b';
	
	public void demo() {
		char ch2='c';
		System.out.println(ch2);
	}
	
	public static void main(String[] args) {
		VariablesLocationDemo2 ref=new VariablesLocationDemo2();
		System.out.println(ref.ch);
		
		System.out.println(ch1);
		
		ref.demo();
	}
}
