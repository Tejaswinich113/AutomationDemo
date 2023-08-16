package com.automationversion1.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EcommersTestingUsingTestng {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login Successfull");
	}
	
	@Test(priority = 1)
	public void searchproduct() {
		System.out.println("Product searched successfully");
	}
	
	@Test(priority = 2 )
	public void addtocart() {
		System.out.println("Product successfully added to cart");
	}
	
	@Test(priority = 3)
	public void checkOutProduct() {
		System.out.println("Product successfully checked out");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout Successfully");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser closed successfully");
	}
}
