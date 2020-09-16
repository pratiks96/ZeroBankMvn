package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zeroBank.qa.base.TestBase;

public class OnlineStatements extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Online Statements')]")
	WebElement onlineStatementTab;
	
	@FindBy(xpath="//a[contains(text(),'2011')]")
	WebElement year2011Tab;
	
	public OnlineStatements() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnlineStatement() {
		onlineStatementTab.click();
		
	}
	
	public void clickOnYear() {
		year2011Tab.click();
	}

}
