package WebElement_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Getters {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		//Get the size in pixels  Using GetSize()| Return Type -> Dimension<C>
		WebElement Search = driver.findElement(By.id("nav-search-submit-button"));
		Dimension dim = Search.getSize();
		System.out.println("Dimension : " + dim );
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		//Get the size the pixels Using GetCSSSelector()
		System.out.println(Search.getCssValue("height"));
		
	}

}
