package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOn_DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to URL
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		Thread.sleep(2000);
		
		//Click on the link
		driver.findElement(By.linkText("jdk-25.0.2_doc-all.zip")).click();
		Thread.sleep(2000);
		//Locate the disabled btn
		WebElement Disabled_Btn = driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Disabled_Btn);
	}

}
