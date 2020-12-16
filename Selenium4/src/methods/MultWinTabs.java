package methods;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultWinTabs {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		String txt = driver.findElement(By.cssSelector(".row.clearfix div:nth-child(1) h2")).getText();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		driver.switchTo().window(parent);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(txt);
		//Screenshot of WebElement
		File src = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Income/scr.jpg"));
		//Dimension of WebElement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
	}
}
