package com.javapractice.arrayconcepts;

public class StringCocepts {
	
	//to print entire array
	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		for(int num:numbers)
			System.out.println(num);
		
		//to print a specific value in an array
		String [] names=new String[4];
		names[0]="Tejaswini";
		names[1]="Sekhar";
		names[2]="Hishal";
		names[3]="true";
		
		System.out.println(names[3]);
	}

}
