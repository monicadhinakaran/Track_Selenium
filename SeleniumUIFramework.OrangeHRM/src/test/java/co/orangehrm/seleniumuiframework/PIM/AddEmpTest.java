package co.orangehrm.seleniumuiframework.PIM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumuiframework.generic_utility.BaseClass_Recruitment_Vacancy;
import com.orangehrm.seleniumuiframework.generic_utility.Excel_Utility;
import com.orangehrm.seleniumuiframework.generic_utility.JavaScriptExceutor_Utility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriver_Utility;
import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.PimPage;

public class AddEmpTest extends BaseClass_Recruitment_Vacancy {

	@Test
	public void AddEmployee() throws EncryptedDocumentException, IOException {

		WebDriver_Utility wdu = new WebDriver_Utility(driver);
		DashboardPage dbp = new DashboardPage(driver);
		PimPage pp = new PimPage(driver);
		AddEmployeePage aep = new AddEmployeePage(driver);
		JavaScriptExceutor_Utility jeu = new JavaScriptExceutor_Utility(driver);
		Excel_Utility eu = new Excel_Utility();
		SoftAssert sa = new SoftAssert();


		// Navigate to PIM
		dbp.clickPim_module();
		// Add user
		pp.clickAdd_btn();

		// Excel sheet load
		eu.loadExcelFile(
				"./src/test/resources/OrangeHRM_TestScript_Data/OrangeHRM_Recruitment_Vacancy_TestData/pim_AddEmp.xlsx",
				"AddEmp");

		// Add Emp and save
		aep.addEmp(eu.getStringDataFromSingleCell(1, 1), eu.getStringDataFromSingleCell(1, 2),
				eu.getStringDataFromSingleCell(1, 3), eu.getStringDataFromSingleCell(1, 6));
		// Force the toggle to click
		jeu.clickForceTheElement(aep.getCreatelogin_toggle());
		aep.createCreditionals(eu.getStringDataFromSingleCell(1, 4), eu.getStringDataFromSingleCell(1, 5));

		
		// Verify - assert
		WebElement Fname_verify = driver.findElement(By.name("firstName"));
		sa.assertTrue((Fname_verify.getAttribute("value")).contains("Roha"));
		if (Fname_verify.getAttribute("value").contains("Roha")) {
			Reporter.log("Test Status : Pass ", true);
		} else {
			Reporter.log("Test Status : Fail", true);
		}
		sa.assertAll();

	}
}
