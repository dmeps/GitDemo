package e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		//One-Way vs. Round Trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(2000);
		//Route	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
		//Date
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("May")) {
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> dates1 = driver.findElements(By.className("ui-state-default"));
		int count1 = dates1.size();
		for (int b = 0; b < count1; b++) {
			String y = dates1.get(b).getText();
			if (y.equalsIgnoreCase("25")) {
				dates1.get(b).click();
				break;
			}
		}
		//Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int x = 1; x < 3; x++) {
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		}
		for (int x = 0; x < 2; x++) {
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).click();
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_Infant")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Infant")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//Currency
		Select sel = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		sel.selectByValue("USD");
		//Discount category
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		//Submit
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		Assert.assertEquals(driver.getCurrentUrl(), "https://book.spicejet.com/Select.aspx");
		driver.quit();
	}
}
