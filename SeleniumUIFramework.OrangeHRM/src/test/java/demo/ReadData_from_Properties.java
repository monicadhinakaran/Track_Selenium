package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadData_from_Properties {
 
	@Test
	public void readData() throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/CommonDataProperties.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String username = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		System.out.println(browser + " "+URL + " " + username + " " + pwd);
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/SampleProperties.properties");
		prop.setProperty("Canditate_username", "canditate_password");
		prop.store(fos, null);
	}
}
