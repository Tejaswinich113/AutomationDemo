package com.automationversion1.actionsclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mousehover).perform();
		
		driver.findElement(By.xpath("//a[.='Reload']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
