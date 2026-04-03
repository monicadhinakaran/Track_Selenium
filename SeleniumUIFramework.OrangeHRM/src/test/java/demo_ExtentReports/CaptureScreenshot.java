package demo_ExtentReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.generic_utility.ScreenShot_Utility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriver_Utility;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class CaptureScreenshot {
	
	@Test(invocationCount=3)
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriver_Utility wu=new WebDriver_Utility(driver);
		LoginPage lp=new LoginPage(driver);
		DashboardPage dp=new DashboardPage(driver);
		ScreenShot_Utility ss=new ScreenShot_Utility();
		//Creating a method for time-stamp
		//String timestamp=new SimpleDateFormat("yyyy-mm-dd-[hh-mm-ss]").format(new Date());
		wu.configBrowserMaximize();
		wu.waitForElementload(20);
		wu.NavigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(3000);
		
		//Capture the ScreenShot of Home page
		ss.captureScreenshot(driver,"DashboardPage");
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File perm =new File("./Reports/dashboard"+timestamp+".png");
//		FileHandler.copy(temp, perm);
	
		//Capture the screenshot of web element
		ss.captureScreenshot(dp.getRecruitment_module(),"recruitmentLink");
//		WebElement recruitmentLink = dp.getRecrutmentLink();
//		File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
//		File permTrg=new File("./Reports/recruitmentLink"+timestamp+".png");
//		FileHandler.copy(tempsrc, permTrg);
//		
		
	}
}
