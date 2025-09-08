package com.medimention.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	 WebDriver dd;
	 
	public BasePage(WebDriver dd)
	{
		this.dd=dd;
		PageFactory.initElements(dd, this);
		dd.get("https://medimention.com/#google_vignette");
		dd.manage().window().maximize();
	}

	
	
}
