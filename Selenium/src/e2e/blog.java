package e2e;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lotuyonoesunadesgraciarecargado.blogspot.com/2020/11/king-crimson-on-and-off-road-40th.html");
		driver.manage().window().maximize();
		
		List<WebElement> pix = driver.findElements(By.cssSelector("[src*='jpeg']"));
		for (int a = 0; a < pix.size(); a++) {
			System.out.println(pix.get(a).getAttribute("src"));
		}
		
		driver.quit();
	}
}
