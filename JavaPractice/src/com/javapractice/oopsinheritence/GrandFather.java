package com.javapractice.oopsinheritence;

public class GrandFather {
	
	public void asset() {
		System.out.println("Asset");
	}
	
	public void properties() {
		System.out.println("Properties");
	}

}

class Father extends GrandFather{
	
	public void position() {
		System.out.println("Position");
	}
	
	public void Houses() {
		System.out.println("Duplex houses");
	}
}

class Children extends Father{
	
	public void rank() {
		System.out.println("Secured 1000 rank in Jee mains");
	}
	
	public void college() {
		System.out.println("Selected in IIT Karakpur college");
	}
	
	public static void main(String[] args) {
		Children ref = new Children();
		
		ref.asset();
		ref.position();
		ref.college();
	}
}