package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage 
{
  @FindBy(xpath="//button[contains(text(), 'Create')]")
  private WebElement createEle;
  
  
  public CustomerPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getCreateEle() {
	return createEle;
}

	  
  }

