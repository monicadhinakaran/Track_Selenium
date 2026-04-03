package Practice;

import org.testng.annotations.Test;

import ObjectRepository_PageFactory.BaseClass_Factory;
import ObjectRepository_PageFactory.LoginPage;

public class LoginTest_Factory extends BaseClass_Factory{

	@Test
	public void login() {
		LoginPage lp = new LoginPage(driver);
		lp.URL("https://www.saucedemo.com/");
		
//		lp.userName.sendKeys("standard_user");
		
		//Getters and setters
		lp.setUserName("standard_user");
		lp.setPwd("secret_sauce");
		
		//Business logic 
//		lp.uname("standard_user");
//		lp.Password("secret_sauce");
		
		lp.login("standard_user", "secret_sauce");
	}
}
