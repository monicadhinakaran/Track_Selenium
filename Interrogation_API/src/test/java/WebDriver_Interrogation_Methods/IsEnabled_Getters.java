package WebDriver_Interrogation_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Getters {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.shoppersstack.com/products_page/34");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(3000);
		
		//Checking that CHECK button is enabled or not
		WebElement Check = driver.findElement(By.id("Check"));
		System.out.println("Check button enabled?? : " + Check.isEnabled());
	}

}
