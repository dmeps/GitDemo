package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("[href*='sign_in']");
	private By title = By.xpath("//h2[text() = 'Featured Courses']");
	private By nav = By.cssSelector(".navigation.clearfix");
	private By header = By.cssSelector("[class*='col-md-6'] h3");
	private By popup = By.xpath("//button[text='NO THANKS']");
	
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public loginPage SignIn() {
		driver.findElement(signin).click();
		return new loginPage(driver);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNav() {
		return driver.findElement(nav);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	
	public int getPopUpSize() {
		return driver.findElements(popup).size();
	}
	
	public WebElement getPopUp() {
		return driver.findElement(popup);
	}
}
