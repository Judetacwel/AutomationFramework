package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import java.awt.datatransfer.StringSelection;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AppleCinema30 extends TestBase {

	public AppleCinema30() {

		PageFactory.initElements(wd, this);

	}
	


	@FindBy(css = "#input-option218>div:nth-of-type(1) input")
	private WebElement mediumRadioBtn;

	@FindBy(css = "input[value='10']")
	private WebElement checkbox2Btn;

	@FindBy(xpath = "//input[@value='test']")
	private WebElement testTextBox;

	@FindBy(css = "select[name='option[217]']")
	private WebElement selectDropdown;

	@FindBy(xpath = "//option[@value='1']")
	private WebElement dropdownOptions;

	@FindBy(css = "textarea[name='option[209]']")
	private WebElement textareaTextBox;

	@FindBy(id = "button-upload222")
	private WebElement fileUpload;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartBtn;

	public void clickRadioBtn() {
		mediumRadioBtn.click();
	}

	public void clickCheckBox() {
		checkbox2Btn.click();
	}

	public void inputTest() {
		testTextBox.sendKeys("test test test");
	}

	public void selectDropdown() {

		selectDropdown.click();
		dropdownOptions.click();
	}

	public void inputTextArea() {
		textareaTextBox.sendKeys("Test Test Test Test Test");
	}

	public void uploadFile() throws AWTException {
		fileUpload.click();
		
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\judet\\OneDrive\\Pictures\\Screenshots\\Screenshot (4).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);

		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		
	}

	public void clickOnAlert(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.switchTo().alert().accept();
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	public ShoppingCart clickShoppingCartBtn() {
		shoppingCartBtn.click();
		return new ShoppingCart();
	}




}
