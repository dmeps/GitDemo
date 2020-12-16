package ActionsWindowsFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Here")).click();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> iter = wins.iterator();
		String par = iter.next();
		String ch = iter.next();
		System.out.println(driver.switchTo().window(ch).findElement(By.cssSelector(".example h3")).getText());
		System.out.println(driver.switchTo().window(par).findElement(By.cssSelector(".example h3")).getText());

		driver.quit();
	}
}
