package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	WebDriver driver;

	public AddVacancyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[. = 'Vacancy Name']/../..//input")
	private WebElement vacancy_name;
	
	@FindBy(xpath = "//label[. = 'Job Title']/../..//div[@class = 'oxd-select-text--after']")
	private WebElement job_title;
	
	@FindBy(tagName = "textarea")
	private WebElement description_textfield;
	
	@FindBy(xpath = "//label[. = 'Hiring Manager']/../..//input")
	private WebElement hiringManager;
	
	@FindBy(xpath = "//label[. ='Number of Positions']/../..//input")
	private WebElement noofPositions;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement submit_btn;

	//Getters and setters of vacancy name
	public WebElement getVacancy_name() {
		return vacancy_name;
	}

	public void setVacancy_name(String valid_vacancy_name) {
		getVacancy_name().sendKeys(valid_vacancy_name);
	}

	//Getters and setters of vacancy name
	public WebElement getJob_title() {
		return job_title;
	}

//	public void setJob_title(WebElement job_title) {
//		this.job_title = job_title;
//	}

	//Getters and setters of Description
	public WebElement getDescription_textfield() {
		return description_textfield;
	}

	public void setDescription_textfield(String valid_description_textfield) {
		getDescription_textfield().sendKeys(valid_description_textfield);
	}

	//Getters and setters of Hiring manager
	public WebElement getHiringManager() {
		return hiringManager;
	}

//	public void setHiringManager(WebElement hiringManager) {
//		this.hiringManager = hiringManager;
//	}

	//Getters and setters of No of positions
	public WebElement getNoofPositions() {
		return noofPositions;
	}

	public void setNoofPositions(String valid_noofPositions) {
		getNoofPositions().sendKeys(valid_noofPositions);
	}

	
	//Getters and setters of Submit btn
	public WebElement getSubmit_btn() {
		return submit_btn;
	}
	
	public void clickSubmit_btn() {
		getSubmit_btn().click();
	}
}

