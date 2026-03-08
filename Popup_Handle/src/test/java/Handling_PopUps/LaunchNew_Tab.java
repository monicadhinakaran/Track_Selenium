package Handling_PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNew_Tab {

	public static void main(String[] args) throws InterruptedException {
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//Triggering a new tab in the same browser window and parallely switch the browser tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://web.whatsapp.com/");
	}

}
