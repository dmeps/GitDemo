package sync;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
////		Explicit Wait
//		WebDriverWait w = new WebDriverWait(driver, 10);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));

		WebElement message = driver.findElement(By.cssSelector("#finish h4"));

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		/* WebElement foo = */ wait.until(new Function<WebDriver, WebElement>() { /* WebElement is needed if FluentWait 
																					is to be used more than once */
			public WebElement apply(WebDriver driver) {
				if (message.isDisplayed()) {
					return message;
				} else
					return null;
			}
		});
		System.out.println(message.getText());
		driver.quit();
	}
}
