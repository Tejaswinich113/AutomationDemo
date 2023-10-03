package com.automationversion1.cssconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.cssSelector("#login_field")).sendKeys("tejaswinich113@gmail.com");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Teja@113");
		
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
