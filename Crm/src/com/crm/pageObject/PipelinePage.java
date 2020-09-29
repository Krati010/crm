package com.crm.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelinePage extends BasePage
{
  @FindBy(xpath="//li[text()='Pipeline']")
  private WebElement pipelineEle;
  @FindBy(xpath="//button[contains(text(),'Create')]")
  private WebElement createBtnPPage;
  @FindBy(name="name")
  private WebElement OppTxtBx;
  @FindBy(xpath="//label[text()='Customer']")                            //"//div[@name='partner_id']//input"
  private WebElement custTxtBx;
  @FindBy(xpath="//ul[2][@tabindex='0']") ////ul[contains(@class, 'autocomplete_dropdown')]
  private WebElement wholeDrpDwn;
//  @FindBy(xpath="(//td[text()='Anjiss'])[1]")
//  private WebElement singleCust;
 By custname = By.tagName("li");
//By aa=By.tagName("li"); 
//  @FindBy(xpath="//a[text()='Search More...']")
//  private WebElement searchMoreOptn;
  @FindBy(xpath="//div[@name='planned_revenue']//input")
  private WebElement revenueTxtBx;
  @FindBy(xpath="//button[text()='Edit']/preceding-sibling::button")
  private WebElement addBtn;
  @FindBy(xpath="//span[text()='2 Remote']")
  private WebElement createdOpp;
  @FindBy(xpath="//span[text()='My Pipeline']")
  private WebElement MyPipelineEle;
  
  @FindBy(xpath="//a[contains(text(), 'Configuration')]")
  private WebElement configurationEle;
  @FindBy(xpath="//span[text()='Sales Teams']")
  private WebElement salesTeamEle;
  
  public PipelinePage(WebDriver driver)
  {
	  super(driver);
	  PageFactory.initElements(driver, this);
  }
public WebElement getPipelineEle() {
	return pipelineEle;
}
public WebElement getCreateBtnPPage() {
	return createBtnPPage;
}
public WebElement getOppTxtBx() {
	return OppTxtBx;
}

public WebElement getCustTxtBx() {
	return custTxtBx;
}
//public WebElement getSearchMoreOptn() {
//	return searchMoreOptn;
//}
public WebElement getMyPipelineEle() {
	return MyPipelineEle;
}
public WebElement getWholeDrpDwn() {
	return wholeDrpDwn;
}
//public WebElement getSingleCust() {
//	return singleCust;
//}
public WebElement getRevenueTxtBx() {
	return revenueTxtBx;
}
public WebElement getAddBtn() {
	return addBtn;
}
public By getCustname() {
	return custname;
}
public WebElement getCreatedOpp() {
	return createdOpp;
}

public WebElement getConfigurationEle() {
	return configurationEle;
}

public WebElement getSalesTeamEle() {
	return salesTeamEle;
}
public void createOpp(String opportunity, String customerName, String expRevenue) throws Exception 
{
OppTxtBx.sendKeys(opportunity);
custTxtBx.click();
Thread.sleep(5000);
List<WebElement> options= wholeDrpDwn.findElements(custname);	
for (WebElement option : options)
{	
if(customerName.equals(option.getText()))
option.click();
System.out.println(option);
}
//WebDriver driver= null;
//List<WebElement> rows = driver.findElements(By.xpath("//div[@name='partner_id']//input"));
////for(int i=1; i<=rows.size(); i++)
////{
//// WebElement row = rows.get(customer);
////}
//int fullSize = rows.size();
//System.out.println(fullSize);
//for(int i=1; i<=rows.size(); i++)
//{
//  if (rows.get(i).getText().equals("customerName"))
//  {
//	  rows.get(i).click();
//  }
//}
 Thread.sleep(3000);
// revenueTxtBx.sendKeys(expRevenue);
// Thread.sleep(5000);
 addBtn.click();
 //createdOpp.click();
}
}
