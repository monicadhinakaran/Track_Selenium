package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_Locators_EX1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Web Browser
		WebDriver driver = new ChromeDriver();
		//Navigate Url
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		
		//Xpath -> username, pwd, and checkbox
		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Shakthi");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shakthi@1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
	}

}
