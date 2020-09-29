package com.crm.scripts;

import org.testng.annotations.Test;

import com.crm.generic.BaseLib;
import com.crm.generic.ExcelLib;
import com.crm.pageObject.CreateNewCustPage;
import com.crm.pageObject.CustomerPage;
import com.crm.pageObject.LoginPage;
import com.crm.pageObject.PipelinePage;

public class CreateCustTest extends BaseLib
{
	@Test
	public void checkCompletedCust() throws Exception 
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
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.login(username, password);
		
		Thread.sleep(3000);
		
		PipelinePage pp1= new PipelinePage(driver);
		pp1.getSalesEle().click();
		Thread.sleep(2000);
		pp1.getCustEle().click();
		
	Thread.sleep(3000);
		CustomerPage cp1=new CustomerPage(driver);
		cp1.getCreateEle().click();
		
		Thread.sleep(3000);
		
	CreateNewCustPage cncp1= new CreateNewCustPage(driver);
	cncp1.createCust(customerName, address, jobPosition, mobileNo, email);
	
//	Thread.sleep(5000);
//	
//	pp1.getSalesEle().click();
//	Thread.sleep(2000);
//	pp1.getMyPipelineEle().click();
//	Thread.sleep(2000);
//	
//	pp1.getCreateBtnPPage().click();
//	
//	Thread.sleep(2000);
	
	

}
}