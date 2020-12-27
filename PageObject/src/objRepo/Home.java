package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.id("srchword");
	By button = By.className("newsrchbtn");
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement Submit() {
		return driver.findElement(button);
	}
}
