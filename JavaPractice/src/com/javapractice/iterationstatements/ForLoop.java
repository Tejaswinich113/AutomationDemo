package com.javapractice.iterationstatements;

public class ForLoop {
	
	public static void main(String[] args) {
		//to print 1 to 5 numbers without loop statement
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//with for loop
		for(int i=1;i<=5;i++)
			System.out.println(i);
		
		//to print 10 to1
		for(int j=10;j>=1;j--)
			System.out.println(j);
		
		//to print odd numbers
		for(int k=1;k<=10;k=k+2)
			System.out.println(k);
	}

}
