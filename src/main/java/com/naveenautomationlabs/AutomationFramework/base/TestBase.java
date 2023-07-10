package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.naveenautomation.AutomationFramework.Utils.Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;
	private String DEFAULT_BROWSER = Browsers.CHROME.getBrowserName();
	private Environment DEFAULT_ENV = com.naveenautomation.AutomationFramework.Utils.Environment.PROD;


	public TestBase() {
		prop = new Properties();
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\judet\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\com\\naveenautomationlabs\\config\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intialisation() {
		switch (DEFAULT_BROWSERER.) {
		case "chrome":
			wd = WebDriverManager.chromedriver().create();
			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "Firefox":
			wd = WebDriverManager.firefoxdriver().create();
			break;

		default:
			System.out.println("Not a valid browser name");
			break;
		}
		
		
		wd.get(DEFAULT_ENV.);
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	/*public void tearDown() {
		wd.quit();
	}*/
}
