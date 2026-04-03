package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadData_From_CSVFile {

	@Test
	public void readCsvFile() throws IOException {
		String line =  "";
		String split = " , ";
		BufferedReader br = new BufferedReader(new FileReader("./src/test/resources/OrangeHRM_TestScript_Data/OrangeHRM_Recruitment_Vacancy_TestData/sample.csv"));
		
		
		while((line =  br.readLine())!= null) {
			String data[] = line.split(",");
			String d1 = data[0];
			String d2 = data[1];
			System.out.println(d1 + "     " + d2);
		}
	}
}
