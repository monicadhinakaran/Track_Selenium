package Handling_Javascript_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//Click on Alert with textbox and click button
		driver.findElement(By.partialLinkText("Alert with Text")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick = 'promptbox()']")).click();
		Thread.sleep(2000);
		//Handling popup by writing the text
		Alert PopUp = driver.switchTo().alert();
		PopUp.sendKeys("Monica Dhinakaran");
		PopUp.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
