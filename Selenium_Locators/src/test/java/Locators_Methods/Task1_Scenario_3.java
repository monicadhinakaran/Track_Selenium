package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Scenario_3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
//		//Navigate to URL
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		
//		//Locate/ Open to Gmail
//		driver.findElement(By.linkText("Gmail")).click();
		
//		driver.get("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Anu");
//		
//		driver.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("Shree");
//		//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("shree");
//		
//		
//		Thread.sleep(5000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("search_query")).sendKeys("Arabu Naadu", Keys.ENTER);

		driver.findElement(By.xpath("//yt-formatted-string[39]")).click();
		
		
		
		
	//	driver.close();
		
	}

}
