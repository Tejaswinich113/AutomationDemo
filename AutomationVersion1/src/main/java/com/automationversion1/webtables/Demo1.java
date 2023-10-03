package com.automationversion1.webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		
		List<WebElement> tableheaders = table.findElements(By.tagName("th"));
		
		for(WebElement tableheader : tableheaders) {
			System.out.println(tableheader.getText());
		}
		
		List<WebElement> Rows = table.findElements(By.cssSelector("table>tr"));
		
		int size=Rows.size();
		
		if(size==3) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
      
		  for(WebElement row:Rows) {  //3 =1
			  List<WebElement> allcolumns=row.findElements(By.tagName("td"));
			  
			  String firstrowdata=allcolumns.get(0).getText();
			  
			  System.out.println(firstrowdata);
		  }
	}

}
