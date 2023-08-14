package com.javapractice.arrayconcepts;

public class StringConcepts1 {
	
	//Trying to provide values more than the specified length. Array index out of bound exception
	public static void main(String[] args) {
		char ch[] = new char[3];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		
		for(char c:ch)
			System.out.println(c);
		
	//Trying to provide values more than the specified length and trying to print the value which is not in range.
		
		String str[] = new String[3];
		str[0]="Hyderabad";
		str[1]="Chennai";
		str[2]="Pune";
		
		for (String city:str)
			System.out.println(city);
		
		System.out.println(str[3]);
	}

}
