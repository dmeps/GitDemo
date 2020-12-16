package tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		ArrayList<String> srcList = new ArrayList<String>();
		int colNum = cols.size();		
		for (int a = 0; a < colNum; a++) {
			srcList.add(cols.get(a).getText()); //adding text values to array
		}
		ArrayList<String> destList = new ArrayList<String>();
		for (int a = 0; a < srcList.size(); a++) {
			destList.add(srcList.get(a)); //copying arrayList 
		}
		
		Collections.sort(destList);
//		Collections.reverse(destList);
		Assert.assertTrue(srcList.equals(destList));
		
//		driver.quit();
	}
}
