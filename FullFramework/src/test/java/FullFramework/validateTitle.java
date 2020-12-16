package FullFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class validateTitle extends base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	landingPage lap;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initDriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Homepage");
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateAppTitle() throws Exception {
		lap = new landingPage(driver);
		Assert.assertEquals(lap.getTitle().getText(), "Featured Curses");
		log.info("Successfully validated text");
	}
	
	@Test
	public void validateHeader() throws Exception {
		Assert.assertEquals(lap.getHeader().getText(), "World class Tutorials on Selenium, Rest Assured, Protractor, SoapUI, Appium, Cypress, Jmeter, Cucumber, Jira and many more!");
		log.info("Successfully validated header");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
