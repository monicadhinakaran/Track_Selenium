package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;

	// Constructor - to connect the driver
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Pim - link navigate
	@FindBy(xpath = "//span[. = 'PIM']")
	private WebElement pim_module;
	
	// Recruitment - link navigate
	@FindBy(xpath = "//span[. = 'Recruitment']")
	private WebElement recruitment_module;

	// logout - dropdown
	@FindBy(xpath = "//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement logout_dropdown;

	//logOut - link
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logOut_module;
	
	//Getters and setters of Logout module
	public WebElement getLogOut_module() {
		return logOut_module;
	}

	public void clickLogOut_module() {
		getLogout_dropdown().click();
	}

	
	// Getters and setters of Pim module
	public WebElement getPim_module() {
		return pim_module;
	}

	public void clickPim_module() {
		getPim_module().click();
	}

	
	// Getters and setters of Recruitment module
	public WebElement getRecruitment_module() {
		return recruitment_module;
	}

	public void clickRecruitment_module() {
		getRecruitment_module().click();
	}

	// Getters and setters of Logout_dropdown
	public WebElement getLogout_dropdown() {
		return logout_dropdown;
	}

	public void clickLogout_dropdown() {
		getLogout_dropdown().click();
	}

	//Logout -buisness logic
	public void logout() {
		clickLogout_dropdown();
		clickLogOut_module();
	}

	

	
}
