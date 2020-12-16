package basicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dmme.net");
		
		driver.findElement(By.id("s")).sendKeys("Glenn");
		driver.findElement(By.cssSelector("input[type*='submi']")).click(); //css contains //or "[type*='submi']"
		driver.findElement(By.id("s")).sendKeys(" Hughes");
		driver.findElement(By.xpath("//input[contains(@type, 'subm')]")).click(); //xpath contains // "//*[contains(@type, 'subm')]"
	}
}
