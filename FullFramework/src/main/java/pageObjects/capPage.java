package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class capPage {

	public WebDriver driver;

	By header = By.xpath("//h1[text()='One more step']");

	public capPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
