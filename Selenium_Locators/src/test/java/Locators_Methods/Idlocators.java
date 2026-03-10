package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocators {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//Typing selenium in search bar
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
	}

}
