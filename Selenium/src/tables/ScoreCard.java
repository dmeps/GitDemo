package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScoreCard {

	public static void main(String[] args) {
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29053/eng-vs-wi-1st-test-west-indies-tour-of-england-2020");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		List<WebElement> cols = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")); //parent > child
		int colCount = cols.size();
		for (int a = 0; a < colCount-2; a++) { //-2 to remove extra text
			String value = cols.get(a).getText();
			int add = Integer.parseInt(value);
			sum += add;
		}
		String extras = driver.findElement(By.xpath("//*[text() = 'Extras']/following-sibling::div")).getText(); //sibling > sibling
		int last = Integer.parseInt(extras); 
		sum += last;
		String total = driver.findElement(By.xpath("//*[text() = 'Total']/following-sibling::div")).getText();
		int totalResult = Integer.parseInt(total);
		
		Assert.assertEquals(sum, totalResult);
		
		driver.quit();
	}
}
