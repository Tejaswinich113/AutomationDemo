package com.automationversion1.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDataProvider {
	
	WebDriver driver;
	
	@DataProvider(name = "OrangeHRMLoginData")
	public Object[][] getTestData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";
		
		return data;
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
	}
	
	@Test(dataProvider = "OrangeHRMLoginData")
	public void login(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")).click();
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		Thread.sleep(3000);
	}

}
