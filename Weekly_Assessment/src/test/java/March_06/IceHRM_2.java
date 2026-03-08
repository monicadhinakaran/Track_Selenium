package March_06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IceHRM_2 {

//	public static void main(String[] args) throws InterruptedException {
//		// Launch the browser
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		// Navigate to URL
//		driver.get("https://icehrmpro.gamonoid.com/login.php");
//		// Enter valid username and pwd
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("admin");
//		driver.findElement(By.xpath("//div[@class = 'form-group mb-8']/child::button")).click();
//
//		// Verify it is an home page
//		WebElement Home_Page = driver.findElement(By.xpath("//header [@id = 'delegationDiv' and @class = 'header']"));
//		if (Home_Page.isDisplayed()) {
//			System.out.println("Home Page Status : Pass");
//		} else {
//			System.out.println("Home Page Status : Fail");
//		}
//
//		// Navigate to Employees section(left side menu) and Click on Skills
//		driver.findElement(By.id("menu_admin_Employees")).click();
//		driver.findElement(By.xpath("//ul[@id = 'admin_Employees']/child::li/child::a")).click();
//		
//		//Click On filters
//		driver.findElement(By.xpath("(//div[@class ='ant-space-item'])[3]")).click();
//		
//		WebElement Dept_Search = driver.findElement(By.xpath("//label[@for = 'department']/../..//input"));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(Dept_Search));
//		Dept_Search.click();
//
//
//		
//		
////		WebElement Dept = driver.findElement(By.xpath("(//span[@class = 'ant-select-selection-wrap'])[7]"));
////		Dept.click();
////		Dept.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//		
//	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		//Username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Password
		driver.findElement(By.id("password")).sendKeys("admin");
		//Login
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		//Employee module
		driver.findElement(By.id("menu_admin_Employees")).click();
		//Employees link
		WebElement emp = driver.findElement(By.xpath("//li[@id='menu_admin_Employees']/descendant::a[contains(.,'Employees') and @style='margin-left: 10px;']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(emp));
		emp.click();
		//Filter employee
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		//Department
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='department']/../..//input")).click();
		
		



	}



}
