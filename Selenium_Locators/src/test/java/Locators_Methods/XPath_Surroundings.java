package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Surroundings {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Redirect to Build ur own computer
		driver.findElement(By.xpath("//a[.='Build your own computer']/../..//input[@value = 'Add to cart']")).click();
		
//		//Navigate to url
//		driver.get("https://books.toscrape.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[. = 'A Light in the ...']/../..//button[@type= 'submit']")).click();
		
//		//Navigate to url
//		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[. ='Samsung']/..//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//label[. =' RedMi ']/..//input[@type='checkbox']")).click();
		
	}

}
