package com.accenture.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTour {
	
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumTestAutomation\\src\\test\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	
  @Test
  public void launchurlandregistration() {
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
	  firstName.sendKeys("Madhan Kumar");
	  WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
	  lastName.sendKeys("Palanisamy");
	  WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
	  phone.sendKeys("+918098951396");
	  WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));
	  email.sendKeys("madhankpalanisamy@gmail.com");
	  WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
	  address.sendKeys("40/19 Thaddikkarasmay koil street alandur");
	  WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
	  address2.sendKeys("Chennai-600016");
	  WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	  city.sendKeys("Chennai");
	  WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	  state.sendKeys("Tamilnadu");
	  WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
	  postalCode.sendKeys("600016");
	  WebElement india = driver.findElement(By.xpath("//select[@name='country']"));
	  india.sendKeys("India");
	  WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
	  userName.sendKeys("Madhan");
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("Maddy@2020");
	  WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	  confirmPassword.sendKeys("Maddy@2020");
	  String currentUrl = driver.getCurrentUrl();
	  Assert.assertEquals(currentUrl, "http://newtours.demoaut.com/mercuryregister.php");
  }


@AfterClass
public void close() throws InterruptedException {
	Thread.sleep(5000);
	  driver.close();
}

}