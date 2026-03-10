package Locators_Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSlectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver =  new ChromeDriver();
		
		//Navigation to Webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//Use Valid creditionals 
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//passwrd
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.navigate().refresh();
		
		//Login
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
