package Practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class DemoTest_TestNG {

	@Test(priority = -1)
	public void login(Method m1) {
		System.out.println("Exceuting  " + m1);
	}
	
	@Test(priority = 1, dependsOnMethods = "login")
	public void addEmp(Method m2) {
		System.out.println("Exceuting  " + m2);
	}
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logOut(Method m3) {
		System.out.println("Exceuting  " + m3);
	}

}
