package com.javapractice.conditionalstatements;

public class IfElseIfStatements {
	
	public static void main(String[] args) {
		String degree="Inter";
		if(degree.equals("B.tech"))
			System.out.println("Eligible for M.tech");
		else if(degree.equals("M.tech"))
			System.out.println("Eligible for PHD");
		else if(degree.equals("BBA"))
			System.out.println("Eligible for MBA");
		else
			System.out.println("Not eligible for any course");
	}

}
