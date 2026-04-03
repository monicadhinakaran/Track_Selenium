package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingProperties_OR {

	WebDriver driver;
	
	@Test
	public void LoginTest() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/Demo_ObjectRepository/LoginPage.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name(prop.getProperty("uname").split(":")[1])).sendKeys("Admin");
		driver.findElement(By.name(prop.getProperty("pwd").split(":")[1])).sendKeys("admin123");
		driver.findElement(By.xpath(prop.getProperty("loginbtn").split(":")[1])).click();
		
	}
}
