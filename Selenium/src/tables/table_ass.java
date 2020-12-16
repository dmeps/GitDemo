package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_ass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement tablex = driver.findElement(By.id("product"));
		List<WebElement> rows = tablex.findElements(By.tagName("tr"));
		System.out.println("Rows: " + rows.size());
		List<WebElement> cols = tablex.findElements(By.tagName("th"));
		System.out.println("Columns: " + cols.size());
		String SecRow = tablex.findElement(By.xpath("//tr[3]")).getText();
		System.out.println("2nd row: " + SecRow);

		driver.quit();
	}
}
