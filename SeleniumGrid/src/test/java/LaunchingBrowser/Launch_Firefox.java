package LaunchingBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launch_Firefox {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		FirefoxOptions option = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.31.249:4444"), option);

		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.quit();
	}
}
