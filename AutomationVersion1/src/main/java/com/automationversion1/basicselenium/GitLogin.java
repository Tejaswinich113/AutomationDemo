package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		driver.manage().window().maximize();
		
		WebElement loginid = driver.findElement(By.id("login_field"));
		
		loginid.sendKeys("Testing@gmail.com");
		
		Thread.sleep(2000);
		
		loginid.clear();
		
		Thread.sleep(2000);
		
		loginid.sendKeys("testing123@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
