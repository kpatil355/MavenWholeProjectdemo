package com.medimentionTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.medimention.Pageobject.CreateAccount;
import com.medimention.Pageobject.HomePage;
import com.medimention.Pageobject.MainPage;

public class TC_Registration extends BaseClass{

	@Test
	public void account_register() throws InterruptedException
	{
		//WebDriver dd = new ChromeDriver();
		MainPage mp = new MainPage(dd);
		HomePage hp = new HomePage(dd);
		CreateAccount ca = new CreateAccount(dd);
		//this.dd.manage().timeouts().implicitlyWait(Duration.oSeconds(15));
		String pass = randomstring() + randomNumber();
		mp.aboutbtn();
		Thread.sleep(1000);
		mp.Features();
		Thread.sleep(1000);
		mp.Bottom();
		Thread.sleep(1000);
		mp.homebtn();
		hp.joinusclick();
	ca.userrole();
	ca.optionselect();
	ca.detailname(randomstring());
	ca.username(randomalphanum());
	ca.email(randomstring()+"@gmail.com");
	ca.password(pass);
	ca.confirmpass(pass);
	//Thread.sleep(4000);
	ca.checkbox();
	//Thread.sleep(5000);
	WebElement register = dd.findElement(By.xpath("//span[text()='Register']"));
//  WebElement register;
//	WebDriverWait wait = new WebDriverWait(dd, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(register)).click();

	JavascriptExecutor js = (JavascriptExecutor) dd;
	js.executeScript("arguments[0].click();", register);
	Thread.sleep(4000);	

	//dd.navigate().back();
		ca.goback();
		Thread.sleep(4000);
		hp.login();
		ca.userusername("Komal123");
		
		ca.useruserpass("12345678");
		
		Thread.sleep(2000);
		
		hp.userloginbtn();

	}

	
	
	
	

	
	
	
	
}
