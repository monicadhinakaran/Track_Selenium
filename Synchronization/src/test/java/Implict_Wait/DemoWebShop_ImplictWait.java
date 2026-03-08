package Implict_Wait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_ImplictWait {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on fb, utube, X
		driver.findElement(By.xpath("//a[. = 'Facebook']")).click();
		driver.findElement(By.xpath("//a[. = 'Twitter']")).click();
		driver.findElement(By.xpath("//a[. = 'YouTube']")).click();
		//String parent_Id = driver.getWindowHandle();
		//Set<String> Fb_Id = driver.getWindowHandles();
		Set<String> X_Id = driver.getWindowHandles();
		Set<String> YouTube_Id = driver.getWindowHandles();
		YouTube_Id.remove(X_Id);
 		for(String str : YouTube_Id) {
 			driver.switchTo().window(str);
 		}
 		
 		//Play a song on YouTube
 		driver.findElement(By.name("search_query")).sendKeys("FAAHHHH..." , Keys.ENTER);
 		
		
	}

}
