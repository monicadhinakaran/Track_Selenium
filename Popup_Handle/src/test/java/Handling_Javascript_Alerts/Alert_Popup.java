package Handling_Javascript_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//Clicking on button to get Popup
		driver.findElement(By.xpath("//button[@class ='btn btn-danger']")).click();
		Thread.sleep(2000);
		
		//Click Accept the Popup
		driver.switchTo().alert().accept();
	}

}
