package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_Eg1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		//Navigating to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Realtive path -> Type COmputer and Click on search, which there is no specific locator of Search button
		WebElement Searchtextfield = driver.findElement(By.id("small-searchterms"));
		Searchtextfield.sendKeys("Computers");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(Searchtextfield)).click();
	}

}
