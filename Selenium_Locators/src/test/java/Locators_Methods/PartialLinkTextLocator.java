package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {

		// Launching the Browser
		WebDriver driver = new ChromeDriver();
//		// Navigating to wepage
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		
//		//Partial LinkText -> Visible Text
//		driver.findElement(By.partialLinkText("Comput")).click();
		
		//Navigate to Flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("Login")).click();
		//
		driver.findElement(By.xpath("//span[text()='X']")).click();
		
		driver.close();
	}

}
