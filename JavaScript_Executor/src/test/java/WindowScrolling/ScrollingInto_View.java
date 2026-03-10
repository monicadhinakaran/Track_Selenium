package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInto_View {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to URL
		driver.get("https://doodles.google/");
		Thread.sleep(2000);
		
		WebElement Ele = driver.findElement(By.className("question-wrapper"));
		
		//Scolling Into View -> locating using True
		JavascriptExecutor js_True = (JavascriptExecutor) driver;
		js_True.executeScript("arguments[0].scrollIntoView(true)", Ele);
		Thread.sleep(2000);
		
		//Scolling Into View -> locating using False
		JavascriptExecutor js_False = (JavascriptExecutor) driver;
		js_False.executeScript("arguments[0].scrollIntoView(false)", Ele);
		Thread.sleep(2000);
		
		//Scolling Into View -> locating using Default - True
		JavascriptExecutor js_Default = (JavascriptExecutor) driver;
		js_Default.executeScript("arguments[0].scrollIntoView()", Ele);
		Thread.sleep(2000);
	}

}
