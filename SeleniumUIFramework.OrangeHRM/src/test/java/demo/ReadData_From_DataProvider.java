package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData_From_DataProvider {

	@DataProvider(name = "KeyValueData")
	public Object[][] getData(){
		return new Object[][] {
			{"browser","chrome" , "1"},
			{"username","Admin", "2"},
			{"password","admin123", "3"},
		};		
	}
	
	@DataProvider(name = "KeyValueData-1")
	public Object[][] getInfo(){
		return new Object[][] {
			{"browser","firefox" , "1"},
			{"username","user", "2"},
			{"password","user123", "3"},
		};		
	}
	
	
	
	@Test(dataProvider = "KeyValueData")
	public void Readfrom_DataProvider(String key, String value,String data) {
		System.out.println(key + "   " + value+ "  " + data);
	}
}
