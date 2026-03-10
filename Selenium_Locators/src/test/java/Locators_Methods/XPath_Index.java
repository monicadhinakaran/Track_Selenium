package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Index {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to url
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[5]")).click();
		
		
	}

}
