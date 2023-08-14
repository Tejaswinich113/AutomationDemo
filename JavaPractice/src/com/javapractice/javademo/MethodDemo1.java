package com.javapractice.javademo;

public class MethodDemo1 {
	public void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	
	public void add1(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub1(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		MethodDemo1 ref = new MethodDemo1();
		ref.add();
		ref.sub();
		ref.add1(10, 48);
		ref.sub1(190, 150);
	}

}
