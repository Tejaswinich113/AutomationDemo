package com.automationversion1.propertiesdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutTotalFileLocation {

	public static void main(String[] args) throws IOException {

		String file_location = System.getProperty("user.dir");

		System.out.println(file_location);

		File file = new File(file_location+"\\TestData.Properties");

		BufferedReader buffer = new BufferedReader(new FileReader(file));

		Properties pr = new Properties();

		pr.load(buffer);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String url = pr.getProperty("url");

		driver.get(url);

		driver.findElement(By.id("email")).sendKeys(pr.getProperty("username"));

		driver.findElement(By.id("login-password")).sendKeys(pr.getProperty("password"));

		driver.findElement(By.id("login")).click();

	}

}
