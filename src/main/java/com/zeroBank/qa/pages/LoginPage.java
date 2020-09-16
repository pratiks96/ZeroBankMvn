package com.zeroBank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zeroBank.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//h3[contains(text(),'Log in to ZeroBank')]")
	WebElement header;
	
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(name="user_password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='signin_button']")
	WebElement signinBtn;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(name="user_remember_me")
	WebElement keepMeSingnedIn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password ?')]")
	WebElement forgotYourPassword;
	
	@FindBy(name="email")
	WebElement emailTextbox;
	
	@FindBy(name="submit")
	WebElement sendPassword;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean getHeader() {
		return header.isDisplayed();
	}
	
	public AccountSummary login(String un,String pwd) {
		signinBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		keepMeSingnedIn.click();
		loginBtn.click();
		
		return new AccountSummary();
	}
	
	public void wrongLogin(String un,String pwd) {
		signinBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		keepMeSingnedIn.click();
		loginBtn.click();
		
	}
	
	public void forgotPassword() {
		signinBtn.click();
		forgotYourPassword.click();
		emailTextbox.sendKeys("abcd@gmail.com");
		sendPassword.click();
		
		
	}
	
	
	
	
	

}
