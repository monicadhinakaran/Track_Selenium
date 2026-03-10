package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Locator_Eg4 {

	public static void main(String[] args) throws InterruptedException {

		// Launch The browser
		WebDriver driver = new ChromeDriver();
		
		// Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Shopping cart')]")).click();
	}

}
