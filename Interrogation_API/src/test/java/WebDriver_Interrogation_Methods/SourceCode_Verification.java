package WebDriver_Interrogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCode_Verification {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Print the Page Source 
		System.out.println(driver.getPageSource());
	}	

}