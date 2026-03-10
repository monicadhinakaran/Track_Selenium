package Locators_Methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_method_Eg1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
//		driver.manage().window().setSize(new Dimension(768, 566));
//		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-7, -7));
		System.out.println(driver.manage().window().getPosition());
	}

}
