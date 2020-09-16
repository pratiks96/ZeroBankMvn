package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zeroBank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//strong[text()='Online Banking']")
	WebElement onlineBanking;
	
	@FindBy(xpath="//button[@id='signin_button']")
	WebElement signinBtn;
	
	@FindBy(xpath="//strong[text()='Feedback']")
	WebElement feedBack;
	
	@FindBy(xpath="//a[@id='online-banking']")
	WebElement moreService;
	
	@FindBy(xpath="//span[@id='account_activity_link']")
	WebElement checkingAccActivity;
	
	@FindBy(xpath="//span[@id='transfer_funds_link']")
	WebElement transferFund;
	
	@FindBy(xpath="//span[@id='money_map_link']")
	WebElement myMoneyMap;
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifySigninBtn() {
		return signinBtn.isDisplayed();
	}
	
	public void clickOnOnlineBanking() {
		onlineBanking.click();
	}
	
	public void clickOnFeedBack() {
		feedBack.click();
	}
	
	public void clickOnMoreServices() {
		moreService.click();
	}
	
	public void clickOnAccActivity() {
		checkingAccActivity.click();
	}
	
	public void clickOnTransferFund() {
		transferFund.click();
	}
	
	public void clickOnMyMoneyMap() {
		myMoneyMap.click();
	}
	
	
	
	

}
