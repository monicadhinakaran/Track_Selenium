package Assisgnment_OrangeHRM_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrangeHRM_Buzz {

	WebDriver driver = null; 
	@Test(priority = -1)
	public void LaunchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority = 1)
	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		//Verify Login
		WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
		if(Login_Verify.isDisplayed()) {
			Reporter.log("Login Page Status : Passed");
		}else {
			Reporter.log("Login Page Status : Failed");
		}
	}
	
	@Test(priority = 5)
	public void BuzzPost() {
		driver.findElement(By.xpath("//span[. = 'Buzz']")).click();
		driver.findElement(By.xpath("//textarea[@class = 'oxd-buzz-post-input']")).sendKeys("Hi, Wanna complete this task!!");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
		//Verify
		WebElement Verify_Post = driver.findElement(By.xpath("//p[. = 'Hi, Wanna complete this task!!']"));
		if(Verify_Post.isDisplayed()) {
			Reporter.log("Post verify : Passed");
		} else {
			Reporter.log("Post verify : Failed");
		}
	}
	
	@Test(priority = 7)
	public void LogOut() {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Verify LogOut
		WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
		if(Logout.isDisplayed()) {
			System.out.println("LogOut status : Passed");
		} else {
			System.out.println("LogOut status : Failed");
		}
	}
	
}
