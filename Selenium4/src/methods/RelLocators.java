package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement pass = driver.findElement(By.id("exampleInputPassword1"));
		System.out.println(driver.findElement(withTagName("label").above(pass)).getText());
		System.out.println(driver.findElement(withTagName("label").below(pass)).getText());
		
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dob)).sendKeys("03071974");
		
		WebElement txt = driver.findElement(By.className("form-check-label"));
		driver.findElement(withTagName("input").toLeftOf(txt)).click();
		
		WebElement rb = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
		driver.findElement(withTagName("input").toRightOf(rb)).click();
		
		WebElement RB = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(RB)).getText());
	}

}
