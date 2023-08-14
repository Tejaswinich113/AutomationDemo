package com.javapractice.javademo;

public class ReturnType1 {
	
	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static void mul(int b) {
		int a=add(10,20)*b;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		mul(20);
	}

}
