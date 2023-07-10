package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCart extends TestBase {

	public ShoppingCart() {

		PageFactory.initElements(wd, this);

	}

	@FindBy(linkText = "Checkout")
	private WebElement checkoutBtn;

	@FindBy(css = "input[value='Continue']")
	private WebElement continueBtn;

	@FindBy(css = "input[type='checkbox']")
	private WebElement agreeCheckbox;
	
	@FindBy(css="input[value='Confirm Order']")
	private WebElement confirmBtn;

	public void clickCheckoutBtn() {

		checkoutBtn.click();

	}

	public void clickContinueBtn() {
		continueBtn.click();
	}

	public void clickAgreeCheckbox() {
		agreeCheckbox.click();
	}
	
	public void clickConfirmBtn() {
		confirmBtn.click();
	}
	
	public Checkout clickFinalConfirmBtn() {
		confirmBtn.click();
		return new Checkout();
	}
	
	
	
}
