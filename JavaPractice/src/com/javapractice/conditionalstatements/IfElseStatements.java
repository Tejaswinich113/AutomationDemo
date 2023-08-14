package com.javapractice.conditionalstatements;

public class IfElseStatements {
	
	public static void main(String[] args) {
		int age=20;
		if(age>=18)
			System.out.println("Eligible for choosing the leader");
		else
			System.out.println("Not Eligible for choosing the leader");
		
		String name="Tejaswini";
		if(name.indexOf('a')==7)
			System.out.println("A is present in the name Tejaswini");
		else
			System.out.println("A is not present in the name Tejaswini");
		
		int rank=1000;
		if(rank<=1000)
			System.out.println("Eligible to get seat in Govt college");
		else
			System.out.println("Eligible to get seat in private college");
	}

}
