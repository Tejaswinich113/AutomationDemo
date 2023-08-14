package com.automationversion1.radioandcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookRadio {
	
	public void facebbok(String reqsex) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> allradio = driver.findElements(By.xpath("//input[@type='radio']/../label"));
		
		for(WebElement radio : allradio) {
			String sex = radio.getText();
			if(sex.equals(reqsex)) {     //if(sex.equalsIgnoreCase(reqsex))  (case insensitive)
				radio.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FaceBookRadio ref = new FaceBookRadio();
		ref.facebbok("Male");
	}

}
