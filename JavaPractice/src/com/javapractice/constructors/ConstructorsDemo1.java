package com.javapractice.constructors;

public class ConstructorsDemo1 {
	
	public ConstructorsDemo1(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void multiply(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ConstructorsDemo1 ref = new ConstructorsDemo1(20,12);
		ref.multiply(13, 10);
	}

}
