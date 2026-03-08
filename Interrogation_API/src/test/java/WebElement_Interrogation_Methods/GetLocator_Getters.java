package WebElement_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocator_Getters {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		WebElement Search = driver.findElement(By.name("q"));
		//Fetching the location
		Point point_Loc = Search.getLocation();
		System.out.println(point_Loc);
		//Fetch x, y offset
		System.out.println(point_Loc.getX());
		System.out.println(point_Loc.getY());
	}

}
