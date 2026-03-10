package Locators_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class OrangeHRM_PwdChange {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
		// Login the site
		// Type username
		WebElement user = driver.findElement(By.xpath("//input[starts-with(@name , 'usern')] "));
		user.sendKeys("Admin");
		// Type Password
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(user)).sendKeys("admin123");
		// Click on login to log the site
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//Click on the profile
		WebElement Button_Profile = driver.findElement(By.xpath("//i[@class ='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		Button_Profile.click();
		Button_Profile.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		//Navigate back verify and forwarD verify
		driver.navigate().back();
		driver.navigate().forward();
		
		//Refresh and retrive current URL
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}