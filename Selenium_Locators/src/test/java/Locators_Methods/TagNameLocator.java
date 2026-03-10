package Locators_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement ele : list) {
			System.out.println(ele);
		}
		
		for(WebElement ele : list) {
			if(ele.getText().equals("Store")) {
				driver.findElement(By.linkText("Store")).click();
				break;
			}
			
		}
	}

}
