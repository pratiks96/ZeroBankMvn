package com.zeroBank.qa.TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.LoginPage;
import com.zeroBank.qa.pages.PayBills;

public class PayBillsTest extends TestBase {
	
	LoginPage loginPage;
	PayBills payBills; 
	
	WebElement payeeName, accType, currencyDropDown; 
	String ap="Apple"; 
	String cc="Credit Card";
	String Country="Denmark (krone)";
	
	public PayBillsTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		payBills=new PayBills();
		payBills.clickOnPayBill();
		
	}
	
	@Test(priority=1)
	public void verifyPayBillsPageTitle() {
		String title=payBills.getPageTitle();
		System.out.println("PayBillsPage Title is ="+title);
		Assert.assertEquals(title, "Zero - Pay Bills");
	}
	
	@Test(priority=2)
	public void verifyPaySavedPayee() {
		
		payBills.paySavedPayee(payeeName, ap, accType, cc);
	}
	
	@Test(priority=3)
	public void verifyAddNewPayee() {
		payBills.addNewPayee();
	}
	
	@Test(priority=4)
	public void verifPurchaseForeignCurrency() {
		
		payBills.purchaseForeignCurrency(currencyDropDown, Country);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
