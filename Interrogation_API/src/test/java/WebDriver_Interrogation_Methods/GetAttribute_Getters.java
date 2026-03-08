package WebDriver_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Getters {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Fetches the search field attribute
		WebElement Search = driver.findElement(By.id("small-searchterms"));
		
		//Fetch the Attribute for static attribute
		System.out.println(Search.getAttribute("id"));
		System.out.println(Search.getDomAttribute("id"));
		System.out.println(Search.getDomProperty("id"));
		
		//Fetch the Attribute for dynamic attribute
		System.out.println(Search.getAttribute("value"));
		System.out.println(Search.getDomAttribute("value"));
		System.out.println(Search.getDomProperty("value"));
		
		Search.sendKeys("Mobiles");
		//Fetch the Attribute for dynamic attribute after sendKeys
		System.out.println(Search.getAttribute("value"));
		System.out.println(Search.getDomAttribute("value"));
		System.out.println(Search.getDomProperty("value"));
	}

}
