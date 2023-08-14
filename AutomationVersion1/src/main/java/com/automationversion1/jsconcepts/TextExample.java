package com.automationversion1.jsconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextExample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement textbox = driver.findElement(By.className("frmTextBox"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].value='testing';", textbox);
	}

}
