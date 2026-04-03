package Assert_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Soft_Hard_OrangeHRM {
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
//		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 5, dependsOnMethods = "Login")
	public void HardAssertTest() {
		String Exp_Title = "OrangeHRM";
		String Actual_Title = driver.getTitle();
		
		//Verify Login
		Assert.assertEquals(Actual_Title, Exp_Title);
		if(Actual_Title.equals(Exp_Title)) {
			System.out.println("Hard Assert Status : Passed");
		} else {
			System.out.println("Hard Assert Status : Failed");
		}
	}
	
}
