package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanciesPage {
	WebDriver driver;

	public VacanciesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Button - Add
	@FindBy(xpath = "//button[contains(. , ' Add')]")
	private WebElement add_btn;

	//Getters and Setters of Add button
	public WebElement getAdd_btn() {
		return add_btn;
	}

	public void clickAdd_btn() {
		getAdd_btn().click();
	}
}
