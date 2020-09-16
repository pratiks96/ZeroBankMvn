package com.zeroBank.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.AccountSummary;
import com.zeroBank.qa.pages.LoginPage;

public class AccountSummaryTest extends TestBase {
	
	AccountSummary accntSummary;
	LoginPage loginPage;
	
	public AccountSummaryTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		accntSummary=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		accntSummary=new AccountSummary();	
	}
	
	@Test(priority=1)
	public void doclickOnSavings() {
		accntSummary.clickOnsavings();
	}
	
	@Test(priority=2)
	public void doclickOnChecking() {
		accntSummary.clickOnChecking();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

}
	
}
