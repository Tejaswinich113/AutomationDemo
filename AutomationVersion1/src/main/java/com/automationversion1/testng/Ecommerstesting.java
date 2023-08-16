package com.automationversion1.testng;

public class Ecommerstesting {
	
	public void login() {
		System.out.println("Login Successfull");
	}
	
	public void searchproduct() {
		System.out.println("Product searched successfully");
	}
	
	public void addtocart() {
		System.out.println("Product successfully added to cart");
	}
	
	public void checkOutProduct() {
		System.out.println("Product successfully checked out");
	}
	
	public void logout() {
		System.out.println("Logout Successfully");
	}
	
	public static void main(String[] args) {
		
		Ecommerstesting prod = new Ecommerstesting();
		
		prod.login();
		
		prod.searchproduct();
		
		prod.addtocart();
		
		prod.checkOutProduct();
		
		prod.logout();
	}

}
