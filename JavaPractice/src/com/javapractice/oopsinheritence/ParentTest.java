package com.javapractice.oopsinheritence;

public class ParentTest {
	
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}

}

class Child1 extends ParentTest{
	
	public static void main(String[] args) {
		Child1 ref = new Child1();
		ref.m1();
	}
}

class Child2 extends ParentTest{
	
	public static void main(String[] args) {
		Child2 ref1 = new Child2();
		ref1.m2();
	}
}