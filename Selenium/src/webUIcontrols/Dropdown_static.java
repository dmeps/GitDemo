package webUIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_static {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lexus.ca/lexus/en");
//		driver.manage().window().maximize();
		
		Select sel1 = new Select(driver.findElement(By.className("initial-selection-province")));
		sel1.selectByValue("QC");
		Thread.sleep(1000);
		sel1.selectByIndex(2);
		Thread.sleep(1000);
		sel1.selectByVisibleText("Ontario");
		
		Select sel2 = new Select(driver.findElement(By.className("initial-selection-language")));
		sel2.selectByValue("fr");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Appliquer']")).click();
	}
}
