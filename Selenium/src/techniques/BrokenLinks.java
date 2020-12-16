package techniques;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert sass = new SoftAssert();
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
			int respCode = conn.getResponseCode();
//			System.out.println(respCode);
			// hard assertion: script is terminated after first broken link
			// Assert.assertTrue(respCode < 400, "Broken link: " + link.getText() + " / Code: " + respCode); 
			//soft assertion: script continues
			sass.assertTrue(respCode < 400, "Broken link: " + link.getText() + " / Code: " + respCode); 
		}
		sass.assertAll(); //mandatory to report all caught failures
		driver.quit();
	}
}