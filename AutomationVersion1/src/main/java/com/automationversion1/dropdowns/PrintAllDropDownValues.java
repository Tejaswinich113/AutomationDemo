package com.automationversion1.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllDropDownValues {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement carslist = driver.findElement(By.id("carselect"));
		
		Select cars = new Select(carslist);
		
		List<WebElement> dropdownvalue = cars.getOptions();
		
		for(WebElement value : dropdownvalue) {
			System.out.println(value.getText());
		}
		
		driver.close();
	}

}
