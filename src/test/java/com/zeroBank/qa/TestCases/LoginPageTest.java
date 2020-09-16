package com.zeroBank.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.AccountSummary;
import com.zeroBank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	AccountSummary accntSummary;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test
	public void verifyLoginPageTitle() {
		String title=loginPage.getPageTitle();
		System.out.println("LoginPage Title is ="+title);
		Assert.assertEquals(title, "Zero - Personal Banking - Loans - Credit Cards");
	}
	
//	@Test
//	public void verifyHeader() {
//		Assert.assertTrue(loginPage.getHeader());
//	}
	
	@Test(priority=1)
	public void verifyLoginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void verifyWrongLoginTest() {
		loginPage.login("username", "abscd");
	}
	
	@Test(priority=3)
	public void verifyForgotPasswordTest() {
		loginPage.forgotPassword();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
