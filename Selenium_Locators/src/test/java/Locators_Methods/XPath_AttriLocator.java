package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_AttriLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
//		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href= '/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19']")).click();
//		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//button[@class='header-search-button placeholder input-button form-control d-flex flex-1 flex-self-stretch flex-items-center no-wrap width-full py-0 pl-2 pr-0 text-left border-0 box-shadow-none']")).click();
		//driver.findElement(By.xpath("//div[@class=\"HeaderMenu-wrapper d-flex flex-column flex-self-start flex-lg-row flex-auto rounded rounded-lg-0\"]")).sendKeys("Sele");
		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium" , Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
