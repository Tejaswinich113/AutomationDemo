package com.automationversion1.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select ref = new Select(dropdown);
		
		ref.selectByIndex(0);
		Thread.sleep(2000);
		ref.selectByValue("2");
		
		Thread.sleep(2000);
		
		System.out.println(ref.getFirstSelectedOption().getText());
		
		driver.close();
	}

}
