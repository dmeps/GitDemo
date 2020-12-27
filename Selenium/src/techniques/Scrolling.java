package techniques;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		//page scrolling
		jse.executeScript("window.scrollBy(0, 500)"); // script run in Chrome's console
		Thread.sleep(1000);
		//component scrolling
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop = 500"); //scrollLeft for horizontal scrolling
	}

}
