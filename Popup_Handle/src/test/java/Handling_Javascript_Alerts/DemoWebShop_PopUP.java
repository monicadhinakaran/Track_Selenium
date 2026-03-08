package Handling_Javascript_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_PopUP {

	public static void main(String[] args) throws InterruptedException {
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Click on search button
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		//Handle the popup and type ccomputers and then search
		driver.switchTo().alert().accept();
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		driver.close();
	}

}
