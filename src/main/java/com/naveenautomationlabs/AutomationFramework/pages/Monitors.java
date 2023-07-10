package com.naveenautomationlabs.AutomationFramework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Monitors extends TestBase {

	public Monitors() {

		PageFactory.initElements(wd, this);

	}

	@FindBy(css = "div[class='caption'] h4")
	private List<WebElement> availableMonitors;

	@FindBy(css = "div.button-group span")
	private List<WebElement> addToCart;

	
	public AppleCinema30 selectMonitors() {

		for (int i = 0; i < availableMonitors.size(); i++) {

			String TextOfMonitors = availableMonitors.get(i).getText();
			if (TextOfMonitors.contains("Apple Cinema 30")) {

				addToCart.get(i).click();
				break;
			}

		}
		return new AppleCinema30();

	}

}
