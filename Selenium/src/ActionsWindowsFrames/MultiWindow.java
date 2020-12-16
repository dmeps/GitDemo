package ActionsWindowsFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thesource.ca/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[alt*='The PS5']")).click();
//		System.out.println(driver.getWindowHandles().size());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		System.out.println(driver.switchTo().window(childID).getTitle());
		System.out.println(driver.switchTo().window(parentID).getTitle());
		
		driver.quit();
	}
}
