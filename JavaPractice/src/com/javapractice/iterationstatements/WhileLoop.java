package com.javapractice.iterationstatements;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		//for loop
		System.out.println("For loop");
		for(int i=1;i<=5;i++)
			System.out.println(i);
		
		//while loop
		System.out.println("While loop");
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		//print testing 10 times
		int k=1;
		while(k<=10) {
			System.out.println(k+". Testing");
			k++;
		}
		
	}
	
}
