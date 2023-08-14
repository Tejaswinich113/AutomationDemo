package com.automationversion1.radioandcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1 {
	
	public void checkradio(String reqcar) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> alllist = driver.findElements(By.xpath("//label/input[@type='radio']"));
		
		for(WebElement list : alllist) {
			String car = list.getAttribute("value");
			if(car.equals(reqcar)) {
				list.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		RadioButton1 radio = new RadioButton1();
		radio.checkradio("benz");
	}

}
