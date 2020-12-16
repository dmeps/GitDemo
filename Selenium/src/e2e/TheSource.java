package e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thesource.ca/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.id("desktop-nav-button")).click();
		for (int a = 1; a < 5; a++) {
			driver.findElement(By.id("desktop-nav-button")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//*[text()='All Headphones']")).click();
		List<WebElement> phones = driver
				.findElements(By.cssSelector(".head.productMainLink.productMainLinkCut.desktop-only.truncate"));
		for (int a = 0; a < phones.size(); a++) {
			String model = phones.get(a).getText();
			System.out.println(model);
			if (model.contains("Bose")) {
				driver.findElements(By.xpath("//*[@class='button primary-button addToCartButton']")).get(a).click();
				break;
			}
		}
	}
}