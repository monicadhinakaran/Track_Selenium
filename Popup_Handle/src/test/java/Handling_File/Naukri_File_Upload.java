package Handling_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_File_Upload {

	public static void main(String[] args) throws InterruptedException {
		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		//Click on register an thn click experienced then upload resume
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\monic\\OneDrive\\Documents\\Monica Resume.pdf");

	}

}
