package e2e;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviews {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dmme.net/interviews.html/");

		List<WebElement> inter = driver.findElements(By.cssSelector("[href*='http://dmme.net/interviews/']"));
		int x = inter.size();
		for (int a = 0; a < x; a++) {
//			inter.get(a).click();
			List<WebElement> months = driver.findElements(By.cssSelector("[href*='http://dmme.net/interviews/']"));
			int y = months.size();
			if (y > 0) {
			months.get(a).click();
			String month = driver.findElement(By.cssSelector("h3 strong")).getText();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			System.out.println(month);
			// inner loop
			} else {
				for (int s = 0; s < y; y++) {
				System.out.println(driver.findElements(By.cssSelector("[href*='http://dmme.net/interviews/']")).get(s).getText());
				}
			}
			// end of inner loop
			driver.navigate().back();
		}
	}
}