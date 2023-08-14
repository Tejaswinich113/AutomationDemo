package com.automationversion1.sycronization_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/signin");
		
		driver.findElement(By.name("email")).sendKeys("testingdemo@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
		WebElement message = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()=' Welcome Testing ']"))));
		
		System.out.println(message.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(message));
		
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}

}
