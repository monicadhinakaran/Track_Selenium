package Assert_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Equals {

	@Test
	public void testMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String Exp_Title = "Google";

		//Hard Assert -- Direct
		Assert.assertEquals(driver.getTitle(), Exp_Title);
		//hard Assert -- Using If - else
		if(driver.getTitle().equals(Exp_Title)) {
			System.out.println("Status : Passed");
		} else {
			System.out.println("Status : Failed");
		}
	}
}
