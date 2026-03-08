package WebDriver_Interrogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Verification {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

		// Fetching 32 bit unique id
		System.out.println(driver.getWindowHandle());
		// Refresh the page and print unique window id
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
	}

}
