package WindowScrolling;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOn_HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate the URL
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		
		//Click On Select ur gender
		driver.findElement(By.xpath("//div[contains(@id , '_R_mad6p4jikacppb6amH')]")).click();
		//Custom
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role = 'option' and contains(@id , '_R_mad6p4jikacppb6am' )]")).click();
		WebElement Hidden_Ele = driver.findElement(By.xpath("//input[contains(@id ,  '_r_')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'Secret'", Hidden_Ele);
		
	}

}
