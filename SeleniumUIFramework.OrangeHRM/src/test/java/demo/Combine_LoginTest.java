package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class Combine_LoginTest {

	@Test
	public void login() throws IOException {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/CommonData_Swaglab.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(prop.getProperty("username"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLogin_btn();
		
	}
}
