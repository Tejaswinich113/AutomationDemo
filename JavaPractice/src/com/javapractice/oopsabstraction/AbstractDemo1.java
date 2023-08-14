package com.javapractice.oopsabstraction;

public abstract class AbstractDemo1 {
	
	abstract void grandparent();
	
	abstract void parent();

}

class TestChild1 extends AbstractDemo1{

	@Override
	void grandparent() {
		System.out.println("This GrandParent method");
	}

	@Override
	void parent() {
		System.out.println("This is Parent method");
	}
	
	public static void main(String[] args) {
		TestChild1 tc1 = new TestChild1();
		tc1.grandparent();
		tc1.parent();
		
//		AbstractDemo1 ad1 = new AbstractDemo1(); // This will not work as there is no implementation in AbstractDemo1 class
//		ad1.grandparent();
//		ad1.parent();
		
		AbstractDemo1 ad1 = new TestChild1();  //This will work as implementation is present in TestChild1 class
		ad1.grandparent();
		ad1.parent();
	}
	
}
