package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage
{
@FindBy(xpath="//a[text()='CRM']/parent::nav//a[contains(text(), 'Sales')]")
private WebElement SalesEle;

@FindBy(xpath="//span[text()='Customers']")
private WebElement custEle;

@FindBy(xpath="//button[contains(text(), 'Create')]")
private WebElement createElePPage;

public BasePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getSalesEle() {
	return SalesEle;
}


public WebElement getCustEle() {
	return custEle;
}


public WebElement getCreateElePPage() {
	return createElePPage;
}

}
