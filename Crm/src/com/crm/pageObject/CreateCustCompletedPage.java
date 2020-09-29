package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustCompletedPage 
{
	 @FindBy(linkText="//a[text()='Customers']")
	  private WebElement editBtn;
	 
	 public CreateCustCompletedPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	public WebElement getEditBtn() {
		return editBtn;
	}
	 
	
	 
	 
}
