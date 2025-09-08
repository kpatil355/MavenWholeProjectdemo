package com.medimention.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

	public MainPage(WebDriver dd) {
		super(dd);
	}
		
		@FindBy(xpath ="//a[text()='Home']")
		WebElement homebtn;

	
		@FindBy(xpath ="//a[text()='About']")
		WebElement aboutbtn;		
		
		@FindBy(xpath ="//a[text()='Features']")
		WebElement Features;
		
		@FindBy(xpath ="//a[text()='Bottom']")
		WebElement Bottom;
		
		@FindBy(xpath ="//input[@id='banner-name']")
		WebElement yourname;
	
		
		public void aboutbtn()
		{
			aboutbtn.click();
		}

		
		public void Features()
		{
			Features.click();
		}
		
		
		public void Bottom()
		{
			Bottom.click();
		}
		
		
		public void homebtn()
		{
			homebtn.click();
		}
		
		
		
		
		
	}


