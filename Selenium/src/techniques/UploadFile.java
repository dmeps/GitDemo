package techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[class*='g-btn--choose']")).click();
		Thread.sleep(3000);
		//invoke AutoIT script from system
		Runtime.getRuntime().exec("d:\\Income\\UploadFile.exe");
	}

}