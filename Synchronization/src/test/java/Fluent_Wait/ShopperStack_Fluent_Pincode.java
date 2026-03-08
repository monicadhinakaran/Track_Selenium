package Fluent_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ShopperStack_Fluent_Pincode {
	
	public static void main(String[] args) {
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigating to URL
		driver.get("https://www.shoppersstack.com/products_page/35");
		
		//Type on pincode and it is enable to check
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");  
		WebElement Check_Btn = driver.findElement(By.id("Check"));
		//Object of Fluent Wait
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Check_Btn));
		
		Check_Btn.click();

	}
}
