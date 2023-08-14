package com.javapractice.javademo;

public class MethodDemo {
	int a=10;
	static int b=20;
	
	public void test() {
		int c=30;
		System.out.println(c);
	}
	
	public static void test1() {
		int d=40;
		System.out.println(d);
	}
	
	public void instancemethod() {
		System.out.println("Inside Instance method");
	}
	
	public static void staticmethod() {
		System.out.println("Inside static method");
	}
	
	public static void main(String[] args) {
		MethodDemo ref=new MethodDemo();
		System.out.println(ref.a);
		
		System.out.println(b);
		
		ref.test();
		
		test1();
		
		ref.instancemethod();
		
		staticmethod();
	}
	
}
