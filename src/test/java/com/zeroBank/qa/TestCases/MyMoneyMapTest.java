package com.zeroBank.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zeroBank.qa.base.TestBase;
import com.zeroBank.qa.pages.LoginPage;
import com.zeroBank.qa.pages.MyMoneyMap;

public class MyMoneyMapTest extends TestBase {
	
	LoginPage loginPage;
	MyMoneyMap myMoneyMap;
	
	
	public MyMoneyMapTest()  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		myMoneyMap=new MyMoneyMap();
	}
	
	@Test(priority=1)
	public void verifyMYMoneyMapTitle() {
		myMoneyMap.clickOnMyMoneyMap();
		String title=myMoneyMap.getPageTitle();
		System.out.println("MyMoneyMap Title is ="+title);
		Assert.assertEquals(title, "Zero - My Money Map");
	}
	
//	@Test(priority=2)
//	public void verifygetText() {
//		myMoneyMap.clickOnMyMoneyMap();
//		String text=myMoneyMap.getPageText();
//		System.out.println("MyMoneyMap Title is ="+ text);
//		Assert.assertEquals(text, "OutFlow Chart");
//	}
	
	@Test(priority=3)
	public void verifyChooseAccType()  {
		myMoneyMap.clickOnMyMoneyMap();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
