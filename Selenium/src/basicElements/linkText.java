package basicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dmme.net");
		
			driver.findElement(By.id("s")).sendKeys("Glenn");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			System.out.println(driver.findElement(By.partialLinkText("Hughes")).getText());
			driver.findElement(By.partialLinkText("Hughes")).click();
//			System.out.println(driver.findElement(By.cssSelector("#post-30525 > div.entry-content.clearfix > p:nth-child(2)")).getText());
			System.out.println(driver.findElement(By.xpath("//div[@class='entry-content clearfix']/p[2]")).getText());
	}
}