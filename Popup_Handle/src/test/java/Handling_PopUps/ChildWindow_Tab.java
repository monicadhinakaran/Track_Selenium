package Handling_PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on search and search for Laptop
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LAPTOPS", Keys.ENTER);
		Thread.sleep(4000);
		
		//Click on the first laptop
		driver.findElement(By.xpath("(//div[@data-cy=\"title-recipe\"])[1]")).click();
		
	}

}
