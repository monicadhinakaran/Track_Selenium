package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class OrangeHRM_ReadFrom_DataProvider {

	WebDriver driver;
	
	@DataProvider(name = "LoginData")
	public Object[][] getcreditionals(){
		return new Object[][] {
			{"Admin" , "admin123"}
		};
	}
	
	@Test(dataProvider = "LoginData")
	public void Login(String user , String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp = new LoginPage(driver);
		lp.login(user, password);
	}
}
