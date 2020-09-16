package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zeroBank.qa.base.TestBase;

public class AccountActivity extends TestBase {
		
	@FindBy(xpath="//a[contains(text(),'Account Activity')]")
	WebElement accActivityTab;
	
	@FindBy(xpath="//a[contains(text(),'Find Transactions')]")
	WebElement findTransTab;
	
	@FindBy(name="accountId")
	WebElement accType;
	
	@FindBy(name="description")
	WebElement descrTxtFld;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement findButton;
		
	public AccountActivity() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectAccActivityTab() throws InterruptedException {
		accActivityTab.click();
		Thread.sleep(3000);
	}
		
	
	public void showTransactionTab(WebElement element, String value) {
		 
		Select select=new Select(accType);
		select.selectByVisibleText(value);
		//select.selectByIndex(value);
		
	}
	
	public void findTransactionTab() {
		findTransTab.click();
		descrTxtFld.sendKeys("OFFICE SUPPLY");
		findButton.click();
		
	}

}
