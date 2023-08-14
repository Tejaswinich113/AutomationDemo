package com.automationversion1.sycronization_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Tejaswini");
		
		driver.findElement(By.id("btn2")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sekhar");
		
		driver.close();
	}

}
