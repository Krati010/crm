package com.crm.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.BaseLib;
import com.crm.generic.ExcelLib;
import com.crm.pageObject.CreateCustCompletedPage;
import com.crm.pageObject.CreateNewCustPage;
import com.crm.pageObject.CreatedOppPage;
import com.crm.pageObject.CustomerPage;
import com.crm.pageObject.LoginPage;
import com.crm.pageObject.PipelinePage;
import com.crm.pageObject.ValidateCustPage;

public class SalesTest extends BaseLib
{

	@Test
	public void checkCompletedSales() throws Exception 
	{
		
	//	WebDriver driver=null;
		String filepath="./testData/testdata.xlsx";
		ExcelLib elib=new ExcelLib(filepath);
		
		String username=elib.readData("Sheet1", 1, 1);
		String password=elib.readData("Sheet1", 1, 2);
		String customerName=elib.readData("Sheet1", 1, 3);
		//String companyName=elib.readData("Sheet1", 1, 4);
		String address=elib.readData("Sheet1", 1, 5);
		String jobPosition=elib.readData("Sheet1", 1, 6);
		String mobileNo=elib.readData("Sheet1", 1, 7);
		String email=elib.readData("Sheet1", 1, 8);
		
		String opportunity = elib.readData("Sheet1", 2, 3);
		String expRevenue= elib.readData("Sheet1", 2, 4);
		String customerName1=elib.readData("Sheet1", 2, 5);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
		Thread.sleep(2000);
		
		PipelinePage pp= new PipelinePage(driver);
//		pp.getSalesEle().click();
		Thread.sleep(2000);
//		pp.getCustEle().click();
//		
//		Thread.sleep(3000);
//		CustomerPage cp=new CustomerPage(driver);
//		cp.getCreateEle().click();
//		
//		Thread.sleep(3000);
//		
//	CreateNewCustPage cncp= new CreateNewCustPage(driver);
//	cncp.createCust(customerName, address, jobPosition, mobileNo, email);
//	
//	Thread.sleep(5000);
//	
//	pp.getSalesEle().click();
//	Thread.sleep(2000);
//	pp.getMyPipelineEle().click();
//	Thread.sleep(2000);
//	
	pp.getCreateBtnPPage().click();
//	
	Thread.sleep(2000);
	
	pp.createOpp(opportunity, customerName1, expRevenue);
	Thread.sleep(4000);

//	CreatedOppPage cop= new CreatedOppPage(driver);
//	Thread.sleep(2000);
//			
//		cop.getEditBtn().click();
//		
//	Thread.sleep(2000);
//
//		cop.createdOpp(customerName);
			
//	pp.getOppTxtBx().sendKeys(opportunity);
	
	

//	Thread.sleep(3000);
//
//  pp.getRevenueTxtBx().sendKeys(expRevenue);
//  
//	Thread.sleep(2000);
//
//  
//  pp.getAddBtn().click();
	
	
//	CreateCustCompletedPage cccp=new CreateCustCompletedPage(driver);
//	cccp.getEditBtn();
	
	//pp.getSalesEle().click();
	//Thread.sleep(3000);
	//pp.getCustEle().click();
	//Thread.sleep(3000);
	
//	ValidateCustPage vcp= new ValidateCustPage(driver);
//	Assert.assertTrue(vcp.getCustPage().isDisplayed());
	
//	String expectedHomeTitlePage1="customerName";

	

//	String actualHomeTitlePage=driver.getTitle();
//	Assert.assertEquals(actualHomeTitlePage, expectedHomeTitlePage1);
//	Reporter.log("Home page is varified", true);
	
	
}
}
