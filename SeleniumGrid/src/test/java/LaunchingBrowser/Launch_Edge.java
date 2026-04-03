package LaunchingBrowser;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launch_Edge {
public static void main(String[] args) throws Exception {
	
	EdgeOptions option = new EdgeOptions();
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.31.249:4444"), option);

	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	driver.quit();

}
}
