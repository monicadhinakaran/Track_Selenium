package Assisgnment_OrangeHRM_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrangeHRM_PIM_Reason {
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
		// Verify Login
		WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
		if (Login_Verify.isDisplayed()) {
			Reporter.log("Login Page Status : Passed", true);
		} else {
			Reporter.log("Login Page Status : Failed", true);
		}
	}

	@Test(priority = 3, dependsOnMethods = "Login")
	public void Pim_Reason() {
		// PIM -> Transaction dropdown
		driver.findElement(By.xpath("//span[.= 'PIM']")).click();
		driver.findElement(By.xpath("//span[contains(. , 'Configuration')]")).click();
		driver.findElement(By.xpath("//ul[@role = 'menu']/child::li[. = 'Termination Reasons']")).click();

		// Add the reason
		driver.findElement(By.xpath("//button[. = ' Add ']")).click();
		driver.findElement(By.xpath("//label[. = 'Name']/../..//input")).sendKeys("Assignment");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// Verify
		WebElement verify_reason = driver.findElement(By.cssSelector("div[data-v-6c07a142]"));
		Assert.assertEquals(verify_reason.getText(), "Assignment");
	}

	@Test(priority = 5, dependsOnMethods = "Login")
	public void LogOut() {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();

		// Verify LogOut
		WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
		if (Logout.isDisplayed()) {
			Reporter.log("LogOut status : Passed", true);
		} else {
			Reporter.log("LogOut status : Failed", true);
		}
	}
}
