package ActionsWindowsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		//Input in caps and select
		WebElement caps = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(caps).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Move to element and right-click
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		
		}
}
