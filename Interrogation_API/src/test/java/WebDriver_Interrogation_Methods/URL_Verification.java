package WebDriver_Interrogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verification {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String Current_URL = driver.getCurrentUrl();
		String Exp_URL = "https://demowebshop.tricentis.com/";
		
		//Checks the expected URL and the current URL
		if(Exp_URL.equals(Current_URL)) {
			System.out.println("The Navigation is Successful with URL");
		} else {
			System.out.println("The Navigation is rejected with URL");
		}
		
		driver.quit();
	}

}
