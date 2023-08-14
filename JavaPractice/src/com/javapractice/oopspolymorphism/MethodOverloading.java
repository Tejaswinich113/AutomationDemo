package com.javapractice.oopspolymorphism;

public class MethodOverloading {
	
	public void int1(int x) {
		System.out.println(x);
	}
	
	public void int1(String x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		MethodOverloading ref = new MethodOverloading();
		ref.int1("Tejaswini");
		ref.int1(25);
	}

}
