package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Checkout extends TestBase {
	
	public Checkout() {
		PageFactory.initElements(wd, this);
	}
	
	
	@FindBy(css="input[name='email']")
	private WebElement inputEmail;
	
	@FindBy(css="input[name='password']")
	private WebElement inputPassword;
	
	@FindBy(css="input[value='Login']")
	private WebElement loginBtn;
	
	
	public void sendEmail() {
		inputEmail.sendKeys("tony@gmail.com");
	}
	
	public void sendPassword() {
		inputPassword.sendKeys("Password2");
	}
	
	public OrderPlaced clickLoginBtn() {
		
		loginBtn.click();
		return new OrderPlaced();
		
	}

}
