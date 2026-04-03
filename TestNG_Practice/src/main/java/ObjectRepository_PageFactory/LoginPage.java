package ObjectRepository_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		//it automatically initilizes the located web elements on calling
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login-button")
	WebElement login_btn;
	
	public void URL(String link) {
		driver.get(link);
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String un) {
		getUserName().sendKeys(un);
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(String pass) {
		getPwd().sendKeys(pass);
	}
	
	//Business Logic
	
//	public void uname(String un) {
//		userName.sendKeys(un);
//	}
//	public void Password(String pass) {
//		pwd.sendKeys(pass);
//	}
	
	
	public void login(String valid_username, String valid_pwd) {
		setUserName(valid_username);
		setPwd(valid_pwd);
		login_btn.click();
	}
}
