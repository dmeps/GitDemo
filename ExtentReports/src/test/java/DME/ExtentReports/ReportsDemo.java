package DME.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsDemo {
	ExtentReports reports;
	
	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; //dynamic project path + folder for storing reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "DME");
	}
	
	@Test
	public void initialDemo() {
		ExtentTest test = reports.createTest("Initial Demo"); //object for test
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dmme.net");
		System.out.println(driver.getTitle());
		driver.quit();
		test.fail("Results don't match"); //failing the test for report
		reports.flush();
	}
}
