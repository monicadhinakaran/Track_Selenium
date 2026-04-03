package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

	WebDriver driver;

	public RecruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Vacancy - link
	@FindBy(linkText = "Vacancies")
	private WebElement vacancies_link;

	//Getters and setters of Vacacanies_link
	public WebElement getVacancies_link() {
		return vacancies_link;
	}

	public void clickVacancies_link() {
		getVacancies_link().click();
	}
	
	
	
}
