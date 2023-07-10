package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStore extends TestBase{
	
	
	public YourStore() {

		PageFactory.initElements(wd, this);
	
	}
	
	@FindBy(css=".collapse.navbar-collapse.navbar-ex1-collapse>ul>li:nth-of-type(3)")
	private WebElement componentsBtn;
	
	@FindBy(linkText = "Monitors (2)")
	private WebElement monitorsDropDownBtn;
	
	
	public YourStore clickComponentsBtn() {
		
		componentsBtn.click();
		return new YourStore();
		
	}
	
	public Monitors clickMonitorsBtn() {
		
		monitorsDropDownBtn.click();
		return new Monitors();
		
	}
	
	

}
