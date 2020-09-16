package com.zeroBank.qa.TestCases;

import org.openqa.selenium.WebElement;
import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.AccountActivity;
import com.zeroBank.qa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class AccountActivityTest extends TestBase {
	
	LoginPage loginPage;
	AccountActivity accActivity;
	
	WebElement accType;
	String ch="Checking";
	String sa="Savings";
	String lo="Loan";
	String cc="Credit Card";
	String br="Brokerage";
	
	public AccountActivityTest()  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		accActivity=new AccountActivity();
		accActivity.selectAccActivityTab();
	}
	
	@Test(priority=1)
	public void verifyCheckingOption()  {
		
		
		
		accActivity.showTransactionTab(accType,ch );
	}
	
	@Test(priority=2)
	public void verifySavingsOption() {
        
		
		accActivity.showTransactionTab(accType,sa );
		
	}
	
	@Test(priority=3)
	public void verifyLoanOption() {
        
		
		accActivity.showTransactionTab(accType,lo );
		
	}
	
	@Test(priority=4)
	public void verifyCreditCardOption() {
        
		
		accActivity.showTransactionTab(accType,cc );
		
	}
	
	@Test(priority=5)
	public void verifybrokerageOption() {
        
		
		accActivity.showTransactionTab(accType,br );
		
	}
	
	@Test(priority=6)
	public void verifyfindTransaction() {
		accActivity.findTransactionTab();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
