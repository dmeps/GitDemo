package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishAirways {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.britishairways.com/travel/home/public/en_in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("from")).click();
		driver.findElement(By.id("from")).sendKeys("tor");
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#from[name=\"searchEntry\"]"))).sendKeys("tor");

//		driver.findElement(By.cssSelector(".autoCompleteMatch")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.tagName("li")).click();
		driver.findElement(By.id("to")).click();
		driver.findElement(By.id("to")).sendKeys("lon");
		for (int x = 0; x < 4; x++) {
		driver.findElement(By.cssSelector(".autoCompleteMatch")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("flight-outbound-date-selector")).click();
		driver.findElement(By.xpath("//div[text()='31']")).click();
	}
}
