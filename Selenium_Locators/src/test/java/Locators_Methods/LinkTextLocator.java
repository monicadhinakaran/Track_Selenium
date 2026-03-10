package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the Browser
		WebDriver driver = new ChromeDriver();
		//Navigating to webpage 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//LinkText Locator
		driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();
	}

}
