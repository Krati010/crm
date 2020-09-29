package com.crm.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewSalesTeam
{
@FindBy(name="name")
private WebElement salesTeamNameTxtBx;
@FindBy(xpath="//div[@name='use_opportunities']//label")
private WebElement chckBxEle;
@FindBy(xpath="//div[@name='user_id']//input")
private WebElement teamLeaderTxtBx;
@FindBy(xpath="(//ul[@tabindex='0'])[1]")
private WebElement allTeamLeaderEle;
@FindBy(name="alias_name")
private WebElement emailaliseTxtBx;
@FindBy(xpath="alias_contact")
private WebElement acceptEmailTxtBx;
@FindBy(xpath="//div[@name='alias_user_id']//input")
private WebElement assigntoTxtBx;
@FindBy(xpath="//button[contains(text(), 'Save')]")
private WebElement saveBtnEle;
@FindBy(xpath="(//a[contains(text(), 'Create and Edit')])[2]")
private WebElement createAndEditEle;
@FindBy(xpath="(//ul[@tabindex='0'])[3]")
private WebElement compDrpDwn;
//@FindBy(xpath="(//a[text()='swati'])[2]")
//private WebElement custEle;

By cust=By.tagName("li");
By tmLead=By.tagName("li");
public CreateNewSalesTeam(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getSalesTeamNameTxtBx() {
	return salesTeamNameTxtBx;
}
public WebElement getChckBxEle() {
	return chckBxEle;
}
public WebElement getTeamLeaderTxtBx() {
	return teamLeaderTxtBx;
}

public WebElement getAllTeamLeaderEle() {
	return allTeamLeaderEle;
}

public By getCust() {
	return cust;
}

public WebElement getEmailaliseTxtBx() {
	return emailaliseTxtBx;
}
public WebElement getAcceptEmailTxtBx() {
	return acceptEmailTxtBx;
}
public WebElement getAssigntoTxtBx() {
	return assigntoTxtBx;
}
public WebElement getCreateAndEditEle() {
	return createAndEditEle;
}
public WebElement getCompDrpDwn() {
	return compDrpDwn;
}
//public WebElement getCustEle() {
//	return custEle;
//}
public WebElement getSaveBtnEle() {
	return saveBtnEle;
}

public void salesTeamData(String salesTeamName, String teamLeader, String email,  String assignTo) throws Exception
{
	salesTeamNameTxtBx.sendKeys(salesTeamName);
//	Thread.sleep(2000);

//	if(chckBxEle.isSelected()) //true
//     {
//		
//     }
//	else 
//	{
//		chckBxEle.click();
//	}	
	Thread.sleep(3000);

	teamLeaderTxtBx.click();
	Thread.sleep(3000);
	
	List<WebElement> atle = allTeamLeaderEle.findElements(tmLead);
	for(WebElement a:atle)
	{
		if(teamLeader.equals(a.getText()))
				a.click();
	}
	Thread.sleep(3000);

	emailaliseTxtBx.sendKeys(email);
	Thread.sleep(3000);

	acceptEmailTxtBx.click();
	Thread.sleep(3000);
	Select sel= new Select(acceptEmailTxtBx);
//	sel.selectByVisibleText(acceptEmail);
	sel.selectByIndex(0);
//	sel.selectByVisibleText(arg0);
	
	assigntoTxtBx.sendKeys(assignTo);
	Thread.sleep(3000);
	assigntoTxtBx.click();
	Thread.sleep(3000);
	
	 List<WebElement> options = compDrpDwn.findElements(cust);
	 for(WebElement option: options)
	 {
		 if(assignTo.equals(option.getText()))
			 option.click();
	 }
	//	Thread.sleep(4000);

	//saveBtnEle.click();
}
}
