package StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.capPage;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class StepDefinition extends base {
	
	@Given("^Launch Chrome$")
	public void launch_Chrome() throws Exception {
		driver = initDriver();
	}

	@Given("^Navigate to the \"([^\"]*)\" site$")
	public void navigate_to_the_site(String arg) {
		driver.get(arg);
		driver.manage().window().maximize();
	}

	@Given("^Click the Login link on Homepage to land on Sign In page$")
	public void click_the_Login_link_on_Homepage_to_land_on_Sign_In_page() {
		landingPage lap = new landingPage(driver);
		if (lap.getPopUpSize() > 0) {
			lap.getPopUp().click();
		}
		lap.SignIn();
	}

	//No parameters
//	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" and log in$")
//	public void enter_and_and_log_in(String arg1, String arg2) {
//		loginPage lop = new loginPage(driver);
//		lop.getEmail().sendKeys(arg1);
//		lop.getPassword().sendKeys(arg2);
//		lop.getBtn().click();
//	}
	
	//With parameters
	@When("^Enter (.+) and (.+) and log in$")
	public void enter_and_and_log_in(String username, String password) {
		loginPage lop = new loginPage(driver);
		lop.getEmail().sendKeys(username);
		lop.getPassword().sendKeys(password);
		lop.getBtn().click();
	}

	@Then("^Verify successful login$")
	public void verify_successful_login() {
		capPage cp = new capPage(driver);
		Assert.assertTrue(cp.getHeader().isDisplayed());
	}
	
	@Then("^Close browser$")
	public void close_browser() {
		driver.quit();
	}
}
