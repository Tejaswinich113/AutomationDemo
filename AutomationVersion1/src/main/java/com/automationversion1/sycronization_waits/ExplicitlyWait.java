package com.automationversion1.sycronization_waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/waits");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.close();
	}

}
