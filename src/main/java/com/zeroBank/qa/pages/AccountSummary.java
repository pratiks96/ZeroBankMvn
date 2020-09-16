package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zeroBank.qa.base.TestBase;

public class AccountSummary extends TestBase {
	
	//Page Factory or Object repository (OR)
	
	@FindBy(xpath="//a[@href='/bank/account-activity.html?accountId=1\']")
	WebElement savings;
	
	@FindBy(xpath="//a[contains(text(),'Checking')]")
	WebElement checking;
	
	//Initializing the Page Object 
	public AccountSummary() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void clickOnsavings() {
		savings.click();
	}
	
	public void clickOnChecking() {
		checking.click();
	}


}
