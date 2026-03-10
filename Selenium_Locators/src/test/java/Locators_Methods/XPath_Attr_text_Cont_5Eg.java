package Locators_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Attr_text_Cont_5Eg {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch a Browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window screen
		driver.manage().window().maximize();
		
		
	//Xpath Using Attribute	
	//Example 1
//		//Navigate to url
//		driver.get("https://www.geeksforgeeks.org/");
//		Thread.sleep(2000);
//		//Type something to Search
//		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Selenium", Keys.ENTER);
	
	//Example 2
		//Navigate to url
//		driver.get("https://www.instagram.com/");
//		Thread.sleep(2000);
//		//Type email id 
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("monicadhinakaran230@gmail.com");
		
	//Example 3 
//		//Navigate to url
//		driver.get("https://www.google.com/maps/@13.0549097,80.0718848,12z?entry=ttu&g_ep=EgoyMDI2MDIyMy4wIKXMDSoASAFQAw%3D%3D");
//		Thread.sleep(5000);
//		//Click on shorts to view
//		driver.findElement(By.xpath("//button[@jslog='120714; track:click;']")).click();
		
	//Example 4
//		//Navigate to browser
//		driver.get("https://www.scribd.com/document/949196581/Tosca-Documentation");
//		Thread.sleep(5000);
//		//Click on Upload
//		driver.findElement(By.xpath("//a[@class=\"ButtonCore-module_wrapper_MkTb9s ButtonShared-module_common_k3DYge SoftButton-module_wrapper_G6z4vn SoftButton-module_default_EF-egQ ButtonShared-module_small_h7nQ0w SoftButton-module_withIcon_OBSH-T\"]")).click();
		
		
	//Xpath Using Text
	//Example 1
//		//Navigate to url
//		driver.get("https://open.spotify.com/");
//		Thread.sleep(2000);
//		//Click Sign up to open
//		driver.findElement(By.xpath("//button[text() = 'Sign up']")).click();
		
	//Example 2 
//		//Navigate to url
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(2000);
//		//Click on shorts to view
//		driver.findElement(By.xpath("//yt-formatted-string[text() = 'Shorts']")).click();
		
	//Example 3
//		//Navigate to url
//		driver.get("https://web.whatsapp.com/");
//		Thread.sleep(4000);
//		//Click on log in with phone no
//		driver.findElement(By.xpath("//div[text() ='Log in with phone number']")).click();
		
		
	//XPath Using Contains
	//Example1
//		//Navigate to url
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		//Click on India
//		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
	//Example2
//		//Navigate to url
//		driver.get("https://demo.nopcommerce.com/");
//		Thread.sleep(2000);
//		//Click on condition to use
//		driver.findElement(By.xpath("//a[contains(@href,'/conditions-of-use')]")).click();
		
	//Example3
//		//Navigate to url
//		driver.get("https://www.meta.ai/");
//		Thread.sleep(2000);
//		//Click on condition to use
//		driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Give me example of the Xpath using contains (any 3)");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[aria-label='Close']")).click();
//		driver.findElement(By.xpath("//div[@class='min-h-0 min-w-0 flex justify-center items-center pe-1.5']")).click();
		
		
	}

}
