package WebElement_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue_Getters {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		
		//Getting the value of CSS property
		WebElement Logo = driver.findElement(By.xpath("//*[name() = 'svg' and @id='Layer_1']"));
		System.out.println(Logo.getCssValue("font"));
		System.out.println(Logo.getCssValue("font-family"));
	}

}
