package Invocation_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Invocation_Count {
	WebDriver driver;

	@Test(invocationCount = 10)
	public void Login_Logout() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Navigate to Swag Labs
		driver.get("https://www.saucedemo.com/");
		// Login with valid credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.quit();

	}
}
