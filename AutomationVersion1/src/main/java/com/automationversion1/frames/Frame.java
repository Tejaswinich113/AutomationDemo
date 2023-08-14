package com.automationversion1.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement textbox = driver.findElement(By.id("name"));
		
		Actions ref = new Actions(driver);
		
		ref.moveToElement(textbox).perform();
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement drop = driver.findElement(By.id("selectnav2"));
		
		ref.moveToElement(drop).perform();
		
		Select dropdown = new Select(drop);
		
		dropdown.selectByVisibleText("Home");
	}

}
