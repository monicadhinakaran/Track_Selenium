package com.orangehrm.seleniumuiframework.Recruitment;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumuiframework.generic_utility.Actions_Helper;
import com.orangehrm.seleniumuiframework.generic_utility.BaseClass_Recruitment_Vacancy;
import com.orangehrm.seleniumuiframework.generic_utility.Excel_Utility;
import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;

public class CreateVacancyTest extends BaseClass_Recruitment_Vacancy {

	@Test
	public void addVacancy() throws IOException {
		Actions_Helper ah = new Actions_Helper(driver);
		Excel_Utility eu = new Excel_Utility();
		RecruitmentPage rp = new RecruitmentPage(driver);
		VacanciesPage vp = new VacanciesPage(driver);
		AddVacancyPage addvp = new AddVacancyPage(driver);

		SoftAssert sa = new SoftAssert();

		// Dashboard
		dbp.clickRecruitment_module();

		// Recruitment page
		rp.clickVacancies_link();

		// Vacancies
		vp.clickAdd_btn();

		// Recruitment vacancy
		eu.loadExcelFile(
				"./src/test/resources/OrangeHRM_TestScript_Data/OrangeHRM_Recruitment_Vacancy_TestData/vacancy.xlsx",
				"AddVacancy");
		addvp.setVacancy_name(eu.getStringDataFromSingleCell(1, 1));
		ah.navigateDownDropdown(addvp.getJob_title(), 10, 2);
		addvp.setDescription_textfield(eu.getStringDataFromSingleCell(1, 2));
		ah.scrollDownAutoSuggestion(addvp.getHiringManager(), "t", 7, 1);
		addvp.setNoofPositions(eu.getStringDataFromSingleCell(1, 3));
		addvp.clickSubmit_btn();

		rp.clickVacancies_link();

		// Validation
		List<WebElement> validationVacancyName = driver
				.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));


		for (WebElement vacancy :validationVacancyName) {
			String name = vacancy.getText();
			sa.assertEquals(name, eu.getStringDataFromSingleCell(1, 1));
			if (name.equals(eu.getStringDataFromSingleCell(1, 1))) {
				Reporter.log("Test Status : Passed", true);
			} else {
				Reporter.log("failed");
			}

		}
		sa.assertAll();
	}
}