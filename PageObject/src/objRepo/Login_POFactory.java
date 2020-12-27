package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POFactory {
	WebDriver driver;
	
	public Login_POFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="proceed")
	WebElement button;
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement Username() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Submit() {
		return button;
	}
	
	public WebElement Home() {
		return home;
	}
}
