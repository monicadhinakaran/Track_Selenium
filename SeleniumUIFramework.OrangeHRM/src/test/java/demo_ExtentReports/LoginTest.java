package demo_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.generic_utility.File_Utility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriver_Utility;
import com.aventstack.extentreports.Status;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent = new ExtentReports();
		//create a reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Test");
		WebDriver driver = new ChromeDriver();
		
		WebDriver_Utility wu = new WebDriver_Utility(driver);
		File_Utility fu = new File_Utility();
		
		LoginPage lp = new LoginPage(driver);

		wu.waitForElementload(20);
		
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");
		//Navigating to application

		wu.NavigateToApplication(urlPath);
	    test.log(Status.INFO,"Navigated to orangeGRM login page");
	  //  test.info("Navigated to OrangeHRM login page");
		lp.login(un, pass);
		test.log(Status.PASS,"Login Sucessfull");
		//test.pass("Login Sucessful");
		extent.flush();
		
		
		
				
	}
}
