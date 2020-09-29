package com.crm.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedOppPage 
{
@FindBy(xpath="//button[contains(text(), 'Edit')]")
private WebElement editBtn;

@FindBy(xpath="(//div[@name='partner_id'])[2]//input")
private WebElement custDrpDwnTxtBx;


@FindBy(xpath="//ul[contains(@class, 'partner_autocomplete_dropdown')]")
private WebElement completeCustDrpDwn;

By ccname=By.tagName("li");


public CreatedOppPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getEditBtn() {
	return editBtn;
}


public WebElement getCustDrpDwnTxtBx() {
	return custDrpDwnTxtBx;
}


public WebElement getCompleteCustDrpDwn() {
	return completeCustDrpDwn;
}
 
public void createdOpp(String customerName)
{
	
	custDrpDwnTxtBx.click();

	 List<WebElement> options = completeCustDrpDwn.findElements(ccname);
	 for(WebElement option :options )
	 {
		 if(customerName.equals(option.getText()))
			 option.click();
		 
		 System.out.println(option);
	 }
}

}

