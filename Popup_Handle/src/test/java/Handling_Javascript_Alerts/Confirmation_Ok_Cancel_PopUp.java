package Handling_Javascript_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Ok_Cancel_PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//Click on Alert with OK button and then Click to present alert
		driver.findElement(By.partialLinkText("Alert with OK & Cance")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']")).click();
		//Handle the alert by clicking okay
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		driver.switchTo().alert().dismiss();
		
		driver.quit();
	}

}
