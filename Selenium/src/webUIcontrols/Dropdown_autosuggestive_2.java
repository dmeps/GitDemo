package webUIcontrols;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_autosuggestive_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("can");
		Thread.sleep(3000);
		List<WebElement> departs = driver.findElements(By.cssSelector(".ui-corner-all"));
		for (WebElement depart : departs) {
			System.out.println(depart.getText());
			if (depart.getText().equalsIgnoreCase("canada")) {
				depart.click();
				break;
			}
		}	
	}
}
