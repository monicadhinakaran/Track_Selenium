package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_Locators_Eg3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch The browser
		WebDriver driver = new ChromeDriver();
		//Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id=\"pollanswers-1\"]")).click();
		//driver.findElement(By.xpath("//input[@id=\"pollanswers-1\"]")).click();
		driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		
		
	}

}
