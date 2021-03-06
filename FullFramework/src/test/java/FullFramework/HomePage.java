package FullFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.capPage;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initDriver();
	}
	
	@Test(dataProvider = "getData")
	public void basePageNav(String email, String password, String text) throws IOException, Exception {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		landingPage lap = new landingPage(driver);
		loginPage lop = lap.SignIn();

		lop.getEmail().sendKeys(email);
		lop.getPassword().sendKeys(password);
		log.info(text);
		lop.getBtn().click();
		
		capPage cp = lop.capP();
		Assert.assertTrue(cp.getHeader().isDisplayed());
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[2][3];
		data[0][0] = "dmitry@epstein.to";
		data[0][1] = "musik111";
		data[0][2] = "Existing user";
		data[1][0] = "dmepst@gmail.com";
		data[1][1] = "qamusik111";
		data[1][2] = "Non-existing user";
		return data;
	}
}