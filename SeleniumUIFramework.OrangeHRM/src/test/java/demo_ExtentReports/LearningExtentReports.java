package demo_ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {

	@Test
	public void practice() {
		//Create a new Test
		ExtentReports test = new ExtentReports();
		//Create a reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");
		test.attachReporter(spark);
		
		ExtentTest ref = test.createTest("Sample Test");
		
		//Logging
		ref.info("--Started test execution--");
		ref.info("--Test step has passed--");
		ref.info("--Test step has failed--");
		
		//write the report
		test.flush();
	}
}
