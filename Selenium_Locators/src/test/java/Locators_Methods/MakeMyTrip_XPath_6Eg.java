package Locators_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_XPath_6Eg {

	public static void main(String[] args) throws InterruptedException {
		
		//LAunch the browser
		WebDriver driver = new ChromeDriver();
		//Navigating the url
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|&ef_id=:G:s");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//font[. ='Offers']/parent::h2/parent::div/following-sibling::div/child::div/child::button/following-sibling::div/child::div/child::div/child::div/following-sibling::div/child::div[@data-cy=\"suUrl-1\"]/child::div[@class=\"makeFlex column itemCard\"]/child::div[@class='sliderFoot']/child::div/child::a[. = 'BOOK NOW']")).click();
		
		driver.findElement(By.xpath("//p[@data-cy=\"superOfferPtl1\"]/../../..//a[@data-cy=\"superOfferCtaText1\"]")).click();
	}

}
