package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadData_from_Excel {

	@Test
	public void test() throws EncryptedDocumentException, IOException {
		
//		File file = new File("D:\\Capgemini_Selenium_Train\\OrangeHRM_TestScriptData\\vacancy.xlsx");
//		System.out.println(file.exists()); // should print true
		
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_TestScript_Data/OrangeHRM_Recruitment_Vacancy_TestData/vacancy.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("AddVacancy");

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//			Row row = sheet.getRow(i);
//			Cell cell = row.getCell(1);
//			String vacancyName = cell.getStringCellValue();
			
			String vacancyName = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(vacancyName);
		}
		workbook.close();
	}
}
