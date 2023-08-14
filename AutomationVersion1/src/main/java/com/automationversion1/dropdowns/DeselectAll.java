package com.automationversion1.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeselectAll {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement fruits = driver.findElement(By.id("multiple-select-example"));
		
		Select fruit = new Select(fruits);
		
		fruit.selectByIndex(0);
		fruit.selectByValue("orange");
		fruit.selectByVisibleText("Peach");
		
		Thread.sleep(2000);
		
		fruit.deselectAll();
		
		Thread.sleep(2000);
		
		List<WebElement> options = fruit.getOptions();
		
		for(WebElement option : options)
			System.out.println(option.getText());
		
		driver.close();
	}

}
