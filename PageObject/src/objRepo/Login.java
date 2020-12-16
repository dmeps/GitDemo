package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("login1");
	By password = By.id("password");
	By button = By.name("proceed");
	By home = By.linkText("rediff.com");
	
	public WebElement Username() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Submit() {
		return driver.findElement(button);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
}
