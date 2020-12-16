package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	private By email = By.id("user_email");
	private By password = By.id("user_password");
	private By logBtn = By.name("commit");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getBtn() {
		return driver.findElement(logBtn);
	}
	
	public capPage capP() {
		return new capPage(driver);
	}
}
