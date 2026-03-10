package Locators_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Eg1_Recruitment {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Login the site
		//Type username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//Type Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Click on login to log the site
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//Entered into the main site
		//Click on recruitment to add
		driver.findElement(By.xpath("//a[ @href='/web/index.php/recruitment/viewRecruitmentModule' ]")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		//Adding user with their firstname, lastname and email and then add
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shakthi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Priyaa");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("shakthithiru04@gmail.com");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//Checks whether the page is displayed
		WebElement storeEle = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"]"));
		if(storeEle.isDisplayed()) {
			System.out.println("Page is displayed successully");
		}else {
			System.out.println("Not expected, please correct it");
		}
		
		
	}

}
