package com.javapractice.oopspolymorphism;

public class ParentOverrinding {
	
	public void asset() {
		System.out.println("20 acers of lond");
	}
	
	public void m1() {
		System.out.println("m1 method in parent class");
	}

}

class ChildC extends ParentOverrinding{
	
	public void asset() {
		System.out.println("30 acers of land");
	}
	
	public void m2() {
		System.out.println("m2 method in child class");
	}
	
	public static void main(String[] args) {
		
		ChildC c = new ChildC();
		c.asset();
		c.m1();
		c.m2();
		
		ParentOverrinding p = new ParentOverrinding();
		p.asset();
	}
}