package com.accenture.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest04 {
	WebDriver driver;
  @Test
  public void testMouseHover() {
	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	  //to get the unique id assigned to current window
	  String parentWindow = driver.getWindowHandle();
	  System.out.println(parentWindow);
	  
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
	  		"												Offices')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]"))).
	  click().build().perform();
	  //window handling
	  System.out.println("before switch:" + driver.getTitle());
	  for(String handle:driver.getWindowHandles()) {//parent window, sec window
		  System.out.println(handle);
		  driver.switchTo().window(handle);
		  
	  }
	  System.out.println("after switch:"+driver.getTitle());
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Contact Us");
	  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\GreenTech\\Driver's\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

  }

  @AfterClass
  public void afterClass() {
  //driver.close();// closes only the current window/tab
  driver.quit(); //closes all the tabs/windows opened during the test
  }

}
