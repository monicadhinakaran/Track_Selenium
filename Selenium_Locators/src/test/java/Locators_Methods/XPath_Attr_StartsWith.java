package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_StartsWith {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
		WebDriver driver = new ChromeDriver();
//		//Navigating to URL
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		
//		//Xpath Using STartsWith attr
//		driver.findElement(By.xpath("//a[starts-with(text(), 'Digital down')]")).click();
		
		//Navigating to URL
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		//Xpath for search toys -> StartsWith
		driver.findElement(By.xpath("//span[starts-with(text() , 'Toy')]")).click();
	}

}
