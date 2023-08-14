package com.javapractice.oopsabstraction;

public interface InterfaceDemo {
	
	abstract void m1();
	
	abstract void m2();

}

class TestChild2 implements InterfaceDemo{

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		TestChild2 tc2 = new TestChild2();
		tc2.m1();
		tc2.m2();
		
		/*
		 * InterfaceDemo in = new InterfaceDemo(); //// This will not work as there is
		 * no implementation in InterfaceDemo1 class in.m1(); in.m2();
		 */
		
		InterfaceDemo in = new TestChild2();    //This will work as implementation is present in TestChild1 class
		in.m1();
		in.m2();
	}
	
}
