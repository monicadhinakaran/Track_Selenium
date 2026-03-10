package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleLoacator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/?utm_source=bing&utm_medium=cpc&utm_platform=paidads&utm_content=&utm_campaign=Search-Brand-India&utm_campaigncode=Selenium+149966&utm_term=p+browserstack%20selenium&msclkid=3325d242452f1a448d17bbdcfa0ebaf1");
		Thread.sleep(2000);
		driver.findElement(By.id("developers-dd-toggle")).click();
		
		
//		driver.get("https://practice.expandtesting.com/login");
//		Thread.sleep(2000);
//			
//		driver.findElement(By.id("username")).sendKeys("practice");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.id("submit-login")).click();
		
		
//		driver.get("https://www.w3schools.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("search2")).sendKeys("Java");
		
		
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.id("name")).sendKeys("Anbu");

		
		
//		driver.get("https://demoqa.com/text-box");
//		Thread.sleep(2000);
//		driver.findElement(By.id("userName")).sendKeys("Hana");
		
		
	}

}

