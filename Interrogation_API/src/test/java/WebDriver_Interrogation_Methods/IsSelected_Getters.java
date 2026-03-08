package WebDriver_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Getters {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement Poll = driver.findElement(By.id("pollanswers-3"));
		//Verify the button is selected
		System.out.println("Poll button is Selected ? " + Poll.isSelected());
		//After click, verify the button is selected
		Poll.click();
		System.out.println("Poll button is Selected ? " + Poll.isSelected());
		
	}

}
