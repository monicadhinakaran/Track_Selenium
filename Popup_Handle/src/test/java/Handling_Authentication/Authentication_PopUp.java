package Handling_Authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PopUp {

	public static void main(String[] args) throws InterruptedException {

		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to URL
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
	}

}
