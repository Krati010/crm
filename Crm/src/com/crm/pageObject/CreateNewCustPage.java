package com.crm.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustPage 
{
	@FindBy(xpath="//input[@placeholder='Name']")
	  private WebElement nameTxtBx;
	//  @FindBy(xpath="//div[@name='parent_id']//input[@type='text']")
	  //private WebElement cmpnyDrpDwn;
	  //@FindBy(xpath="(//a[contains(text(), 'Create')])[1]")
	  //private WebElement createCmpnyName;
	  @FindBy(name="street")
	  private WebElement addLine1TxtBx;
	  @FindBy(name="function")
	  private WebElement jobPosTxtBx;
	  @FindBy(name="mobile")
	  private WebElement mobTxtBx;
	  @FindBy(name="email")
	  private WebElement emailTxtBx;
	  @FindBy(xpath="//button[contains(text(), 'Save')]")
	  private WebElement saveBtn;
	 
	@FindBy(xpath="//label[text()='Individual']")
	private WebElement individualRadioBtn;
	
	
	public CreateNewCustPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNameTxtBx() {
		return nameTxtBx;
	}
  //  public WebElement getCmpnyDrpDwn() {
	//	return cmpnyDrpDwn;
	//}
    
    //ublic WebElement getCreateCmpnyName() {
	//	return createCmpnyName;
//	}

	public WebElement getAddLine1TxtBx() {
		return addLine1TxtBx;
	}
    public WebElement getJobPosTxtBx() {
		return jobPosTxtBx;
	}
    public WebElement getMobTxtBx() {
		return mobTxtBx;
	}
    public WebElement getEmailTxtBx() {
		return emailTxtBx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	

	public WebElement getIndividualRadioBtn() {
		return individualRadioBtn;
	}
	
	public void createCust(String customerName, String address, String jobPosition, String mobileNo, String email ) throws InterruptedException
	  {
		  nameTxtBx.sendKeys(customerName);
		//  Thread.sleep(3000);
	//	 WebDriver driver=null;
	//	 cmpnyDrpDwn.sendKeys(companyName);
		// createCmpnyName.click();
		//  Select sel= new Select(cmpnyDrpDwn);
		 // sel.selectByVisibleText(companyName);
	//	    Alert alt = driver.switchTo().alert();
		//    alt.accept();
  
		  addLine1TxtBx.sendKeys(address);
		  jobPosTxtBx.sendKeys(jobPosition);
		  mobTxtBx.sendKeys(mobileNo);
		  emailTxtBx.sendKeys(email);
		//  Thread.sleep(3000);  
		  if(individualRadioBtn.isSelected()) //true
		  {
			  
		  }else
		  {
			  individualRadioBtn.click();
		  }
		//  Thread.sleep(3000);  
		  saveBtn.click();
		 // createBtn.click();
		  
	  }
}
