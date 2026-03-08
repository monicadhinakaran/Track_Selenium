package WebDriver_Interrogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Verification {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String Exp_Title = "Demo Web Shop";
		String Title = driver.getTitle();
		
		
		//Checks the current title with expected title
		if(Title.equals(Exp_Title)) {
			System.out.println("The Navigation is Successfull");
		} else {
			System.out.println("THe Navigation is rejected");
		}
		
		driver.quit();
	}

}
