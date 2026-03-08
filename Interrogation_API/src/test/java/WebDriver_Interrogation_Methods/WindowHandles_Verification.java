package WebDriver_Interrogation_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_Verification {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//Fetching the parent window id
		String parent_Id = driver.getWindowHandle();
		System.out.println("Parent ID : " + parent_Id);
		//Fetching the child window id
		driver.findElement(By.xpath("//h2[. ='Watches']/..//button[. = 'view more']")).click();
		Thread.sleep(2000);
		//Here, it gives parent ID while printing child ID
		String child_Id = driver.getWindowHandle();
		System.out.println("Chils ID : "+ child_Id);
		
		
		//Print the Entire ID Child ID
		Set<String> Id = driver.getWindowHandles();
		System.out.println("SET<STRING> INCLUDING PARENT, CHILD: "+Id);
		
		//Removing parent id from the set<>
		Id.remove(parent_Id);
		//Now, print the set
		System.out.println("SET<STRING> ONLY CHILD : " + Id);
		
		//Fetching the Child ID out of the collection
		for(String str: Id) {
			System.out.println("Return as a String : " +str);
		}
		Thread.sleep(2000);
		driver.quit();		
	}

}
