package WebDriver_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Getters {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigation to URL
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		//Submit button is displayed or not
		WebElement Submit = driver.findElement(By.xpath("//button[@type = 'submit']"));
		System.out.println(Submit.isDisplayed());
		
		driver.quit();
	}

}
