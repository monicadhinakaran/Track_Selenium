package Handling_PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNew_Window {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//Launch a new window, and open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		
	}

}
