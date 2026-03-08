package Implict_Wait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider_ImplictWait {

	public static void main(String[] args) {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		
		//Click on page loading
		driver.findElement(By.xpath("//a[ . = 'Open In New Tab']")).click();
		
		String Parent_Id = driver.getWindowHandle();
		Set<String> Child_Id = driver.getWindowHandles();
		Child_Id.remove(Parent_Id);
		for(String str : Child_Id) {
			driver.switchTo().window(str);	
		}
		
		driver.findElement(By.id("email")).sendKeys("seleniumgmail.com");
		driver.findElement(By.tagName("button")).click();
		
		
		
		
	}

}
