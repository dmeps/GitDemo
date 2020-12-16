package techniques;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		//1. Overall links on a page
		System.out.println("1. " + driver.findElements(By.tagName("a")).size());

		//2. Links in the footer - limiting driver's scope - mini-driver
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("2. " + footerDriver.findElements(By.tagName("a")).size());

		//3. Links in the footer's first column
		WebElement colDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("3. " + colDriver.findElements(By.tagName("a")).size());

		//4. Check if the column links are valid
		int x = colDriver.findElements(By.tagName("a")).size();
		for (int a = 1; a < x; a++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			colDriver.findElements(By.tagName("a")).get(a).sendKeys(clickOnLinkTab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
