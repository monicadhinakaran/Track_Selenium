package Assisgnment_OrangeHRM_TestNG;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrangeHRM_Recruitment_AddUser{

	WebDriver driver = null; 
	
	@Test(priority = -1)
	public void LaunchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority = 1, dependsOnMethods = "LaunchingBrowser")
	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		//Verify Login
		WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
		if(Login_Verify.isDisplayed()) {
			Reporter.log("Login Page Status : Passed" , true);
		}else {
			Reporter.log("Login Page Status : Failed", true);
		}
	}
	
	@Test(priority = 3, dependsOnMethods = "Login")
	public void Recruit_User() throws InterruptedException{
		//Click on recruitment and add the user
		driver.findElement(By.xpath("//span[. = 'Recruitment']")).click();
		driver.findElement(By.xpath("//button[contains(. , ' Add')]")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Abi");
		driver.findElement(By.name("middleName")).sendKeys("Sree");
		driver.findElement(By.name("lastName")).sendKeys("K");

		WebElement Vacancy = driver.findElement(By.xpath("//div[@class = 'oxd-select-text oxd-select-text--active']"));
		Vacancy.click();
		driver.findElement(By.xpath("//span[. = 'Senior QA Lead']")).click();
		
				
		driver.findElement(By.xpath("//input[@class = 'oxd-input oxd-input--active' and @placeholder = 'Type here']")).sendKeys("abisree@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\Users\\monic\\Downloads\\IV YEAR B WITH GUIDE.docx");
		
//		WebElement calender = driver.findElement(By.className("oxd-icon bi-calendar oxd-date-input-icon"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = '01/11/2005'",calender );
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(. , ' Save')]")).click();
		
		//Verify
		WebElement Check_Added = driver.findElement(By.linkText("Candidates"));
		if(Check_Added.isDisplayed()) {
			Reporter.log("User Add status : Passed", true);
		} else {
			Reporter.log("User Add status : Failed", true);
		}
	}
	
	@Test(priority = 4, dependsOnMethods = "Recruit_User")
	public void Verify_Canditate() throws InterruptedException {
		driver.findElement(By.xpath("//a[. = 'Candidates']")).click();
		
		//Job Title
		driver.findElement(By.xpath("(//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.  = 'Automaton Tester']")).click();
		//Vacancy
		driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[. = 'Senior QA Lead']")).click();
		//Hiring Manager
		driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[. = 'Rahul Patil']")).click();
		//Status
		driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[. = 'Interview Scheduled']")).click();
		
		WebElement Canditate_name=  driver.findElement(By.xpath("//input[contains(@placeholder , 'Type for hints.')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'Abi Sree K'", Canditate_name);
		
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
//		WebElement Verify_User_Added = driver.findElement(By.xpath("//div[@class = 'oxd-table-cell oxd-padding-cell']/child::div[. = 'Abi Sree K']"));
//		if(Verify_User_Added.isDisplayed()) {
//			Reporter.log("User Add status : Passed", true);
//		} else {
//			Reporter.log("User Add status : Failed", true);
//		}
			
	}
	
	@Test(priority = 5, dependsOnMethods = "Login")
	public void LogOut() {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Verify LogOut
		WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
		if(Logout.isDisplayed()) {
			Reporter.log("LogOut status : Passed", true);
		} else {
			Reporter.log("LogOut status : Failed", true);
		}
	}
	
	
	
	
}
