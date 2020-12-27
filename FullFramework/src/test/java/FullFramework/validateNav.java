package FullFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class validateNav extends base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initDriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Homepage");
		driver.manage().window().maximize();
	}
	@Test
	public void basePageNav() throws IOException, Exception {
		landingPage lap = new landingPage(driver);
		Assert.assertTrue(lap.getNav().isDisplayed());
		log.info("Successfully validated nav bar");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
