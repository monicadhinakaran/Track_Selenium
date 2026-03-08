package Hidden_Division_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC_Calender_HiddenPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		// Launch the browser
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to url
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		
		//Close the alert
		driver.findElement(By.xpath("//button[@type = 'submit' and . = 'OK']")).click();
		
		//Choose the date 
		driver.findElement(By.xpath("//span[@class = 'ng-tns-c69-9 ui-calendar']")).click();
		
		
		driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title ng-tns-c69-9']/../following-sibling::div/child::table/child::tbody/child::tr[2]/child::td[4]")).click();
		//driver.findElement(By.xpath("//a[. = '11']")).click();
		
		
	}

}
