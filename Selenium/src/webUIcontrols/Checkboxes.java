package webUIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement cb = driver.findElement(By.cssSelector("*[id*='SeniorCitizenDiscount']"));
		Assert.assertFalse(cb.isSelected());
		cb.click();
		Assert.assertTrue(cb.isSelected());
		//number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("*[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("*[type='checkbox']")).size(), 5);
	}
}
