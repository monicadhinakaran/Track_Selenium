package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axes_Eg1 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']")).click();
	}

}
