package com.automationversion1.radioandcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public void checkboxselect(String reqcheckcar) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("https://www.letskodeit.com/practice"));
		
		for(WebElement checkbox: allcheckbox) {
			String checkcar = checkbox.getAttribute("id");
			if(checkcar.equals(reqcheckcar)) {
				checkbox.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		CheckBox ref = new CheckBox();
		
		ref.checkboxselect("benzcheck");
	}
}
