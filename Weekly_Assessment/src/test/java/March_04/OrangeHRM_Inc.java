package March_04;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Inc {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		String Parent_Id = driver.getWindowHandle();
		Set<String> Child_Id = driver.getWindowHandles();
		Child_Id.remove(Parent_Id);
		for(String str : Child_Id) {
			driver.switchTo().window(str);
		}
		String URL = driver.getCurrentUrl();
		if(URL.contains("orangehrm.com")) {
			System.out.println("Status URL : Pass");
		}else {
			System.out.println("Status URL : Fail");	
		}
		
		String Title = driver.getTitle();
		if(!Title.equals("")) {
			System.out.println("Title Status : Pass");
		} else {
			System.out.println("Title Status : Fail");
		}
		
		driver.close();
		
		driver.switchTo().window(Parent_Id);
		
		
		if((driver.findElement(By.name("username"))).isDisplayed()) {
			System.out.println("Login page Status : Pass");
		}else {
			System.out.println("Login page Status : Fail");	
		}
		
		driver.quit();
	}

}
