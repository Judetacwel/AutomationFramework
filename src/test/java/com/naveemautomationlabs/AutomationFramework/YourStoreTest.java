package com.naveemautomationlabs.AutomationFramework;

import java.awt.AWTException;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.Monitor;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.AppleCinema30;
import com.naveenautomationlabs.AutomationFramework.pages.Checkout;
import com.naveenautomationlabs.AutomationFramework.pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.pages.OrderPlaced;
import com.naveenautomationlabs.AutomationFramework.pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class YourStoreTest extends TestBase {

	YourStore yourstore;
	Monitors monitor;
	AppleCinema30 appleCinema;
	ShoppingCart shoppingCart;
	Checkout checkout;
	OrderPlaced orderPlaced;

	@BeforeMethod
	public void setup() {
		intialisation();
		yourstore = new YourStore();

	}

	@Test
	public void selectProductAndCheckout() throws AWTException, InterruptedException {

		yourstore.clickComponentsBtn();
		monitor = yourstore.clickMonitorsBtn();
		appleCinema = monitor.selectMonitors();
		appleCinema.clickRadioBtn();
		appleCinema.clickCheckBox();
		appleCinema.inputTest();
		appleCinema.selectDropdown();
		appleCinema.inputTextArea();
		appleCinema.uploadFile();
		appleCinema.clickOnAlert();
		appleCinema.clickAddToCartBtn();
		shoppingCart = appleCinema.clickShoppingCartBtn();
		shoppingCart.clickCheckoutBtn();
		shoppingCart.clickAgreeCheckbox();
		shoppingCart.clickConfirmBtn();
		checkout = shoppingCart.clickFinalConfirmBtn();
		checkout.sendEmail();
		checkout.sendPassword();
		orderPlaced = checkout.clickLoginBtn();
		orderPlaced.clickContinueBtn();
		Assert.assertEquals(wd.getTitle(), "Your order has been placed!");
		

	}

	/*
	 * @AfterMethod public void quit() { tearDown(); }
	 */
}
