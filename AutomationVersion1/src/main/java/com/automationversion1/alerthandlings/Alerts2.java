package com.automationversion1.alerthandlings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("name")).sendKeys("Tejaswini");
		
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert ref = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(ref.getText());
		
		ref.dismiss();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
