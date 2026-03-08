package March_06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IceHRM_1 {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to URL
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		//Click Login without username and pwd
		driver.findElement(By.xpath("//button[@type = 'button' and @class = 'btn btn-info btn-medium w-100 text-uppercase']")).click();
		// Validate that an error validation message appears indicating required fields.
		
		//Enter invalid username and pwd and click login
		driver.findElement(By.id("username")).sendKeys("Heloo");
		driver.findElement(By.id("password")).sendKeys("hell");
		driver.findElement(By.xpath("//div[@class = 'form-group mb-8']/child::button")).click();
		
		//Validate that the application displays invalid credential error message.
		WebElement Alert = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']"));
		if(Alert.isDisplayed()) {
			System.out.println("Alert Status : Pass");
		} else {
			System.out.println("Alert Status : Fail");
		}
		
		//Enter valid username and pwd
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class = 'form-group mb-8']/child::button")).click();
		
		//Verify it is an home page
		WebElement Home_Page = driver.findElement(By.xpath("//header [@id = 'delegationDiv' and @class = 'header']"));
		if(Home_Page.isDisplayed()) {
			System.out.println("Home Page Status : Pass");
		} else {
			System.out.println("Home Page Status : Fail");
		}
		
		// Navigate to Employees section(left side menu) and Click on Skills
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.xpath("//ul[@id = 'admin_Employees']/child::li/child::a")).click();
		driver.findElement(By.xpath("//a[ @id = 'tabEmployeeSkill']")).click();
		
		driver.findElement(By.xpath("(//div[@class = 'ant-space-item']/child::button)[4]")).click();
		driver.findElement(By.xpath("(//button[@type = 'button'])[30]")).click();
		
		//Logout
		driver.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@class = 'btn btn-default btn-flat'])[2]")).click();
		
		driver.quit();
	}

}
