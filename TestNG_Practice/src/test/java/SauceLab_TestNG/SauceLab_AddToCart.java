package SauceLab_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class SauceLab_AddToCart extends BaseClass {

	@Test(priority = 1)
	public void logIn() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		WebElement SwagLab = driver.findElement(By.xpath("//div[ . = 'Swag Labs']"));
		if (SwagLab.isDisplayed()) {
			Reporter.log("Swag Labs Page : Pass", true);
		} else {
			Reporter.log("Swag Labs Page : Fail" , true);
			
		}

	}

	@Test(priority = 3)
	public void addToCart() {
		// Add to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		// Verify
		driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();

		List<WebElement> ProductIn = driver.findElements(By.xpath("//div[@class = 'cart_item']"));
		String res = "";
		for (WebElement CartItem : ProductIn) {
			res += CartItem.getText();
		}
		if(res.contains("Sauce Labs Backpack") && res.contains("Sauce Labs Bike Light")) {
			System.out.println("Add to Cart status : Passed");
		}
		else System.out.println("Add to Cart status : Failed");

	}
	
	@Test(priority = 7, dependsOnMethods = "logIn")
	public void logOut() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		//Verify
		WebElement Login_Logo = driver.findElement(By.xpath("//div[@class = 'login_logo']"));
		if(Login_Logo.isDisplayed()) System.out.println("Logout status : Passed");
		else System.out.println("Logout status : Failed");
	}

}
