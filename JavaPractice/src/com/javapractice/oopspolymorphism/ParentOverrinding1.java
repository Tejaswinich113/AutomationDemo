package com.javapractice.oopspolymorphism;

public class ParentOverrinding1 {
	
	public void marry() {
		System.out.println("Marry subbamma");
	}
	
	public void dowary() {
		System.out.println("1 cr dowry");
	}

}

class ChildCC extends ParentOverrinding1{
	
	public void marry() {
		System.out.println("Marry Rashmika");
	}
	
	public void dowary() {
		System.out.println("No Dowary");
	}
	
	public static void main(String[] args) {
		
		ParentOverrinding1 ref = new ParentOverrinding1();
		ref.marry();
		ref.dowary();
		
		ChildCC ref1 = new ChildCC();
		ref1.marry();
		ref1.dowary();
	}
}
