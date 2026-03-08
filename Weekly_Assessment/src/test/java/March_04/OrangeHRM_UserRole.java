package March_04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_UserRole {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Login the site
		// Type username
		driver.findElement(By.name("username")).sendKeys("Admin");
		// Type Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// Click on login to log the site
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//a[@class = 'oxd-main-menu-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//button[@type = 'button' and @class = 'oxd-button oxd-button--medium oxd-button--secondary']"))
				.click();
		Thread.sleep(2000);
		
		//Change Role to Admin
		WebElement Add_Role = driver.findElement(
				By.xpath("//div[. = '-- Select --'  and @class = 'oxd-select-text oxd-select-text--active']"));
		Add_Role.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role = 'listbox']/child::div[2]/child::span")).click();
		WebElement Verify_Admin = driver.findElement(By.xpath("(//div[. = 'Admin'])[5]"));

		if (Verify_Admin.isDisplayed()) {
			System.out.println("Role Status : Pass");
		} else {
			System.out.println("Role Status : Fail");
		}

		
		//Change role to ESS
		WebElement Add_Role2 = driver.findElement(
				By.xpath("//div[. = 'Admin'  and @class = 'oxd-select-text oxd-select-text--active']"));
		Add_Role2.click();
		driver.findElement(By.xpath("//div[@role = 'listbox']/child::div[3]/child::span")).click();

		WebElement Verify_ESS = driver.findElement(By.xpath("(//div[. = 'ESS'])[2]"));

		if (Verify_ESS.isDisplayed()) {
			System.out.println("Role Status : Pass");
		} else {
			System.out.println("Role Status : Fail");
		}

		//LogOut
		driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--ghost']")).click();
		
		WebElement Log_help = driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']"));
		Log_help.click();
		driver.findElement(By.xpath("//a[ . = 'Logout']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
