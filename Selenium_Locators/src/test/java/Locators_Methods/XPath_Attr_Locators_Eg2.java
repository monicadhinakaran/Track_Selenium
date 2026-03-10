package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_Locators_Eg2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		//Navigating to url
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		//Click Xpath
		driver.findElement(By.xpath("//section[text() = 'X Path']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
	}

}
