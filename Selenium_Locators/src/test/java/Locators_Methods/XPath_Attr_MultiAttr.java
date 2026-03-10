package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_MultiAttr {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
//		//Navigating the url
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		
//		//Click on Digital Downloads
//		driver.findElement(By.xpath("//a[contains(text(), 'Digital download') and @href= '/digital-downloads']")).click();
		
		//Navigating the url
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		//Click on clothing ad shoes
		driver.findElement(By.xpath("//a[@_sp='p4624852.m1379.l3250'  and @class='vl-flyout-nav__link-container' and @href='https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334']")).click();
	}

}
