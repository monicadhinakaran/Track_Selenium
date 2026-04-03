package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LoginPage;

public class LoginTest extends BaseClass {

	//WebDriver driver;
	
	@Test
	public void Login_Logout() {
		
		LoginPage lp = new LoginPage(driver);
		
	
		// Navigate to Swag Labs and login
		lp.URL("https://www.saucedemo.com/");
		//login action
		lp.enterUserName("standard_user", "secret_sauce");
		lp.clickLogin();
}
}
