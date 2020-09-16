package com.zeroBank.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.LoginPage;
import com.zeroBank.qa.pages.OnlineStatements;

public class OnlineStatementsTest extends TestBase {
	
	LoginPage loginPage;
	OnlineStatements onlineStatements;
	
	public OnlineStatementsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		onlineStatements=new OnlineStatements();
		onlineStatements.clickOnlineStatement();
	}
	
	@Test(priority=1)
	public void verifyOnlineStatementTitle() {
		
		String title=onlineStatements.getPageTitle();
		System.out.println("OnlineStatements Title is ="+title);
		Assert.assertEquals(title, "Zero - Online Statements");
	}
	
	@Test(priority=2)
	public void clickOnYear() {
		onlineStatements.clickOnYear();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
