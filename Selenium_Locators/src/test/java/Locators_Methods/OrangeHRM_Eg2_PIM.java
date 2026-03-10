package Locators_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Eg2_PIM {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Login the site
		// Type username
		driver.findElement(By.name("username")).sendKeys("Admin");
		// Type Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// Click on login to log the site
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//Enter inside pim module and enter emp name
		driver.findElement(By.xpath("//a[@href = '/web/index.php/pim/viewPimModule']")).click();
		WebElement SearchEle =driver.findElement(By.xpath("(//input[@placeholder ='Type for hints...'])[1]"));
		SearchEle.sendKeys("Amelia");
		Thread.sleep(2000);
		SearchEle.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		//Click on his detial to view his personal detial
		driver.findElement(By.xpath("(//button[@type=\"button\"])[6]")).click();
		
		//Checks that we get an expected page in output or not
		WebElement storeElement = driver.findElement(By.name("firstName"));
		if(storeElement.isDisplayed()) {
			System.out.println("Expected Result");
		}else {
			System.out.println("Not Expected");
		}
	}

}
