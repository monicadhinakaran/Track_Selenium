package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

@Listeners(com.orangehrm.seleniumuiframework.generic_utility.Listener_Implementation.class)
public class BaseClass_Recruitment_Vacancy {

	public WebDriver driver;
	FileInputStream fis;
	Properties prop;
	private String browser;

	File_Utility fiu = new File_Utility();
	WebDriver_Utility wdu;
	LoginPage lp;
	public DashboardPage dbp;
	

	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("----Exceuting Before Suite----", true);

	}

	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("----Exceuting Before Class----", true);

	}

	@Parameters("BROWSER")
	@BeforeClass(groups = { "Regression", "Smoke" })
	public void configBeforeClass() throws IOException {
		Reporter.log("----Exceuting Before Class----", true);

		browser = fiu.getPropertyKeyValue("browser");
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			driver = new FirefoxDriver();

		wdu = new WebDriver_Utility(driver);
		lp = new LoginPage(driver);
		dbp = new DashboardPage(driver);

		wdu.configBrowserMaximize();
		wdu.waitForElementload(20);
	}

	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		Reporter.log("----Exceuting Before Method----", true);
		// Navigate to OrangeHRM and login

		String URL = fiu.getPropertyKeyValue("url");
		String username = fiu.getPropertyKeyValue("username");
		String pwd = fiu.getPropertyKeyValue("password");

		// login
		wdu.NavigateToApplication(URL);
		lp.login(username, pwd);

	}

	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("----Exceuting After Method----", true);

		// Logout
		dbp.logout();
	}

	@AfterClass
	public void configAfterClass() {
		Reporter.log("----Exceuting After Class----", true);
		// Close the site
		wdu.QuitTheBrowser();
	}

	@AfterTest
	public void configAfterTest() {
		Reporter.log("----Exceuting After Test----", true);
	}

	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("----Exceuting After Suite----", true);
	}

}
