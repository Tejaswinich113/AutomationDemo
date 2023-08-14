package com.automationversion1.actionsclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionsSelectAll {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium" +Keys.ENTER);
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
