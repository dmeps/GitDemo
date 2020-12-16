package techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/");
		driver.manage().window().maximize();

		WebElement el = driver.findElement(By.cssSelector("#fromPlaceName"));
		el.sendKeys("Beng");
		el.sendKeys(Keys.DOWN);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) jse.executeScript(script);
		
		int x = 0; //var in case the value's not present
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			x++;
			el.sendKeys(Keys.DOWN);
			text = (String) jse.executeScript(script);
			if (x > 10) {
				System.out.println("Not Found");
				break;
			}
		}

		System.out.println(text);

//		driver.quit();
	}
}
