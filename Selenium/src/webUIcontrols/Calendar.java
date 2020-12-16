package webUIcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click(); //current date
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("February")) {
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		int count = dates.size();
		for (int a = 0; a < count; a++) {
			String x = dates.get(a).getText();
			if (x.equalsIgnoreCase("19")) {
				dates.get(a).click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("view_fulldate_id_1")).getText());

		// Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		// //doesn't work
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true); // or Assert.assertTrue(false);
			System.out.println("Element is enabled");
		}

		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click(); //current date
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
		System.out.println(driver.findElement(By.id("view_fulldate_id_2")).getText());

//		driver.quit();
	}
}
