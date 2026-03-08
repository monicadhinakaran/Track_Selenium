package WebElement_Interrogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_TagName_Getters {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//Locating About link
		
		
		WebElement Ab= driver.findElement(By.id("navbarDropdown"));
		//Get the text
		System.out.println(Ab.getText());
		//Get the TagName
		System.out.println(Ab.getTagName());
		
		//Print if it is a link or else say it's not a link
		if(Ab.getTagName().equals("a")) {
			System.out.println("This is Link to navigate");
		} else {
			System.out.println("Not, a Link to navigate");
		}
	}

}
