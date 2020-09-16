package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zeroBank.qa.base.TestBase;

public class TransferFund extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Transfer Funds')]")
	WebElement transferFundTab;
	
	@FindBy(name="fromAccountId")
	WebElement fromAccount;
	
	@FindBy(name="toAccountId")
	WebElement toAccount;
	
	@FindBy(name="amount")
	WebElement amountTextfield;
	
	@FindBy(name="description")
	WebElement descriptionTextfield;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement continueButton;
	
	@FindBy(xpath="//button[@id='btn_submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//a[contains(text(),'View transfers or make another transfer')]")
	WebElement viewTransferLink;
	
	public TransferFund() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnTransferFund() throws InterruptedException {
		transferFundTab.click();
		Thread.sleep(3000);
		
	}
	
	public void chooseAccType(WebElement element, int value,WebElement element1, int value1) {
		
		Select select=new Select(fromAccount);
		select.selectByIndex(value);
		
		Select select1=new Select(toAccount);
		select1.selectByIndex(value1);
		
		amountTextfield.sendKeys("25000");
		descriptionTextfield.sendKeys("EMI");
		continueButton.click();
		submitButton.click();
		viewTransferLink.click();
		
		
	}

}
