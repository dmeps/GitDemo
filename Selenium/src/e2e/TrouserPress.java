package e2e;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrouserPress {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trouserpress.com/magazine-covers-10/");
		driver.manage().window().maximize();
		
		List<WebElement> zine = driver.findElements(By.cssSelector(".read-issue"));
		
		int x = zine.size();
		
		for (int a = 0; a < x; a++) {
			zine.get(a).click();
			driver.switchTo().frame(0);
			driver.findElement(By.id("download")).click();
			driver.switchTo().defaultContent();
			driver.navigate().back();
			Thread.sleep(2000);
		}
	}
}
