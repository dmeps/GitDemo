package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^User is on landing page$")
	public void user_on_landing_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://dmme.net");
		System.out.println("landed");
	}

	@When("^User logs into app with username and password$")
	public void user_logs_with_username_password() {
		System.out.println("login");
	}
	
	@When("^User logs into app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logs_into_app_with_username_and_password(String arg1, String arg2) {
		System.out.println(arg1 + " / " + arg2);
	}

	@Then("^Homepage is populated$")
	public void homepage_populated() {
		System.out.println("homepage");
	}

	@And("^CCs displayed: \"([^\"]*)\"$")
	public void ccs_displayed(String arg) {
		System.out.println("Cards displayed: " + arg);
	}
}
