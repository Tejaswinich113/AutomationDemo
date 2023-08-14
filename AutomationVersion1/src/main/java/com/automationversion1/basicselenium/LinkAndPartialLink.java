package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAndPartialLink {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("testing@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Testing");
		
		driver.findElement(By.name("commit")).click();
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.findElement(By.partialLinkText("Create an")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
