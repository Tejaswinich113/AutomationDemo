package com.javapractice.oopsinheritence;

public class Parent {
	
	public void land() {
		System.out.println("10 acers of land");
	}
	
	public void property() {
		System.out.println("50 cents of place in hyderabad");
	}

}

class Child extends Parent {
	public void degree() {
		System.out.println("B.tech from KLU");
	}
	
	public static void main(String[] args) {
		
		Child ref = new Child();
		ref.land();
		ref.property();
		ref.degree();
	}
}