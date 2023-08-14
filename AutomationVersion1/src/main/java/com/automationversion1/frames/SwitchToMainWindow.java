package com.automationversion1.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToMainWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/frame");

		driver.switchTo().frame("firstFr");

		driver.findElement(By.name("fname")).sendKeys("Tejaswini");

		driver.findElement(By.name("lname")).sendKeys("Sekhar");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));

		driver.findElement(By.name("email")).sendKeys("tejaswinisekhar@gmail.com");

		Thread.sleep(3000);
		
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//a[.='Watch tutorial']")).click();
        
        Thread.sleep(2000);
        
        driver.close();
	}

}
