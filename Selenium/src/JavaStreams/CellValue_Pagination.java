package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CellValue_Pagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");

		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		List<String> price;
		do {
		List<WebElement> cols = driver.findElements(By.xpath("//tr/td[1]"));
		price = cols.stream().filter(s -> s.getText().contains("Strawberry")).map(s -> getPrice(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		if (price.size() < 1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}		
		} while (price.size() < 1);		
		driver.quit();
	}

	private static String getPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText(); //traverse along the row to next column
		return priceValue;
	}
}
