package com.zeroBank.qa.TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.LoginPage;
import com.zeroBank.qa.pages.TransferFund;

public class TransferFundTest extends TestBase {
	
	LoginPage loginPage;
	TransferFund transferFund;
	
	WebElement fromAccount, toAccount;
	int frmAcc=4;
	int toAcc=3;
	
	public TransferFundTest()  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		transferFund=new TransferFund();
		transferFund.clickOnTransferFund();
	}
	
	@Test(priority=1)
	public void verifyTransferFundPageTitle() {
		String title=transferFund.getPageTitle();
		System.out.println("TransferFundPage Title is ="+title);
		Assert.assertEquals(title, "Zero - Transfer Funds");
	}
	
	@Test(priority=2)
	public void verifyCheckingOption()  {
		
		transferFund.chooseAccType(fromAccount, frmAcc, toAccount, toAcc);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
