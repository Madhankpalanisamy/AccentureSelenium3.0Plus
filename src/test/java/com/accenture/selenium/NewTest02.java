package com.accenture.selenium;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewTest02 {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumTestAutomation\\src\\test\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	
  @Test
  public void launchURL() {
driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
//locating username field
WebElement username=driver.findElement(By.id("userName"));
//sending input to username field
username.sendKeys("Lalitha");

driver.findElement(By.id("password")).sendKeys("Password123");
driver.findElement(By.name("Login")).click();

	  }
  
  @AfterClass
  public void close() {
	  driver.close();
  }
}

