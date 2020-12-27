package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	static ExtentReports reports;

	public static ExtentReports getReportObj() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; //dynamic project path + folder for storing reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "DME");	
		
		return reports;
	}

}
