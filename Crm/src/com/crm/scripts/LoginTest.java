package com.crm.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.BaseLib;
import com.crm.generic.ExcelLib;
import com.crm.pageObject.LoginPage;
import com.crm.pageObject.PipelinePage;

public class LoginTest extends BaseLib
{
  @Test
  public void validLogin() throws InterruptedException 
  {
	  String filepath="./testData/testdata.xlsx";
	  ExcelLib elib= new ExcelLib(filepath);
	   String username = elib.readData("Sheet1",0 ,1);
	  String password = elib.readData("Sheet1", 0, 2);
	  
	  LoginPage lp= new LoginPage(driver);
//	  Thread.sleep(3000);
	  lp.login(username, password);
	  
	  Thread.sleep(3000);
	  
	  PipelinePage pp= new PipelinePage(driver);
	  Assert.assertTrue(pp.getPipelineEle().isDisplayed());
	  
	  String expectedHomePageTitle="Pipeline - Odoo";
	  String actualHomePageTitle=driver.getTitle();
	  Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
	  Reporter.log("Home Page is Verified", true);		  
  }
}
