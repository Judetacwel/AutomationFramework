package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class OrderPlaced extends TestBase {

	public OrderPlaced() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(linkText = "Continue")
	private WebElement continueBtn;

	public YourStore clickContinueBtn() {

		continueBtn.click();
		return new YourStore();
	}

}
