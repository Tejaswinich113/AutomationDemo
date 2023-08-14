package com.javapractice.oopsabstraction;

public abstract class AbstractDemo {
	
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void subtraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	abstract void multiplication(int a,int b);

}

class TestChild extends AbstractDemo{

	@Override
	void multiplication(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		TestChild tc = new TestChild();
		tc.addition(10,20);
		tc.subtraction(20, 10);
		tc.multiplication(10, 5);
	}
	
}
