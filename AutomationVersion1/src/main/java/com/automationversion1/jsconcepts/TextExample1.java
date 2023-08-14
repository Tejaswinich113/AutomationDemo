package com.automationversion1.jsconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextExample1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.letskodeit.com/login");
		
		WebElement email = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("login-password"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].value='tejamarych@gmail.com", email);
		
		js.executeScript("arguments[0].value='Test@123';", password);
		
		js.executeScript("arguments[0].click();", driver.findElement(By.id("login")));
	}

}
