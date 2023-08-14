package com.javapractice.oopspolymorphism;

public class MethodOverloading1 {
	
	public void login(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println("customer Login Successfull");
	}
	
	public void login(String username, String password, String branch) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(branch);
		System.out.println("Admin login Successful");
	}
	
	public void login(String username, String password, String branch, String specalist) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(branch);
		System.out.println(specalist);
		System.out.println("Doctor login successful");
	}
	
	public static void main(String[] args) {
		MethodOverloading1 logn= new MethodOverloading1();
		
		logn.login("Test", "Test@123");
		
		logn.login("Admin", "admin@123", "Ameerpet");
		
		logn.login("doc", "Doc@123", "KPHP", "Cardiologist");
	}


}
