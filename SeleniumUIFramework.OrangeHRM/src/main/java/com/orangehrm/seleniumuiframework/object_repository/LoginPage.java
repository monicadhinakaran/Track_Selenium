package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	//Constructor - to connect the driver
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Textbox - username
	@FindAll({
	         @FindBy(name = "username"),
	         @FindBy(name = "user-name")
	})
	private WebElement userName;
	
	//Textbox - pwd
	@FindBy(name = "password")
	private WebElement password;
	

	//Submit - button
	@FindAll({
		  @FindBy(xpath = "//button[@type = 'submit']"),
	      @FindBy(xpath = "//input[@type = 'submit']")
	})
	private WebElement login_btn;
	
	//Submit - forgot pwd button
	@FindBy(css = "[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	private WebElement forgot_pwd;
	
	//Linkedln - link
	@FindBy(css = "[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedln_link;
	
	//Facebook - link
	@FindBy(css = "[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebook_link;
	
	//Twitter - link
	@FindBy(css = "[href= 'https://twitter.com/orangehrm?lang=en/']")
	private WebElement twitter_link;
	
	//Youtube - link
	@FindBy(css = "[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtube_link;

	//Getters and setters of Username
	public WebElement getUsername() {
		return userName;
	}

	public void setUsername(String valid_username) {
		getUsername().sendKeys(valid_username);
	}

	//Getters and setters of Password
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String valid_password) {
		getPassword().sendKeys(valid_password);
	}

	//Getters and setters of Login-button
	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void clickLogin_btn() {
		getLogin_btn().click();
	}

	//Getters and setters of Forgot_pwd-button
	public WebElement getForgot_pwd() {
		return forgot_pwd;
	}

	public void clickForgot_pwd() {
		getForgot_pwd().click();
	}

	//Getters and setters of Linkedln_link
	public WebElement getLinkedln_link() {
		return linkedln_link;
	}

	public void clickLinkedln_link() {
		getLinkedln_link().click();	
	}

	//Getters and setters of Facebook_login
	public WebElement getFacebook_link() {
		return facebook_link;
	}

	public void clickFacebook_link() {
        getFacebook_link().click();
	}

	//Getters and setters of Twitter_link
	public WebElement getTwitter_link() {
		return twitter_link;
	}

	public void clickTwitter_link() {
		getTwitter_link().click();
	}

	//Getters and setters of Youtube_link
	public WebElement getYoutube_link() {
		return youtube_link;
	}

	public void clickYoutube_link() {
		getYoutube_link().click();
	}
	
	//Business logic of login
	public void login(String valid_uname, String valid_pwd) {
		setUsername(valid_uname);
		setPassword(valid_pwd);
		clickLogin_btn();
	}
	
}
