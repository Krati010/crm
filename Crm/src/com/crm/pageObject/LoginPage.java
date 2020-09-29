package com.crm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
   @FindBy(id="login")
   private WebElement unTxtBx;
   
   @FindBy(id="password")
   private WebElement pwdTxtBx;
   
   @FindBy(css="button[type='submit']")
   private WebElement logInBtn;
   
   @FindBy(xpath="//div[text()='CRM']")
   private WebElement crmBtn;
   
   
 public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

      public WebElement getUnTxtBx() {
	   return unTxtBx;
}

       public WebElement getPwdTxtBx() {
	    return pwdTxtBx;
}
 
		public WebElement getLogInBtn() {
		return logInBtn;
	}

	public WebElement getCrmBtn() {
		return crmBtn;
	}

		public void login(String username, String password) throws InterruptedException 
         {
        	 unTxtBx.sendKeys(username);
        	 pwdTxtBx.sendKeys(password);
        	 logInBtn.click();
        	 Thread.sleep(3000);
        	 crmBtn.click();
        	 	 
        	 
         }
 
}
