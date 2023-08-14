package com.javapractice.constructors;

public class ConstructorsDemo {
	
	public ConstructorsDemo() {
		System.out.println("Open browser and launch the facebook url");
	}
	
	public void FacebookLogin() {
		System.out.println("provide login credentials for facebook application");
	}

	public static void main(String[] args) {
		ConstructorsDemo ref = new ConstructorsDemo();
		ref.FacebookLogin();
	}
	
	
}
