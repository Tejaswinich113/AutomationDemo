package com.automationversion1.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement cars = driver.findElement(By.id("carselect"));
		
		Select ref = new Select(cars);
		
		ref.selectByIndex(2);
		
		System.out.println(ref.getFirstSelectedOption().getText());
		
		driver.close();
	}

}
