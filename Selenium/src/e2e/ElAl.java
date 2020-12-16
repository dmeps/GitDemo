package e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElAl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.elal.com/");
		driver.manage().window().maximize();

		WebElement origin = (driver.findElement(By.id("outbound-origin-location-input")));
		origin.clear();
		origin.sendKeys("lon");
		Thread.sleep(2000);
		for (int a = 0; a < 4; a++) {
			origin.sendKeys(Keys.ARROW_DOWN);
		}
		origin.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.id("outbound-destination-location-input"));
		destination.clear();
		destination.sendKeys("tel");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		calendar(driver, "April", "5", "td[id*='2021-04']");
		calendar(driver, "June", "18", "td[id*='2021-06']");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String oscript = "return document.getElementById(\"outbound-departure-calendar-input\").value";
		String out = (String) jse.executeScript(oscript);
		String iscript = "return document.getElementById(\"returnBound-return-calendar-input\").value";
		String in = (String) jse.executeScript(iscript);
		System.out.println("Out: " + out + " In: " + in);
		
		driver.findElement(By.cssSelector(".ui-button.ui-button--large-wide")).click();

		driver.findElement(By.cssSelector(".search-flyout__header.ng-tns-c25-1")).click();
		WebElement adults = driver.findElement(By.xpath("//button[@aria-label='Increase Adult']"));
		for (int y = 1; y < 4; y++) {
			adults.click();
		}
		WebElement baby = driver.findElement(By.xpath("//button[@aria-label='Increase Baby']"));
		for (int z = 0; z < 3; z++) {
			baby.click();
		}

		System.out.println("Adults: "
				+ driver.findElement(By.cssSelector(".search-input-counters__count.ng-tns-c27-0")).getText());
		System.out.println("Babies: " + driver
				.findElement(By.xpath(
						"//*[@class='search-input-counters__counter ng-tns-c27-0 ng-star-inserted'][3]/div/span")).getText());

		driver.findElement(By.xpath("//button[@aria-label='Find flights']")).click();
	}

	public static void calendar(WebDriver driver, String month, String day, String select) {
		while (!driver.findElement(By.xpath("//div[contains(@class,'search')]")).getText().contains(month)) {
			driver.findElement(By.cssSelector(".search-dates__nav.search-dates__nav--next")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(select));
		int count = dates.size();
		for (int a = 0; a < count; a++) {
			String x = dates.get(a).getText();
			if (x.equalsIgnoreCase(day)) {
				dates.get(a).click();
			}
		}
	}
}
