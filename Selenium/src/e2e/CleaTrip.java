package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleaTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cleartrip.com/");
		driver.manage().window().maximize();

		//"Your connection is not private" bypass
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();

		//Passengers
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByIndex((int) (Math.random() * 9));
//		Select kids = new Select(driver.findElement(By.id("Childrens")));
//		kids.selectByIndex((int) (Math.random() * 8));

		//Calendar
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);

		//Options
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select flightClass = new Select(driver.findElement(By.id("Class")));
		flightClass.selectByIndex(3);
		driver.findElement(By.name("airline")).sendKeys("British Airlines");
		
		WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("tor");
		Thread.sleep(2000);
		for (int a = 0; a < 4; a++) {
			from.sendKeys(Keys.ARROW_DOWN);
		}
		from.click();
		
		//Submit & Error
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}
}
