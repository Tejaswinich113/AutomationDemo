package com.javapractice.javademo;

public class ReturnType {
	
	public int add() {
		int a=10;
		int b=10;
		int c=a+b;
		return c;
	}
	
	public int sub() {
		int a=20;
		int b=80;
		int c=a-b;
		return c;
	}
	
	public int add1(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static int sub1(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static boolean voterid(int age) {
		boolean cond=false;
		if(age>=18) {
			cond=true;
		}
		else {
			cond=false;
			int voter=18-age;
			System.out.println("Come after "+ voter + " years");
		}
		return cond;
	}
	
	public static void main(String[] args) {
		ReturnType ref = new ReturnType();
		System.out.println(ref.add());
		System.out.println(ref.sub());
		System.out.println(ref.add1(20, 60));
		System.out.println(sub1(70, 10));
		System.out.println(voterid(10));
	}

}
