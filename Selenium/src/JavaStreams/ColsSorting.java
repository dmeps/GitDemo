package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ColsSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");

		WebElement table = driver.findElement(By.cssSelector(".table.table-bordered"));
		//double-click for the test to pass
		table.findElement(By.cssSelector("tr th:nth-child(1)")).click(); //desc order
//		table.findElement(By.cssSelector("tr th:nth-child(2)")).click(); //asc order
		List<WebElement> cols = table.findElements(By.cssSelector("tr td:nth-child(1)")); //grabbing column
		List<String> srcList = cols.stream().map(s->s.getText()).collect(Collectors.toList()); //mapping original WebElements 
																						//to getText() and collecting them to list
		List<String> destList = srcList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(srcList.equals(destList)); //comparing original list (sorted by clicking header) with a new list
													 //sorted with sorted()
	}
}
