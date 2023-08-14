package com.automationversion1.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.getWindowHandle();
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String window : allwindows) {
			driver.switchTo().window(window);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.letskodeit.com/courses")) {
				driver.manage().window().maximize();
				System.out.println("new window is opened");
				break;
			}
		}
	}

}
