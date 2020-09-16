package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zeroBank.qa.base.TestBase;

public class PayBills extends TestBase {
	
	//Test Case1=Verify Pay Saved Payee Tab
	@FindBy(xpath="//a[contains(text(),'Pay Bills')]")
	WebElement payBillsTab;
	
	@FindBy(name="payee")
	WebElement payeeName;
	
	@FindBy(name="account")
	WebElement accType;
	
	@FindBy(name="amount")
	WebElement amountTextFld;
	
	@FindBy(name="date")
	WebElement dateTextFld;
	
	@FindBy(name="description")
	WebElement descriptionTextFld;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement payBtn;
	
	//Test Case2=Verify Add New Payee Tab
	@FindBy(xpath="//a[contains(text(),'Add New Payee')]")
	WebElement addNewPayeeTab;
	
	@FindBy(name="name")
	WebElement payeeNametxtFld;
	
	@FindBy(name="address")
	WebElement payeeAddressTxtfld;
	
	@FindBy(xpath="//input[@id='np_new_payee_account']")
	WebElement accountTxtfld;
	
	@FindBy(xpath="//input[@id='np_new_payee_details']")
	WebElement payeeDetailsTxtfld;
	
	@FindBy(xpath="//input[@id='add_new_payee']")
	WebElement addButton;
	
	//Test Case3= Verify Purchase Foreign Currency
	@FindBy(xpath="//a[contains(text(),'Purchase Foreign Currency')]")
	WebElement purchaseForeignCurrencyTab;
	
	@FindBy(name="currency")
	WebElement currencyDropDown;
	
	@FindBy(xpath="//input[@id='pc_amount']")
	WebElement amountTxtFld;
	
	@FindBy(xpath="//input[@id='pc_inDollars_true']")
	//@FindBy(name="inDollars")
	WebElement dollerRadioBtn;
	
	@FindBy(xpath="//input[@id='pc_inDollars_false']")
	//@FindBy(name="inDollars")
	WebElement selectedCurrencyRadioBtn;
	
	@FindBy(xpath="//input[@id='pc_calculate_costs']")
	WebElement calculateCostBtn;
	
	@FindBy(xpath="//input[@id='purchase_cash']")
	WebElement purchaseButton;
	
	public PayBills() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnPayBill() throws InterruptedException {
		payBillsTab.click();
		Thread.sleep(3000);
		
	}
	
	
	public void paySavedPayee(WebElement element,String value, WebElement element1, String value1) {
		
		Select select=new Select(payeeName);
		select.selectByVisibleText(value);
		
		Select select1=new Select(accType);
		select1.selectByVisibleText(value1);
		
		amountTextFld.sendKeys("12000");
		dateTextFld.sendKeys("2020-08-30");
		descriptionTextFld.sendKeys("Lending");
		payBtn.click();
		
	}

	public void addNewPayee() {
	
		addNewPayeeTab.click();
		payeeNametxtFld.sendKeys("Sudhir Biradar");
		payeeAddressTxtfld.sendKeys("Kini Tal-Udgir Dist-Latur");
		accountTxtfld.sendKeys("23569812465");
		payeeDetailsTxtfld.sendKeys("Brother");
		addButton.click();		
   }

	public void purchaseForeignCurrency(WebElement element,String value) {
		
		purchaseForeignCurrencyTab.click();
		
		Select select=new Select(currencyDropDown);
		select.selectByVisibleText(value);
		
		amountTxtFld.sendKeys("50");
		dollerRadioBtn.click();
		selectedCurrencyRadioBtn.click();
		calculateCostBtn.click();
		purchaseButton.click();
		
		
		
	}

}
