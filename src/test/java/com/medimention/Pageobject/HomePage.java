package com.medimention.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver dd) {
		super(dd);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//a[text()='Join Us']")
	WebElement joinus;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
		
	@FindBy(xpath="//button/span[text()='Login']")
	WebElement userloginbtn;
	
	
	public void joinusclick()
	{
		joinus.click();
	}
	
	public void login()
	{
		login.click();
	}
	
	public void   userloginbtn()
	{
		userloginbtn.click();
	}

	
}
