package webUIcontrols;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_autosuggestive_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement ac = driver.findElement(By.id("autocomplete"));
		ac.sendKeys("can");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		List<WebElement> countries = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		int x = countries.size();
		for (int a = 0; a < x; a++) {
			String co = countries.get(a).getText();
			ac.sendKeys(Keys.ARROW_DOWN);
			if (co.equalsIgnoreCase("canada")) {
//				countries.get(a).click();
				break;
			}
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String scr = "return document.getElementById(\"autocomplete\").value";
		String text = (String) jse.executeScript(scr);
		System.out.println(text);
		System.out.println(ac.getAttribute("value"));
	}
}
