package com.zeroBank.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.AccountSummary;
import com.zeroBank.qa.pages.HomePage;
import com.zeroBank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	AccountSummary accntSummary;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
	}
	
	@Test
	public void verifyHomePageTitle() {
		String title=homePage.getPageTitle();
		System.out.println("HomePage Title is ="+title);
		Assert.assertEquals(title, "Zero - Personal Banking - Loans - Credit Cards");
	}
	
	@Test
	public void verifySigninBtn() {
		Assert.assertTrue(homePage.verifySigninBtn());
	}
	
	@Test(priority=1)
	public void doClickOnOnlineBanking() {
		homePage.clickOnOnlineBanking();
	}
	
	@Test(priority=2)
	public void doClickOnFeedBack() {
		homePage.clickOnFeedBack();
	}
	
	@Test(priority=3)
	public void doclickOnMoreServices() {
		homePage.clickOnMoreServices();
	}
	
	@Test(priority=4)
	public void doClickOnAccActivity() {
		homePage.clickOnAccActivity();
	}
	
	@Test(priority=5)
	public void doClickOnTransferFund() {
		homePage.clickOnTransferFund();
	}
	
	@Test(priority=6)
	public void doClickOnMyMoneyMap() {
		homePage.clickOnMyMoneyMap();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
