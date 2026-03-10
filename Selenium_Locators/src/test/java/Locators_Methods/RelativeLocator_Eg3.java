package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_Eg3 {

	public static void main(String[] args) throws InterruptedException {

		// Launching the browser
		WebDriver driver = new ChromeDriver();
		// Navigating to url
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//Enter The details
		WebElement F_name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		F_name.sendKeys("Mala");
//		WebElement L_name = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(F_name));
//		L_name.sendKeys("Sree");
//		WebElement Address = driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(L_name));
//		Address.sendKeys("NO. 13 Kamaraj Street, Channai");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(F_name)).sendKeys("Sri");
		
		

	}

}
