package com.medimentionTestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver dd;
	
@BeforeClass
 public void setUp()
 {
	dd= new ChromeDriver();
	dd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	dd.manage().deleteAllCookies();
	dd.get("https://medimention.com/");
	dd.manage().window().maximize();
 }
 @AfterClass
 public void teardown()
 {
	 dd.quit();
 }
 
 public String randomstring()
 {
	 String generatString = RandomStringUtils.randomAlphabetic(6);
	 return generatString;
			 
 }
 
 public String randomNumber()
 {
	 String generateNumber = RandomStringUtils.randomNumeric(7);
	 return generateNumber;
 }
 
 public String randomalphanum()
 {
	 String generatalphanum = RandomStringUtils.randomAlphanumeric(14);
	 return generatalphanum;
 }
 
 
}