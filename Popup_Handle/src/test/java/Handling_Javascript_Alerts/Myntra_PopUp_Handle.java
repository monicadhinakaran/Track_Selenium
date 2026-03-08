package Handling_Javascript_Alerts;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Myntra_PopUp_Handle {

	public static void main(String[] args) throws InterruptedException {

		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);

		// Search for Dress and click on first product
		driver.findElement(By.tagName("input")).sendKeys("Dresses", Keys.ENTER);
		driver.findElement(By.xpath("//img[@title ='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']"))
				.click();
		Thread.sleep(2000);

		// Click on view more and trigger child window popup
		String Parent_Id = driver.getWindowHandle();
		Set<String> Child_Id = driver.getWindowHandles();
		Child_Id.remove(Parent_Id);
		for (String str : Child_Id) {
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class = 'myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']"))
				.click();

		// Verify it is displayed
		WebElement Login_Verify = driver.findElement(By.xpath("//input[@type ='tel']"));
		if (Login_Verify.isDisplayed()) {
			System.out.println("Testcase Status : Passed");
		} else {
			System.out.println("Testcase Status : Failed");
		}
		
		driver.quit();
	}

}
