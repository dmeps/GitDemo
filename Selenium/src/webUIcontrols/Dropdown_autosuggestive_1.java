package webUIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_autosuggestive_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".loginModal.displayBlock.modalLogin.dynHeight.personal")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click(); //clear() - if pre-populated
		WebElement depart = driver.findElement(By.xpath("//input[@placeholder='From']"));
		depart.sendKeys("Lond");
		Thread.sleep(5000);
		for (int x = 1; x < 7; x++) {
			depart.sendKeys(Keys.ARROW_DOWN);
		}
		depart.sendKeys(Keys.ENTER);
		
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		dest.sendKeys("new yo");
		Thread.sleep(5000);
		for (int y = 1; y < 4; y++) {
			dest.sendKeys(Keys.ARROW_DOWN);
		}
		dest.sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.xpath("//span[@data-cy='defaultFromValue']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@data-cy='defaultToValue']")).getText());
	}
}
