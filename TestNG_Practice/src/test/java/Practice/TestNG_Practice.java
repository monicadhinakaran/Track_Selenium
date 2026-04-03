package Practice;

import org.testng.annotations.Test;

public class TestNG_Practice {
	
	@Test
	public void LoginTest() {
		System.out.println("------ Exceuting TestMethod ------");
	}
	
	@Test(dependsOnMethods = "LoginTest")
	public void LogoutTest() {
		System.out.println("------ Exceuting TestMethod 2 ------");
	}
	
}
