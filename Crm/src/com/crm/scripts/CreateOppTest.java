package com.crm.scripts;

import org.testng.annotations.Test;

import com.crm.generic.BaseLib;
import com.crm.generic.ExcelLib;
import com.crm.pageObject.LoginPage;
import com.crm.pageObject.PipelinePage;

public class CreateOppTest extends BaseLib
{
	@Test
	public void checkCompletedOpp() throws Exception 
	{
		
	//	WebDriver driver=null;
		String filepath="./testData/testdata.xlsx";
		ExcelLib elib=new ExcelLib(filepath);
		
		String username=elib.readData("Sheet1", 1, 1);
		String password=elib.readData("Sheet1", 1, 2);
		String opportunity = elib.readData("Sheet1", 2, 3);
		String expRevenue= elib.readData("Sheet1", 2, 4);
		String customerName=elib.readData("Sheet1", 1, 3);

//		String customerName1=elib.readData("Sheet1", 2, 5);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
		Thread.sleep(4000);
		
		PipelinePage pp= new PipelinePage(driver);
		pp.getCreateBtnPPage().click();
	//	
		Thread.sleep(3000);
		
		pp.createOpp(opportunity, customerName, expRevenue);
		Thread.sleep(4000);
}
}