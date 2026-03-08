package Handling_PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Pop {

	public static void main(String[] args) throws InterruptedException {

		//Launch a browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//Click on view more and trigger child window popup
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		String Parent_Id = driver.getWindowHandle();
		Set<String> Child_Id = driver.getWindowHandles();
		Child_Id.remove(Parent_Id);
		for(String str : Child_Id) {
			driver.switchTo().window(str);
		}
		
		//Child window opens and click on Add to cart for 2 tyms and click the add to cart to view items
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[local-name() = 'svg' and @class ='text-[40px] absolute top-0 right-0 text-orange-500']")).click();
		Thread.sleep(2000);
		
		//Check whether it is displayed
		WebElement Ele_Display = driver.findElement(By.tagName("h2"));
		if(Ele_Display.isDisplayed()) {
			System.out.println("Testcase status : Passed");
		} else {
			System.out.println("Testcase status : Failed");
		}
		
		driver.quit();
 	}

}
