package Assert_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Equals {

	@Test
	public void demoTest() {
		String Exp_Value = "PECC";
		String Actual_Value = "PECC";
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(Exp_Value, Actual_Value);
		
		//Soft Assert - using if else
		if(Actual_Value.equals(Exp_Value)) {
			System.out.println("Status : Passed");
		} else {
			System.out.println("Status : Failed");
		}
		
		as.assertAll();
	}
}
