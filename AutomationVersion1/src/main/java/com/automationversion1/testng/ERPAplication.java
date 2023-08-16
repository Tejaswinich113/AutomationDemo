package com.automationversion1.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ERPAplication {
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login to ERP application Successfully");
	}
	
	@Test(priority = 2)
	public void addEmployee() {
		System.out.println("Employee added successfully");
	}
	
	@Test(priority = 1, enabled = false)
	public void deletEmployee() {
		System.out.println("Employee deleted successfully");
	}
	
	@Test(priority = 3)
	public void updateEmployee() {
		System.out.println("Employee updated successfully");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logout from ERP application successfully");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser closed successfully");
	}

}
