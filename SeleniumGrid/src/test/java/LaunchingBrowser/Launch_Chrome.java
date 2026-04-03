package LaunchingBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launch_Chrome {
	
	
	public static void main() throws MalformedURLException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new  RemoteWebDriver(new URL("http://192.168.31.249:4444"), option);
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.quit();
	}

	
}
