package com.crm.scripts;

import org.testng.annotations.Test;

import com.crm.generic.BaseLib;
import com.crm.generic.ExcelLib;
import com.crm.pageObject.CreateNewSalesTeam;
import com.crm.pageObject.LoginPage;
import com.crm.pageObject.PipelinePage;
import com.crm.pageObject.SalesTeamPage;

public class SalesTeamTest extends BaseLib
{
@Test
public void validSalesTeam() throws Exception
{
	String filepath="./testData/testdata.xlsx";
	ExcelLib elib=new ExcelLib(filepath);
	
	String username=elib.readData("Sheet1", 1, 1);
	String password=elib.readData("Sheet1", 1, 2);
	String salesTeamName = elib.readData("Sheet1", 3, 1);
	String teamLeader = elib.readData("Sheet1",3 ,2);
	String email = elib.readData("Sheet1",3 ,3 );
	String assignTo = elib.readData("Sheet1", 3, 4 );
	String acceptEmail = elib.readData("Sheet1", 3, 5 );
	
	
	
	LoginPage lp = new LoginPage(driver);
	lp.login(username, password);
	
	Thread.sleep(4000);
	
	PipelinePage pp= new PipelinePage(driver);
	pp.getConfigurationEle().click();
    pp.getSalesTeamEle().click();
	Thread.sleep(2000);
	
	SalesTeamPage stp= new SalesTeamPage(driver);
	stp.getsTeamCreateBtn().click();
	Thread.sleep(3000);
	
	CreateNewSalesTeam cnstp= new CreateNewSalesTeam(driver);
	cnstp.salesTeamData(salesTeamName, teamLeader, email, assignTo);
	Thread.sleep(3000);
	
	cnstp.getSaveBtnEle().click();
	Thread.sleep(7000);
	
	

}

}
