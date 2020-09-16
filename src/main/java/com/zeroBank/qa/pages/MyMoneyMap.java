package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zeroBank.qa.base.TestBase;

public class MyMoneyMap extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'My Money Map')]")
	WebElement myMoneyMapTab;
	
	@FindBy(xpath="//tspan[contains(text(),'OutFlow Chart')]")
	WebElement outflowChartText;
	
	public MyMoneyMap() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageText() {
		return outflowChartText.getText();
		
	}
	
	public void clickOnMyMoneyMap() {
		myMoneyMapTab.click();
		
	}

}
