package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_Eg2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launching the browser
		WebDriver driver = new ChromeDriver();
		// Navigating to url
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		WebElement Typename = driver.findElement(By.xpath("//input[@placeholder= 'Enter your name']"));
		Typename.sendKeys("Aavin");
		WebElement emailType = driver.findElement(RelativeLocator.with(By.tagName("input")).below(Typename));
		emailType.sendKeys("Aavin@gmail.com");
		WebElement pwdtype = driver.findElement(RelativeLocator.with(By.tagName("input")).below(emailType));
		pwdtype.sendKeys("pwd123");
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pwdtype)).click();
		 
	}

}
