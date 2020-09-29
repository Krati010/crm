package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateCustPage 
{
  @FindBy(xpath="//a[text()='Customers']")
  private WebElement custPage;
  
  public ValidateCustPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getCustPage() {
	return custPage;
}
  
  
}
