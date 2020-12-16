package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		
		driver.findElement(By.id("search-field")).sendKeys("to");
		List<WebElement> vegs = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filteredVegs = vegs.stream().filter(s -> s.getText().contains("to")).collect(Collectors.toList());

//		Assert.assertTrue(vegs.equals(filteredVegs));
		Assert.assertEquals(vegs.size(), filteredVegs.size());
		driver.quit();
	}
}
