package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesTeamPage 
{
@FindBy(xpath="//button[contains(text(), 'Create')]")
private WebElement sTeamCreateBtn;

public SalesTeamPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getsTeamCreateBtn() {
	return sTeamCreateBtn;
}


}
