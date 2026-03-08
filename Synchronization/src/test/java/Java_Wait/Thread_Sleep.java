package Java_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Sleep {

	public static void main(String[] args) throws InterruptedException {
			
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://www.amazon.in/");
		//Thread -> sleep(long milli)
		Thread.sleep(2000);	
		
		//Navigate to Ebay
		driver.navigate().to("https://www.ebay.com/");
		//Thread -> sleep(long milli, int nano)
		Thread.sleep(1500, 100);
		
		//Navigate to Shopperstack
		driver.navigate().to("https://www.shoppersstack.com/");
		//Thread -> Duration
		Thread.sleep(Duration.ofSeconds(20));
	}
}