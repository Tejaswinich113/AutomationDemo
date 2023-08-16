package com.automationversion1.testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertOrangeHRM {
	
	Properties pr;
	WebDriver driver;
	
	SoftAssert soft = new SoftAssert();
	
	@BeforeSuite
	public void dataSetup() throws IOException {
		
		String data_location = System.getProperty("user.dir");
		File file = new File(data_location + "\\Testdata.Properties");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		pr =new Properties();
		pr.load(buffer);
	}
	
	@BeforeTest
	public void chromeSetup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		String url = pr.getProperty("url");
		
		driver.get(url);
	}
	
	@BeforeClass
	public void login() {
		
		String username = pr.getProperty("username");
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		String password = pr.getProperty("password");
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String acturl = driver.getCurrentUrl();
		
		soft.assertEquals(expurl, acturl);
	}
	
	@Test
	public void adminPage() {
		
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(expurl, acturl);
		
		System.out.println("In Admin Page");
	}
	
	@Test
	public void leavePage() {
		driver.findElement(By.xpath("//span[.='Leave']")).click();
		
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(expurl, acturl);
		
		System.out.println("In Leave Page");
	}
	
	@AfterClass
	public void logout() {
		
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String acturl = driver.getCurrentUrl();
		
		soft.assertEquals(expurl, acturl);
		
		soft.assertAll();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
