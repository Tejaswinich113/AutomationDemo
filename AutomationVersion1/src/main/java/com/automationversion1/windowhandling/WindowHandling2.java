package com.automationversion1.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String window : allwindows) {
			driver.switchTo().window(window);
			if(driver.getTitle().equals("All Courses")) {
				driver.findElement(By.xpath("//a[.='Sign In']")).click();
				driver.findElement(By.id("email")).sendKeys("tejamarych@gmail.com");
				driver.findElement(By.id("login-password")).sendKeys("Test@123");
				driver.findElement(By.id("login")).click();
			}
		}
		
		driver.switchTo().window(parentwindow);
		driver.quit();
	}

}
