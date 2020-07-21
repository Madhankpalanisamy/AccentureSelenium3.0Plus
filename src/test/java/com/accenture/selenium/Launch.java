package com.accenture.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Launch {
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumTestAutomation\\src\\test\\resources\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

	}

}
